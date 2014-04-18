/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.dao.impl;

import com.nms.football.dao.TeamDao;
import com.nms.football.exception.FootballGetterException;
import com.nms.football.model.Team;
import com.nms.football.util.DataSourceHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cuong
 */
public class TeamDaoImpl extends BaseDaoImpl<Team> implements TeamDao {

    private static final Logger _logger = Logger.getLogger(TeamDaoImpl.class.getName());

    @Override
    protected void processSaveOrUpdate(Connection conn, PreparedStatement pstm, List<Team> entities) throws SQLException {
        String sql = "MERGE INTO "
                + "team a "
                + "USING "
                + "(select ? teamid, ? name,? country,? stadium,? homepageurl,? wikilink from dual) b "
                + "ON (a.teamId = b.teamid) "
                + "WHEN MATCHED THEN UPDATE "
                + "SET "
                + "a.name = b.name, "
                + "a.country = b.country, "
                + "a.stadium = b.stadium, "
                + "a.homepageurl = b.homepageurl, "
                + "a.wikilink = b.wikilink "
                + "WHEN NOT MATCHED THEN "
                + "INSERT (teamId,name, country, stadium, homepageurl, wikilink) "
                + "VALUES (b.teamId, b.name, b.country, b.stadium, b.homepageurl,b.wikilink)";
        pstm = conn.prepareStatement(sql);

        int batchSize = 100;

        for (int count = 0; count < entities.size(); count++) {
            Team team = entities.get(count);

            pstm.setInt(1, team.getId());
            pstm.setString(2, team.getName());
            pstm.setString(3, team.getCountry());
            pstm.setString(4, team.getStadium());
            pstm.setString(5, team.getHomeLinkUrl());
            pstm.setString(6, team.getWikiLink());

            pstm.addBatch();

            if (count % batchSize == 0) {
                pstm.executeBatch();
            }
        }
        pstm.executeBatch();
    }

    @Override
    public void updateWithLeagueAndSession(int leagueId, String session, List<Team> teams) {
        if (teams == null || teams.isEmpty()) {
            return;
        }

        String teamLeagueSql = "MERGE INTO teamleague a USING (SELECT ? teamId, ? leagueId, ? season from dual) b "
                + "ON (a.teamId = b.teamId and a.leagueId = b.leagueId and a.season = b.season) WHEN NOT MATCHED THEN "
                + "INSERT (teamId, leagueId, season) VALUES (b.teamId,b.leagueId, b.season)";
        Connection conn = null;
        PreparedStatement ps = null;

        try {

            conn = DataSourceHelper.createConnection();
            conn.setAutoCommit(false);
            int batchSize = 100;
            // Save team infomation.
            processSaveOrUpdate(conn, ps, teams);

            // Save teamLeague infomation.
            ps = conn.prepareStatement(teamLeagueSql);
            for (int i = 0; i < teams.size(); i++) {
                Team team = teams.get(i);
                
                ps.setInt(1, team.getId());
                ps.setInt(2, leagueId);
                ps.setString(3, session);
                
                ps.addBatch();
                
                if (i % batchSize == 0) {
                    ps.executeBatch();
                }
            }
            
            ps.executeBatch();
            
            conn.commit();
        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    _logger.log(Level.SEVERE, "Cannot rollback connection", ex);
                    throw new FootballGetterException("Cannot rollback connection", ex);
                }
            }
            _logger.log(Level.SEVERE, "Error when update teams by session and leagueID", e);
            throw new FootballGetterException("Error when update teams by session and leagueID", e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    _logger.log(Level.SEVERE, "Cannot close connection", ex);
                }

                if (ps != null) {
                    try {
                        ps.close();
                    } catch (SQLException ex) {
                        _logger.log(Level.SEVERE, "Cannot close preparedStatment", ex);
                    }
                }
            }
        }
    }
}

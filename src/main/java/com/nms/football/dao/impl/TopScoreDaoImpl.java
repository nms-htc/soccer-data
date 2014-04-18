/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.dao.impl;

import com.nms.football.dao.TopScoreDao;
import com.nms.football.model.TopScore;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Cuong
 */
public class TopScoreDaoImpl extends BaseDaoImpl<TopScore> implements TopScoreDao {

    @Override
    protected void processSaveOrUpdate(Connection conn, PreparedStatement pstm, List<TopScore> entities) throws SQLException {
        
        int batchSize = 100;

        String sql = "MERGE INTO topscore a "
                + "USING (SELECT ? leagueid, ? season, ? rank, ? name, ? teamname, ? teamid, ? nationality, ? goals,"
                + "? firstscore, ? penatiles, ? mispenatiles from dual) b "
                + "ON (a.leagueid = b.leagueid and a.season = b.season and a.name = b.name and a.teamname = b.teamname) "
                + "WHEN MATCHED THEN "
                + "UPDATE SET "
                + "a.rank = b.rank, a.teamid = b.teamid, a.nationality = b.nationality,"
                + "a.goals = b.goals, a.firstscore = b.firstscore, a.penatiles = b.penatiles, a.mispenatiles = b.mispenatiles "
                + "WHEN NOT MATCHED THEN "
                + "INSERT (leagueid, season, rank, name, teamname, teamid, nationality, goals, firstscore, penatiles, mispenatiles) "
                + "VALUES (b.leagueid, b.season, b.rank, b.name, b.teamname, b.teamid, b.nationality, b.goals, b.firstscore, b.penatiles, b.mispenatiles)";
        pstm = conn.prepareStatement(sql);

        for (int count = 0; count < entities.size(); count ++) {
            TopScore topScore = entities.get(count);
            
            pstm.setInt(1, topScore.getLeagueId());
            pstm.setString(2, topScore.getSession());
            pstm.setInt(3, topScore.getRank());
            pstm.setString(4, topScore.getName());
            pstm.setString(5, topScore.getTeamName());
            pstm.setInt(6, topScore.getTeamId());
            pstm.setString(7, topScore.getNationality());
            pstm.setInt(8, topScore.getGoals());
            pstm.setInt(9, topScore.getFirstSoccer());
            pstm.setInt(10, topScore.getPenalties());
            pstm.setInt(11, topScore.getMissedPenalties());
            
            pstm.addBatch();
            
            if (count % batchSize == 0) {
                pstm.executeBatch();
            }
        }
        
        pstm.executeBatch();
    }
}

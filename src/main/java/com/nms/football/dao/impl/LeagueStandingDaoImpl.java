/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.dao.impl;

import com.nms.football.dao.LeagueStandingDao;
import com.nms.football.model.LeagueStanding;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Tiger_Cave
 */
public class LeagueStandingDaoImpl extends BaseDaoImpl<LeagueStanding> implements LeagueStandingDao {

    @Override
    protected void processSaveOrUpdate(Connection conn, PreparedStatement pstm, List<LeagueStanding> entities) throws SQLException {
        String sql = "MERGE INTO "
                + "LeagueStanding a "
                + "USING "
                + "(SELECT ? leagueId, ? season, ? team, ? teamId, ? played, ? playedAtHome, ? playedAway, ? won, ? draw, ? lost, ? goalsFor, ? goalsAgainst, ? goalsDifference, ? points FROM dual) b "
                + "ON ((a.teamId = b.teamId) AND (a.leagueId = b.leagueId) AND (a.season = b.season)) "
                + "WHEN MATCHED THEN UPDATE "
                + "SET "
                + "a.team = b.team,a.played = b.played,a.playedAtHome = b.playedAtHome,a.playedAway = b.playedAway,a.won = b.won,a.draw = b.draw,a.lost = b.lost,a.goalsFor = b.goalsFor,a.goalsAgainst = b.goalsAgainst,a.goalsDifference = b.goalsDifference,a.points = b.points "
                + "WHEN NOT MATCHED THEN "
                + "INSERT (leagueId, season, team, teamId, played, playedAtHome, playedAway, won, draw, lost, goalsFor, goalsAgainst, goalsDifference, points) "
                + "VALUES (b.leagueId, b.season, b.team, b.teamId, b.played, b.playedAtHome, b.playedAway, b.won, b.draw, b.lost, b.goalsFor, b.goalsAgainst, b.goalsDifference, b.points)";
        pstm = conn.prepareStatement(sql);

        int batchSize = 100;

        for (int count = 0; count < entities.size(); count++) {

            LeagueStanding standing = entities.get(count);

            pstm.setInt(1, standing.getLeagueId());
            pstm.setString(2, standing.getSeason());
            pstm.setString(3, standing.getTeam());
            pstm.setInt(4, standing.getTeamId());
            pstm.setInt(5, standing.getPlayed());
            pstm.setInt(6, standing.getPlayedAtHome());
            pstm.setInt(7, standing.getPlayedAway());
            pstm.setInt(8, standing.getWon());
            pstm.setInt(9, standing.getDraw());
            pstm.setInt(10, standing.getLost());
            pstm.setInt(11, standing.getGoalsFor());
            pstm.setInt(12, standing.getGoalsAgainst());
            pstm.setInt(13, standing.getGoalsDifference());
            pstm.setInt(14, standing.getPoints());

            pstm.addBatch();

            if (count % batchSize == 0) {
                pstm.executeBatch();
            }
        }

        pstm.executeBatch();
    }

}

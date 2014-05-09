/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.dao.impl;

import com.nms.football.dao.FixtureHistoryDao;
import com.nms.football.model.FixtureHistory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author Cuong
 */
public class FixtureHistoryDaoImpl extends BaseDaoImpl<FixtureHistory> implements FixtureHistoryDao {

    @Override
    protected void processSaveOrUpdate(Connection conn, PreparedStatement pstm, List<FixtureHistory> entities) throws SQLException {
        String sql = "MERGE INTO matchhistory a "
                + "USING (SELECT ? id, ? fixtureid, ? matchdate, ? round, ? spectators, ? league, ? hometeam, "
                + "? hometeamid, ? homecorners, ? homegoals, ? halftimehomegoals, ? homeshorts, ? homeshortontarget, "
                + "? homefauls, ? homegoaldetails, ? homelineupgoalkeeper, ? homelineupdefense, ? homelineupmidfield, "
                + "? homelineupforward, ? homelineupsubstitutes, ? homelineupcoach, ? homeyellowcards, ? homeredcards, "
                + "? hometeamformation, ? awayteam, ? awayteamid, ? awaycorners, ? awaygoals, ? halftimeawaygoals, "
                + "? awayshorts, ? awayshortontarget, ? awayfauls, ? awaygoaldetails, ? awaylineupgoalkeeper, ? awaylineupdefense, "
                + "? awaylineupmidfield, ? awaylineupforward, ? awaylineupsubstitutes, ? awaylineupcoach, "
                + "? awayyellowcards, ? awayredcards, ? awayteamformation, ? hometeamyellowcarddetails, "
                + "? awayteamyellowcarddetails, ? hometeamredcarddetails, ? awayteamredcarddetails, ? homesubdetails, "
                + "? awaysubdetails from dual) b "
                + "ON (a.id = b.id) "
                + "WHEN MATCHED THEN "
                + "UPDATE SET a.fixtureid = b.fixtureid, a.matchdate = b.matchdate, a.round = b.round, "
                + "a.spectators = b.spectators, a.league = b.league, a.hometeam = b.hometeam, a.hometeamid = b.hometeamid, "
                + "a.homecorners = b.homecorners, a.homegoals = b.homegoals, a.halftimehomegoals = b.halftimehomegoals, "
                + "a.homeshorts = b.homeshorts, a.homeshortontarget = b.homeshortontarget, a.homefauls = b.homefauls, "
                + "a.homegoaldetails = b.homegoaldetails, a.homelineupgoalkeeper = b.homelineupgoalkeeper, "
                + "a.homelineupdefense = b.homelineupdefense, a.homelineupmidfield = b.homelineupmidfield, "
                + "a.homelineupforward = b.homelineupforward, a.homelineupsubstitutes = b.homelineupsubstitutes, "
                + "a.homelineupcoach = b.homelineupcoach, a.homeyellowcards = b.homeyellowcards, "
                + "a.homeredcards = b.homeredcards, a.hometeamformation = b.hometeamformation, a.awayteam = b.awayteam, "
                + "a.awayteamid = b.awayteamid, a.awaycorners = b.awaycorners, a.awaygoals = b.awaygoals, "
                + "a.halftimeawaygoals = b.halftimeawaygoals, a.awayshorts = b.awayshorts, "
                + "a.awayshortontarget = b.awayshortontarget, a.awayfauls = b.awayfauls, a.awaygoaldetails = b.awaygoaldetails, "
                + "a.awaylineupgoalkeeper = b.awaylineupgoalkeeper, a.awaylineupdefense = b.awaylineupdefense, "
                + "a.awaylineupmidfield = b.awaylineupmidfield, a.awaylineupforward = b.awaylineupforward, "
                + "a.awaylineupsubstitutes = b.awaylineupsubstitutes, a.awaylineupcoach = b.awaylineupcoach, "
                + "a.awayyellowcards = b.awayyellowcards, a.awayredcards = b.awayredcards, "
                + "a.awayteamformation = b.awayteamformation, a.hometeamyellowcarddetails = b.hometeamyellowcarddetails, "
                + "a.awayteamyellowcarddetails = b.awayteamyellowcarddetails, "
                + "a.hometeamredcarddetails = b.hometeamredcarddetails, a.awayteamredcarddetails = b.awayteamredcarddetails, "
                + "a.homesubdetails = b.homesubdetails, a.awaysubdetails = b.awaysubdetails "
                + "WHEN NOT MATCHED THEN "
                + "INSERT (id, fixtureid, matchdate, round, spectators, league, hometeam, hometeamid, homecorners, "
                + "homegoals, halftimehomegoals, homeshorts, homeshortontarget, homefauls, homegoaldetails, "
                + "homelineupgoalkeeper, homelineupdefense, homelineupmidfield, homelineupforward, homelineupsubstitutes, "
                + "homelineupcoach, homeyellowcards, homeredcards, hometeamformation, awayteam, awayteamid, awaycorners, "
                + "awaygoals, halftimeawaygoals, awayshorts, awayshortontarget, awayfauls, awaygoaldetails, awaylineupgoalkeeper, "
                + "awaylineupdefense, awaylineupmidfield, awaylineupforward, awaylineupsubstitutes, awaylineupcoach, "
                + "awayyellowcards, awayredcards, awayteamformation, hometeamyellowcarddetails, awayteamyellowcarddetails, "
                + "hometeamredcarddetails, awayteamredcarddetails, homesubdetails, awaysubdetails) "
                + "VALUES (b.id, b.fixtureid, b.matchdate, b.round, b.spectators, b.league, b.hometeam, b.hometeamid, "
                + "b.homecorners, b.homegoals, b.halftimehomegoals, b.homeshorts, b.homeshortontarget, b.homefauls, "
                + "b.homegoaldetails, b.homelineupgoalkeeper, b.homelineupdefense, b.homelineupmidfield, "
                + "b.homelineupforward, b.homelineupsubstitutes, b.homelineupcoach, b.homeyellowcards, b.homeredcards, "
                + "b.hometeamformation, b.awayteam, b.awayteamid, b.awaycorners, b.awaygoals, b.halftimeawaygoals, "
                + "b.awayshorts, b.awayshortontarget, b.awayfauls, b.awaygoaldetails, b.awaylineupgoalkeeper, b.awaylineupdefense, "
                + "b.awaylineupmidfield, b.awaylineupforward, b.awaylineupsubstitutes, b.awaylineupcoach, "
                + "b.awayyellowcards, b.awayredcards, b.awayteamformation, b.hometeamyellowcarddetails, "
                + "b.awayteamyellowcarddetails, b.hometeamredcarddetails, b.awayteamredcarddetails, b.homesubdetails, "
                + "b.awaysubdetails)";
        pstm = conn.prepareStatement(sql);

        int batchSize = 100;

        for (int count = 0; count < entities.size(); count++) {
            FixtureHistory f = entities.get(count);

            pstm.setInt(1, f.getId());
            pstm.setInt(2, f.getFixtureId());
            pstm.setTimestamp(3, new Timestamp(f.getDate().getTime()));
            pstm.setInt(4, f.getRound());
            pstm.setInt(5, f.getSpectators());
            pstm.setString(6, f.getLeague());
            pstm.setString(7, f.getHomeTeam());
            pstm.setInt(8, f.getHomeTeamId());
            pstm.setInt(9, f.getHomeCorners());
            pstm.setInt(10, f.getHomeGoals());
            pstm.setInt(11, f.getHalfTimeHomeGoals());
            pstm.setInt(12, f.getHomeShorts());
            pstm.setInt(13, f.getHomeShortOnTarget());
            pstm.setInt(14, f.getHomeFauls());
            pstm.setString(15, f.getHomeGoalDetails());
            pstm.setString(16, f.getHomeLineupGoalkeeper());
            pstm.setString(17, f.getHomeLineupDefense());
            pstm.setString(18, f.getHomeLineupMidfield());
            pstm.setString(19, f.getHomeLineupForward());
            pstm.setString(20, f.getHomeLineupSubstitutes());
            pstm.setString(21, f.getHomeLineupCoach());
            pstm.setInt(22, f.getHomeYellowCards());
            pstm.setInt(23, f.getHomeRedCards());
            pstm.setString(24, f.getHomeTeamFormation());
            pstm.setString(25, f.getAwayTeam());
            pstm.setInt(26, f.getAwayTeamId());
            pstm.setInt(27, f.getAwayCorners());
            pstm.setInt(28, f.getAwayGoals());
            pstm.setInt(29, f.getHalfTimeAwayGoals());
            pstm.setInt(30, f.getAwayShorts());
            pstm.setInt(31, f.getAwayShortOnTarget());
            pstm.setInt(32, f.getAwayFauls());
            pstm.setString(33, f.getAwayGoalDetais());
            pstm.setString(34, f.getAwayLineupGoalkeeper());
            pstm.setString(35, f.getAwayLineupDefense());
            pstm.setString(36, f.getAwayLineupMidfield());
            pstm.setString(37, f.getAwayLineupForward());
            pstm.setString(38, f.getAwayLineupSubsitutes());
            pstm.setString(39, f.getAwayLineupCoach());
            pstm.setInt(40, f.getAwayYellowCards());
            pstm.setInt(41, f.getAwayRedCards());
            pstm.setString(42, f.getAwayTeamFormation());
            pstm.setString(43, f.getHomeTeamYellowCardDetails());
            pstm.setString(44, f.getAwayTeamYellowCardDetails());
            pstm.setString(45, f.getHomeTeamRedCardDetails());
            pstm.setString(46, f.getAwayTeamRedCardDetails());
            pstm.setString(47, f.getHomeSubDetails());
            pstm.setString(48, f.getAwaySubDetails());

            pstm.addBatch();

            if (count % batchSize == 0) {
                pstm.executeBatch();
            }
        }

        pstm.executeBatch();
    }
}

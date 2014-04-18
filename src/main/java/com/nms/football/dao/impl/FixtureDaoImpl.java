/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.dao.impl;

import com.nms.football.dao.FixtureDao;
import com.nms.football.model.Fixture;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;

/**
 *
 * @author Cuong
 */
public class FixtureDaoImpl extends BaseDaoImpl<Fixture> implements FixtureDao {

    @Override
    protected void processSaveOrUpdate(Connection conn, PreparedStatement pstm, List<Fixture> entities) throws SQLException {
        String sql = "MERGE INTO matchfixture a "
                + "USING (SELECT ? id, ? league, ? matchdate, ? round, ? spectators, ? hometeam, ? hometeamid, ? homegoals, ? awayteam, "
                + "? awayteamid,? awaygoals, ? time, ? location, ? homegoaldetails, ? awaygoaldetails, "
                + "? homelineupgoalkeeper, ? awaylineupgoalkeeper, ? homelineupdefense, ? awaylineupdefense, "
                + "? homelineupmidfield, ? awaylineupmidfield, ? homelineupforward, ? awaylineupforward, "
                + "? homelineupsubstitutes, ? awaylineupsubstitutes, ? homelineupcoach, ? awaylineupcoach, "
                + "? homesubdetails, ? awaysubdetails, ? hometeamformation, ? awayteamformation, ? stadium, "
                + "? hometeamyellowcarddetails, ? awayteamyellowcarddetails, ? hometeamredcarddetails, "
                + "? awayteamredcarddetails from dual) b "
                + "ON (a.id = b.id) "
                + "WHEN MATCHED THEN "
                + "UPDATE SET a.league = b.league, a.matchdate = b.matchdate, a.round = b.round, a.spectators = b.spectators, a.hometeam = b.hometeam, "
                + "a.hometeamid = b.hometeamid, a.homegoals = b.homegoals, a.awayteam = b.awayteam, a.awayteamid = b.awayteamid, "
                + "a.awaygoals = b.awaygoals, a.time = b.time, a.location = b.location, a.homegoaldetails = b.homegoaldetails, "
                + "a.homelineupgoalkeeper = b.homelineupgoalkeeper, a.awaylineupgoalkeeper = b.awaylineupgoalkeeper, "
                + "a.homelineupdefense = b.homelineupdefense, a.awaylineupdefense = b.awaylineupdefense, "
                + "a.homelineupmidfield = b.homelineupmidfield, a.awaylineupmidfield = b.awaylineupmidfield, "
                + "a.homelineupforward = b.homelineupforward, a.awaylineupforward = b.awaylineupforward, "
                + "a.homelineupsubstitutes = b.homelineupsubstitutes, a.awaylineupsubstitutes = b.awaylineupsubstitutes, "
                + "a.homelineupcoach = b.homelineupcoach, a.awaylineupcoach = b.awaylineupcoach, "
                + "a.homesubdetails = b.homesubdetails, a.awaysubdetails = b.awaysubdetails, a.hometeamformation = b.hometeamformation, "
                + "a.awayteamformation = b.awayteamformation, a.stadium = b.stadium, a.hometeamyellowcarddetails = b.hometeamyellowcarddetails, "
                + "a.awayteamyellowcarddetails = b.awayteamyellowcarddetails, a.hometeamredcarddetails = b.hometeamredcarddetails, "
                + "a.awayteamredcarddetails = b.awayteamredcarddetails "
                + "WHEN NOT MATCHED THEN "
                + "INSERT (id, league, matchdate, round, spectators, hometeam, hometeamid, homegoals, awayteam, awayteamid, awaygoals, "
                + "time, location, homegoaldetails, awaygoaldetails, homelineupgoalkeeper, awaylineupgoalkeeper, homelineupdefense, awaylineupdefense, "
                + "homelineupmidfield, awaylineupmidfield, homelineupforward, awaylineupforward, homelineupsubstitutes, awaylineupsubstitutes, homelineupcoach, awaylineupcoach, "
                + "homesubdetails, awaysubdetails, hometeamformation, awayteamformation, stadium, hometeamyellowcarddetails, awayteamyellowcarddetails, "
                + "hometeamredcarddetails, awayteamredcarddetails) "
                + "VALUES (b.id, b.league, b.matchdate, b.round, b.spectators, b.hometeam, b.hometeamid, b.homegoals, b.awayteam, b.awayteamid, b.awaygoals, "
                + "b.time, b.location, b.homegoaldetails, b.awaygoaldetails, b.homelineupgoalkeeper, b.awaylineupgoalkeeper, b.homelineupdefense, b.awaylineupdefense, "
                + "b.homelineupmidfield, b.awaylineupmidfield, b.homelineupforward, b.awaylineupforward, b.homelineupsubstitutes, b.awaylineupsubstitutes, b.homelineupcoach, b.awaylineupcoach, "
                + "b.homesubdetails, b.awaysubdetails, b.hometeamformation, b.awayteamformation, b.stadium, b.hometeamyellowcarddetails, b.awayteamyellowcarddetails, "
                + "b.hometeamredcarddetails, b.awayteamredcarddetails)";
        pstm = conn.prepareStatement(sql);
        
        int batchSize = 100;
        
        for (int count = 0; count < entities.size(); count++) {
            
            Fixture f = entities.get(count);
            
            pstm.setInt(1, f.getId());
            pstm.setString(2, f.getLeague());
            pstm.setTimestamp(3, new Timestamp(f.getDate().getTime()));
            pstm.setInt(4, f.getRound());
            pstm.setInt(5, f.getSpectators());
            pstm.setString(6, f.getHomeTeam());
            pstm.setInt(7, f.getHomeTeamId());
            pstm.setInt(8, f.getHomeGoals());
            pstm.setString(9, f.getAwayTeam());
            pstm.setInt(10, f.getAwayTeamId());
            pstm.setInt(11, f.getAwayGoals());
            pstm.setString(12, f.getTime());
            pstm.setString(13, f.getLocation());
            pstm.setString(14, f.getHomeGoalDetals());
            pstm.setString(15, f.getAwayGoalDetails());
            pstm.setString(16, f.getHomeLineupGoalkeeper());
            pstm.setString(17, f.getAwayLineupGoalKeeper());
            pstm.setString(18, f.getHomeLineupDefense());
            pstm.setString(19, f.getAwayLineupDefense());
            pstm.setString(20, f.getHomeLineupMidfield());
            pstm.setString(21, f.getAwayLineupMidfield());
            pstm.setString(22, f.getHomeLineupForward());
            pstm.setString(23, f.getAwayLineupForward());
            pstm.setString(24, f.getHomeLineupSubstitutes());
            pstm.setString(25, f.getAwayLineupSubstitutes());
            pstm.setString(26, f.getHomeLineupCoach());
            pstm.setString(27, f.getAwayLineupCoach());
            pstm.setString(28, f.getHomeSubDetails());
            pstm.setString(29, f.getAwaySubDetails());
            pstm.setString(30, f.getHomeTeamFormation());
            pstm.setString(31, f.getAwayTeamFormation());
            pstm.setString(32, f.getStadium());
            pstm.setString(33, f.getHomeTeamYellowCardDetails());
            pstm.setString(34, f.getAwayTeamYellowCardDetails());
            pstm.setString(35, f.getHomeTeamRedCardDetails());
            pstm.setString(36, f.getAwayTeamRedCardDetails());
            
            pstm.addBatch();
            
            if (count % batchSize == 0) {
                pstm.executeBatch();
            }
        }
        
        pstm.executeBatch();     
    }
}

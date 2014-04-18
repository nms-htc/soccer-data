/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.xmlsoccer;

import com.nms.football.model.Fixture;
import com.nms.football.model.FixtureHistory;
import com.nms.football.model.League;
import com.nms.football.model.Team;
import com.nms.football.model.TopScore;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Cuong
 */
public interface XmlSoccerService {

    public String checkApiKey();

    public List<League> getAllLeagues();

    public List<Team> getAllTeams();

    public List<Team> getAllTeamByLeagueAndSession(int leagueId, String session);

    public Date getEarliesMatchDatePerLeague(int leagueId);

    public List<Fixture> getFixtureByDateInteval(Date startDate, Date endDate);

    public List<Fixture> getFixtureByDateIntevalAndLeague(int leagueId, Date startDate, Date endDate);

    public List<Fixture> getFixturesByDateIntervalAndTeam(int teamId, Date startDate, Date endDate);

    public List<Fixture> getFixturesByLeagueAndSeason(int leagueId, String session);

    public FixtureHistory getHistoricMatchesByFixtureMatchId(int fixtureId);

    public FixtureHistory getHistoricMatchesByID(int fixtureHistoryId);

    public List<FixtureHistory> getHistoricMatchesByLeagueAndDateInterval(int leagueId, Date startDate, Date endDate);
    
    public List<FixtureHistory> getHistoricMatchesByLeagueAndSeason(int leagueId, String session);
    
    public List<FixtureHistory> getHistoricMatchesByTeamAndDateInterval(int teamId, Date startDate, Date endDate);
    
    public List<Fixture> getLiveScore();
    
    public List<Fixture> getLiveScoreByLeague(int leagueId);
    
    public String getOddsByFixtureMatchId(int fixtureId);
    
    public String getOddsByFixtureMatchId2(int fixtureId);
    
    public List<TopScore> getTopScorersByLeagueAndSeason(int leagueId, String session);
}

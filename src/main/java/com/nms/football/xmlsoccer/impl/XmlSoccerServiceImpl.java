/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.xmlsoccer.impl;

import com.nms.football.model.Fixture;
import com.nms.football.model.FixtureHistory;
import com.nms.football.model.League;
import com.nms.football.model.LeagueStanding;
import com.nms.football.model.Team;
import com.nms.football.model.TopScore;
import com.nms.football.util.ConvertUtils;
import com.nms.football.xmlsoccer.XmlSoccerService;
import com.nms.football.xmlsoccer.saxhandler.FixtureHistorySaxHandler;
import com.nms.football.xmlsoccer.saxhandler.FixtureSaxHandler;
import com.nms.football.xmlsoccer.saxhandler.LeagueSaxHandler;
import com.nms.football.xmlsoccer.saxhandler.LeagueStandingSaxHandler;
import com.nms.football.xmlsoccer.saxhandler.TeamSaxHandler;
import com.nms.football.xmlsoccer.saxhandler.TopScoreSaxHandler;
import com.nms.football.xmlsoccer.util.ParserTemplate;
import com.nms.football.xmlsoccer.util.XmlSoccerConstants;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Cuong
 */
public class XmlSoccerServiceImpl implements XmlSoccerService {

    @Override
    public String checkApiKey() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<League> getAllLeagues() {
        ParserTemplate<League> parserTeamplate = new ParserTemplate<League>();
        LeagueSaxHandler saxHandler = new LeagueSaxHandler();
        return parserTeamplate.get(XmlSoccerConstants.GET_ALL_LEAGUES_URL, saxHandler);
    }

    @Override
    public List<Team> getAllTeams() {
        ParserTemplate<Team> parserTemplate = new ParserTemplate<Team>();
        TeamSaxHandler saxHandler = new TeamSaxHandler();
        return parserTemplate.get(XmlSoccerConstants.GET_ALL_TEAMS_URL, saxHandler);
    }

    @Override
    public List<Team> getAllTeamByLeagueAndSession(int leagueId, String session) {
        String url = String.format(XmlSoccerConstants.GET_ALL_TEAM_BY_LEAGUE_AND_SESSION_TMP, leagueId, session);
        ParserTemplate<Team> parserTemplate = new ParserTemplate<Team>();
        TeamSaxHandler saxHandler = new TeamSaxHandler();
        return parserTemplate.get(url, saxHandler);
    }

    @Override
    public Date getEarliesMatchDatePerLeague(int leagueId) {
        //TODO: implement this method.
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Fixture> getFixtureByDateInteval(Date startDate, Date endDate) {
        String startDateString = ConvertUtils.formatDateToString(startDate);
        String endDateString = ConvertUtils.formatDateToString(endDate);
        String url = String.format(XmlSoccerConstants.GET_FIXTURES_BY_DATE_INTERVAL_TMP, startDateString, endDateString);

        ParserTemplate<Fixture> parserTemplate = new ParserTemplate<Fixture>();
        FixtureSaxHandler saxHandler = new FixtureSaxHandler();

        return parserTemplate.get(url, saxHandler);
    }

    @Override
    public List<Fixture> getFixtureByDateIntevalAndLeague(int leagueId, Date startDate, Date endDate) {
        String startDateString = ConvertUtils.formatDateToString(startDate);
        String endDateString = ConvertUtils.formatDateToString(endDate);
        String url = String.format(XmlSoccerConstants.GET_FIXTURES_BY_DATE_INTERVAL_AND_LEAGUE_TMP, leagueId, startDateString, endDateString);

        ParserTemplate<Fixture> parserTemplate = new ParserTemplate<Fixture>();
        FixtureSaxHandler saxHandler = new FixtureSaxHandler();

        return parserTemplate.get(url, saxHandler);
    }

    @Override
    public List<Fixture> getFixturesByDateIntervalAndTeam(int teamId, Date startDate, Date endDate) {
        String startDateString = ConvertUtils.formatDateToString(startDate);
        String endDateString = ConvertUtils.formatDateToString(endDate);
        String url = String.format(XmlSoccerConstants.GET_FIXTURES_BY_DATE_INTERVAL_AND_TEAM_TMP, startDateString, endDateString, teamId);

        ParserTemplate<Fixture> parserTemplate = new ParserTemplate<Fixture>();
        FixtureSaxHandler saxHandler = new FixtureSaxHandler();

        return parserTemplate.get(url, saxHandler);
    }

    @Override
    public List<Fixture> getFixturesByLeagueAndSeason(int leagueId, String session) {
        String url = String.format(XmlSoccerConstants.GET_FIXTURES_BY_LEAGUE_AND_SESSION_TMP, session, leagueId);

        ParserTemplate<Fixture> parserTemplate = new ParserTemplate<Fixture>();
        FixtureSaxHandler saxHandler = new FixtureSaxHandler();

        return parserTemplate.get(url, saxHandler);
    }

    @Override
    public FixtureHistory getHistoricMatchesByFixtureMatchId(int fixtureId) {
        String url = String.format(XmlSoccerConstants.GET_HISTORIC_MATCHES_BY_FIXTURED_ID_TMP, fixtureId);

        ParserTemplate<FixtureHistory> parserTemplate = new ParserTemplate<FixtureHistory>();
        FixtureHistorySaxHandler saxHandler = new FixtureHistorySaxHandler();
        List<FixtureHistory> list = parserTemplate.get(url, saxHandler);
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public FixtureHistory getHistoricMatchesByID(int fixtureHistoryId) {
        String url = String.format(XmlSoccerConstants.GET_HISTORIC_MATCHES_BY_ID_TMP, fixtureHistoryId);

        ParserTemplate<FixtureHistory> parserTemplate = new ParserTemplate<FixtureHistory>();
        FixtureHistorySaxHandler saxHandler = new FixtureHistorySaxHandler();
        List<FixtureHistory> list = parserTemplate.get(url, saxHandler);
        if (list != null && !list.isEmpty()) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<FixtureHistory> getHistoricMatchesByLeagueAndDateInterval(int leagueId, Date startDate, Date endDate) {
        String startDateString = ConvertUtils.formatDateToString(startDate);
        String endDateString = ConvertUtils.formatDateToString(endDate);
        String url = String.format(XmlSoccerConstants.GET_HISTORIC_MATCHES_BY_LEAGUE_AND_DATE_INTERVAL_TMP, leagueId, startDateString, endDateString);

        ParserTemplate<FixtureHistory> parserTemplate = new ParserTemplate<FixtureHistory>();
        FixtureHistorySaxHandler saxHandler = new FixtureHistorySaxHandler();

        return parserTemplate.get(url, saxHandler);
    }

    @Override
    public List<FixtureHistory> getHistoricMatchesByLeagueAndSeason(int leagueId, String session) {
        String url = String.format(XmlSoccerConstants.GET_HISTORIC_MATCHES_BY_LEAGUE_AND_SESSION_TMP, leagueId, session);

        ParserTemplate<FixtureHistory> parserTemplate = new ParserTemplate<FixtureHistory>();
        FixtureHistorySaxHandler saxHandler = new FixtureHistorySaxHandler();

        return parserTemplate.get(url, saxHandler);
    }

    @Override
    public List<FixtureHistory> getHistoricMatchesByTeamAndDateInterval(int teamId, Date startDate, Date endDate) {
        String startDateString = ConvertUtils.formatDateToString(startDate);
        String endDateString = ConvertUtils.formatDateToString(endDate);
        String url = String.format(XmlSoccerConstants.GET_HISTORIC_MATCHES_BY_TEAM_AND_DATE_INTERVAL_TMP, teamId, startDateString, endDateString);

        ParserTemplate<FixtureHistory> parserTemplate = new ParserTemplate<FixtureHistory>();
        FixtureHistorySaxHandler saxHandler = new FixtureHistorySaxHandler();

        return parserTemplate.get(url, saxHandler);
    }

    @Override
    public List<Fixture> getLiveScore() {
        ParserTemplate<Fixture> parserTemplate = new ParserTemplate<Fixture>();
        FixtureSaxHandler saxHandler = new FixtureSaxHandler();
        return parserTemplate.get(XmlSoccerConstants.GET_LIVESCORE_URL, saxHandler);
    }

    @Override
    public List<Fixture> getLiveScoreByLeague(int leagueId) {
        String url = String.format(XmlSoccerConstants.GET_LIVESCORE_BY_LEAGUE_TMP, leagueId);

        ParserTemplate<Fixture> parserTemplate = new ParserTemplate<Fixture>();
        FixtureSaxHandler saxHandler = new FixtureSaxHandler();

        return parserTemplate.get(url, saxHandler);
    }

    @Override
    public String getOddsByFixtureMatchId(int fixtureId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getOddsByFixtureMatchId2(int fixtureId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<TopScore> getTopScorersByLeagueAndSeason(int leagueId, String session) {
        String url = String.format(XmlSoccerConstants.GET_TOP_SCORE_BY_LEAGUE_AND_SESSION_TMP, leagueId, session);

        ParserTemplate<TopScore> parserTemplate = new ParserTemplate<TopScore>();
        TopScoreSaxHandler saxHandler = new TopScoreSaxHandler();

        List<TopScore> topScores = parserTemplate.get(url, saxHandler);

        for (TopScore topScore : topScores) {
            topScore.setLeagueId(leagueId);
            topScore.setSession(session);
        }

        return topScores;
    }

    @Override
    public List<LeagueStanding> getLeagueStandingBySeason(int leagueId, String season) {
        String url = String.format(XmlSoccerConstants.GET_LEAGUE_STANDING_BY_SEASON, leagueId, season);

        ParserTemplate<LeagueStanding> parserTemplate = new ParserTemplate<LeagueStanding>();
        LeagueStandingSaxHandler saxHandler = new LeagueStandingSaxHandler();

        List<LeagueStanding> leagueStandings = parserTemplate.get(url, saxHandler);

        for (LeagueStanding standing : leagueStandings) {
            standing.setSeason(season);
            standing.setLeagueId(leagueId);
        }

        return leagueStandings;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.facade.impl;

import com.nms.facade.FootballDataFacade;
import com.nms.football.dao.factory.DaoFactory;
import com.nms.football.model.Fixture;
import com.nms.football.model.FixtureHistory;
import com.nms.football.model.League;
import com.nms.football.model.LeagueStanding;
import com.nms.football.model.Team;
import com.nms.football.model.TopScore;
import com.nms.football.xmlsoccer.XmlSoccerService;
import com.nms.football.xmlsoccer.factory.XmlSoccerServiceFactory;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Cuong
 */
public class FootballDataFacadeImpl implements FootballDataFacade {

    private final XmlSoccerService xmlSoccerService = XmlSoccerServiceFactory.getService();

    @Override
    public void updateLeague() {
        List<League> leagues = xmlSoccerService.getAllLeagues();
        DaoFactory.getLeagueDao().saveOrUpdate(leagues);
    }

    @Override
    public void updateTeam() {
        List<Team> teams = xmlSoccerService.getAllTeams();
        DaoFactory.getTeamDao().saveOrUpdate(teams);
    }

    @Override
    public void updateTeamByLeagueAndSession(int leagueId, String session) {
        List<Team> teams = xmlSoccerService.getAllTeamByLeagueAndSession(leagueId, session);
        DaoFactory.getTeamDao().updateWithLeagueAndSession(leagueId, session, teams);
    }

    @Override
    public void updateFixtureByDateInterval(Date startDate, Date endDate) {
        List<Fixture> fixtures = xmlSoccerService.getFixtureByDateInteval(startDate, endDate);
        DaoFactory.getFixtureDao().saveOrUpdate(fixtures);
    }

    @Override
    public void updateFixtureByDateIntervalAndLeague(int leagueId, Date startDate, Date endDate) {
        List<Fixture> fixtures = xmlSoccerService.getFixturesByDateIntervalAndTeam(leagueId, startDate, endDate);
        DaoFactory.getFixtureDao().saveOrUpdate(fixtures);
    }

    @Override
    public void updateFixtureByDateIntervalAndTeam(int teamId, Date startDate, Date endDate) {
        List<Fixture> fixtures = xmlSoccerService.getFixturesByDateIntervalAndTeam(teamId, startDate, endDate);
        DaoFactory.getFixtureDao().saveOrUpdate(fixtures);
    }

    @Override
    public void updateFixtureByLeagueAndSession(int leagueId, String session) {
        List<Fixture> fixtures = xmlSoccerService.getFixturesByLeagueAndSeason(leagueId, session);
        DaoFactory.getFixtureDao().saveOrUpdate(fixtures);
    }

    @Override
    public void updateHistoricMatchesByFixtureMatchId(int fixtureId) {
        FixtureHistory fixtureHistory = xmlSoccerService.getHistoricMatchesByFixtureMatchId(fixtureId);

        if (fixtureHistory != null) {
            List<FixtureHistory> fixtureHistories = new ArrayList<FixtureHistory>();
            fixtureHistories.add(fixtureHistory);
            DaoFactory.getFixtureHistoryDao().saveOrUpdate(fixtureHistories);
        }
    }

    @Override
    public void updateHistoricMatchesById(int fixtureHistoryId) {
        FixtureHistory fixtureHistory = xmlSoccerService.getHistoricMatchesByID(fixtureHistoryId);

        if (fixtureHistory != null) {
            List<FixtureHistory> fixtureHistories = new ArrayList<FixtureHistory>();
            fixtureHistories.add(fixtureHistory);
            DaoFactory.getFixtureHistoryDao().saveOrUpdate(fixtureHistories);
        }
    }

    @Override
    public void updateHistoricMatchesByLeagueAndDateInterval(int leagueId, Date startDate, Date endDate) {
        List<FixtureHistory> fixtureHistories = xmlSoccerService.getHistoricMatchesByLeagueAndDateInterval(leagueId, startDate, endDate);
        DaoFactory.getFixtureHistoryDao().saveOrUpdate(fixtureHistories);
    }

    @Override
    public void updateHistoricMatchesByLeagueAndSession(int leagueId, String session) {
        List<FixtureHistory> fixtureHistories = xmlSoccerService.getHistoricMatchesByLeagueAndSeason(leagueId, session);
        DaoFactory.getFixtureHistoryDao().saveOrUpdate(fixtureHistories);
    }

    @Override
    public void updateHistoricMatchesByTeamAndDateInterval(int teamId, Date startDate, Date endDate) {
        List<FixtureHistory> fixtureHistories = xmlSoccerService.getHistoricMatchesByTeamAndDateInterval(teamId, startDate, endDate);
        DaoFactory.getFixtureHistoryDao().saveOrUpdate(fixtureHistories);
    }

    @Override
    public void updateLiveScore() {
        List<Fixture> fixtures = xmlSoccerService.getLiveScore();
        DaoFactory.getFixtureDao().saveOrUpdate(fixtures);
    }

    @Override
    public void updateLiveScoreByLeague(int leagueId) {
        List<Fixture> fixtures = xmlSoccerService.getLiveScoreByLeague(leagueId);
        DaoFactory.getFixtureDao().saveOrUpdate(fixtures);
    }

    @Override
    public void updateTopScoreByLeagueAndSession(int leagueId, String session) {
        List<TopScore> topScores = xmlSoccerService.getTopScorersByLeagueAndSeason(leagueId, session);
        DaoFactory.getTopScoreDao().saveOrUpdate(topScores);
    }

    @Override
    public void updateLeagueStandingByLeagueAndSeason(int leagueId, String season) {
        List<LeagueStanding> standings = xmlSoccerService.getLeagueStandingBySeason(leagueId, season);
        DaoFactory.getLeagueStandingDao().saveOrUpdate(standings);
    }
}

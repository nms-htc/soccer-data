/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.facade;

import java.util.Date;

/**
 *
 * @author Cuong
 */
public interface FootballDataFacade {

    public void updateLeague();

    public void updateTeam();

    public void updateTeamByLeagueAndSession(int leagueId, String session);

    public void updateFixtureByDateInterval(Date startDate, Date endDate);

    public void updateFixtureByDateIntervalAndLeague(int leagueId, Date startDate, Date endDate);

    public void updateFixtureByDateIntervalAndTeam(int teamId, Date startDate, Date endDate);

    public void updateFixtureByLeagueAndSession(int leagueId, String session);

    public void updateHistoricMatchesByFixtureMatchId(int fixtureId);

    public void updateHistoricMatchesById(int fixtureHistoryId);

    public void updateHistoricMatchesByLeagueAndDateInterval(int leagueId, Date startDate, Date endDate);

    public void updateHistoricMatchesByLeagueAndSession(int leagueId, String session);

    public void updateHistoricMatchesByTeamAndDateInterval(int teamId, Date startDate, Date endDate);

    public void updateLiveScore();

    public void updateLiveScoreByLeague(int leagueId);

    public void updateTopScoreByLeagueAndSession(int leagueId, String session);
}

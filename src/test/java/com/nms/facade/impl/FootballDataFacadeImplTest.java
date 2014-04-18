/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.facade.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Cuong
 */
public class FootballDataFacadeImplTest {

    public FootballDataFacadeImplTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Ignore
    @Test
    public void testUpdateLeague() {
        System.out.println("updateLeague");
        FootballDataFacadeImpl instance = new FootballDataFacadeImpl();
        instance.updateLeague();
    }

    @Ignore
    @Test
    public void testUpdateTeam() {
        System.out.println("updateTeam");
        FootballDataFacadeImpl instance = new FootballDataFacadeImpl();
        instance.updateTeam();
    }

    @Ignore
    @Test
    public void testUpdateTeamByLeagueAndSession() {
        System.out.println("updateTeamByLeagueAndSession");
        int leagueId = 3;
        String session = "1314";
        FootballDataFacadeImpl instance = new FootballDataFacadeImpl();
        instance.updateTeamByLeagueAndSession(leagueId, session);
    }

    @Test
    public void testUpdateFixtureByDateInterval() {
        System.out.println("updateFixtureByDateInterval");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date startDate;
        Date endDate;
        try {
            startDate = dateFormat.parse("2014-01-01");
            endDate = dateFormat.parse("2014-04-30");
            FootballDataFacadeImpl instance = new FootballDataFacadeImpl();
            instance.updateFixtureByDateInterval(startDate, endDate);
        } catch (ParseException e) {

        }
    }

    @Test
    public void testUpdateFixtureByDateIntervalAndLeague() {
        System.out.println("updateFixtureByDateIntervalAndLeague");
        int leagueId = 0;
        Date startDate = null;
        Date endDate = null;
        FootballDataFacadeImpl instance = new FootballDataFacadeImpl();
        instance.updateFixtureByDateIntervalAndLeague(leagueId, startDate, endDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateFixtureByDateIntervalAndTeam() {
        System.out.println("updateFixtureByDateIntervalAndTeam");
        int teamId = 0;
        Date startDate = null;
        Date endDate = null;
        FootballDataFacadeImpl instance = new FootballDataFacadeImpl();
        instance.updateFixtureByDateIntervalAndTeam(teamId, startDate, endDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateFixtureByLeagueAndSession() {
        System.out.println("updateFixtureByLeagueAndSession");
        int leagueId = 0;
        String session = "";
        FootballDataFacadeImpl instance = new FootballDataFacadeImpl();
        instance.updateFixtureByLeagueAndSession(leagueId, session);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateHistoricMatchesByFixtureMatchId() {
        System.out.println("updateHistoricMatchesByFixtureMatchId");
        int fixtureId = 0;
        FootballDataFacadeImpl instance = new FootballDataFacadeImpl();
        instance.updateHistoricMatchesByFixtureMatchId(fixtureId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateHistoricMatchesById() {
        System.out.println("updateHistoricMatchesById");
        int fixtureHistoryId = 0;
        FootballDataFacadeImpl instance = new FootballDataFacadeImpl();
        instance.updateHistoricMatchesById(fixtureHistoryId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateHistoricMatchesByLeagueAndDateInterval() {
        System.out.println("updateHistoricMatchesByLeagueAndDateInterval");
        int leagueId = 0;
        Date startDate = null;
        Date endDate = null;
        FootballDataFacadeImpl instance = new FootballDataFacadeImpl();
        instance.updateHistoricMatchesByLeagueAndDateInterval(leagueId, startDate, endDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateHistoricMatchesByLeagueAndSession() {
        System.out.println("updateHistoricMatchesByLeagueAndSession");
        int leagueId = 3;
        String session = "1314";
        FootballDataFacadeImpl instance = new FootballDataFacadeImpl();
        instance.updateHistoricMatchesByLeagueAndSession(leagueId, session);
    }

    @Test
    public void testUpdateHistoricMatchesByTeamAndDateInterval() {
        System.out.println("updateHistoricMatchesByTeamAndDateInterval");
        int teamId = 0;
        Date startDate = null;
        Date endDate = null;
        FootballDataFacadeImpl instance = new FootballDataFacadeImpl();
        instance.updateHistoricMatchesByTeamAndDateInterval(teamId, startDate, endDate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateLiveScore() {
        System.out.println("updateLiveScore");
        FootballDataFacadeImpl instance = new FootballDataFacadeImpl();
        instance.updateLiveScore();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testUpdateLiveScoreByLeague() {
        System.out.println("updateLiveScoreByLeague");
        int leagueId = 0;
        FootballDataFacadeImpl instance = new FootballDataFacadeImpl();
        instance.updateLiveScoreByLeague(leagueId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Ignore
    @Test
    public void testUpdateTopScoreByLeagueAndSession() {
        System.out.println("updateTopScoreByLeagueAndSession");
        int leagueId = 3;
        String session = "1314";
        FootballDataFacadeImpl instance = new FootballDataFacadeImpl();
        instance.updateTopScoreByLeagueAndSession(leagueId, session);
    }

}

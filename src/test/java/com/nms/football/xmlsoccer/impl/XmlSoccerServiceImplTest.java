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
import com.nms.football.xmlsoccer.XmlSoccerService;
import com.nms.football.xmlsoccer.factory.XmlSoccerServiceFactory;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 *
 * @author Cuong
 */
@Ignore
public class XmlSoccerServiceImplTest {

    public XmlSoccerServiceImplTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of checkApiKey method, of class XmlSoccerServiceImpl.
     */
    @Ignore
    @Test
    public void testCheckApiKey() {
        System.out.println("checkApiKey");
        XmlSoccerService instance = XmlSoccerServiceFactory.getService();
        String expResult = "";
        String result = instance.checkApiKey();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllLeagues method, of class XmlSoccerServiceImpl.
     */
    @Ignore
    @Test
    public void testGetAllLeagues() {
        System.out.println("getAllLeagues");
        XmlSoccerService instance = XmlSoccerServiceFactory.getService();
        List<League> result = instance.getAllLeagues();

        assertNotNull(result);
    }

    /**
     * Test of getAllTeams method, of class XmlSoccerServiceImpl.
     */
    @Ignore
    @Test
    public void testGetAllTeams() {
        System.out.println("getAllTeams");
        XmlSoccerService instance = XmlSoccerServiceFactory.getService();
        List<Team> result = instance.getAllTeams();
        assertTrue(result.size() > 0);
    }

    /**
     * Test of getAllTeamByLeagueAndSession method, of class XmlSoccerServiceImpl.
     */
    @Ignore
    @Test
    public void testGetAllTeamByLeagueAndSession() {
        System.out.println("getAllTeamByLeagueAndSession");
        int leagueId = 3;
        String session = "1314";
        XmlSoccerService instance = XmlSoccerServiceFactory.getService();
        List<Team> result = instance.getAllTeamByLeagueAndSession(leagueId, session);
        assertTrue(result.size() > 0);
    }

    /**
     * Test of getEarliesMatchDatePerLeague method, of class XmlSoccerServiceImpl.
     */
    @Ignore
    @Test
    public void testGetEarliesMatchDatePerLeague() {
        System.out.println("getEarliesMatchDatePerLeague");
        int leagueId = 0;
        XmlSoccerService instance = XmlSoccerServiceFactory.getService();
        Date result = instance.getEarliesMatchDatePerLeague(leagueId);
        assertNotNull(result);
    }

    /**
     * Test of getFixtureByDateInteval method, of class XmlSoccerServiceImpl.
     */
    @Ignore
    @Test
    public void testGetFixtureByDateInteval() {
        System.out.println("getFixtureByDateInteval");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date startDate;
        Date endDate;
        try {
            startDate = dateFormat.parse("2014-01-01");
            endDate = dateFormat.parse("2014-04-30");
            XmlSoccerService instance = XmlSoccerServiceFactory.getService();
            List<Fixture> result = instance.getFixtureByDateInteval(startDate, endDate);
            assertTrue(result.size() > 0);
        } catch (ParseException ex) {
            Logger.getLogger(XmlSoccerServiceImplTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("cannot parse date");
        }
    }

    /**
     * Test of getFixtureByDateIntevalAndLeague method, of class XmlSoccerServiceImpl.
     */
    @Ignore
    @Test
    public void testGetFixtureByDateIntevalAndLeague() {
        System.out.println("getFixtureByDateIntevalAndLeague");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date startDate;
        Date endDate;
        try {
            startDate = dateFormat.parse("2014-01-01");
            endDate = dateFormat.parse("2014-04-30");
            XmlSoccerService instance = XmlSoccerServiceFactory.getService();
            List<Fixture> result = instance.getFixtureByDateIntevalAndLeague(3, startDate, endDate);
            assertTrue(result.size() > 0);
        } catch (ParseException ex) {
            Logger.getLogger(XmlSoccerServiceImplTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("cannot parse date");
        }
    }

    /**
     * Test of getFixturesByDateIntervalAndTeam method, of class XmlSoccerServiceImpl.
     */
    @Ignore
    @Test
    public void testGetFixturesByDateIntervalAndTeam() {
        System.out.println("getFixturesByDateIntervalAndTeam");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date startDate;
        Date endDate;
        try {
            startDate = dateFormat.parse("2014-01-01");
            endDate = dateFormat.parse("2014-04-30");
            XmlSoccerService instance = XmlSoccerServiceFactory.getService();
            List<Fixture> result = instance.getFixturesByDateIntervalAndTeam(54, startDate, endDate);
            assertTrue(result.size() > 0);
        } catch (ParseException ex) {
            Logger.getLogger(XmlSoccerServiceImplTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("cannot parse date");
        }
    }

    /**
     * Test of getFixturesByLeagueAndSeason method, of class XmlSoccerServiceImpl.
     */
    @Test
    public void testGetFixturesByLeagueAndSeason() {
        System.out.println("getFixturesByLeagueAndSeason");
        XmlSoccerService instance = XmlSoccerServiceFactory.getService();
        List<Fixture> result = instance.getFixturesByLeagueAndSeason(3, "1314");
        assertTrue(result.size() > 0);
    }

    /**
     * Test of getHistoricMatchesByFixtureMatchId method, of class XmlSoccerServiceImpl.
     */
    @Test
    public void testGetHistoricMatchesByFixtureMatchId() {
        System.out.println("getHistoricMatchesByFixtureMatchId");
        int fixtureId = 324796;
        XmlSoccerService instance = XmlSoccerServiceFactory.getService();
        FixtureHistory result = instance.getHistoricMatchesByFixtureMatchId(fixtureId);
        assertNotNull(result);
    }

    /**
     * Test of getHistoricMatchesByID method, of class XmlSoccerServiceImpl.
     */
    @Ignore
    @Test
    public void testGetHistoricMatchesByID() {
        System.out.println("getHistoricMatchesByID");
        int fixtureHistoryId = 69096;
        XmlSoccerService instance = XmlSoccerServiceFactory.getService();
        FixtureHistory result = instance.getHistoricMatchesByID(fixtureHistoryId);
        assertNotNull(result);
    }

    /**
     * Test of getHistoricMatchesByLeagueAndDateInterval method, of class XmlSoccerServiceImpl.
     */
    @Test
    public void testGetHistoricMatchesByLeagueAndDateInterval() {
        System.out.println("getFixturesByDateIntervalAndTeam");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date startDate;
        Date endDate;
        try {
            startDate = dateFormat.parse("2014-01-01");
            endDate = dateFormat.parse("2014-04-30");
            XmlSoccerService instance = XmlSoccerServiceFactory.getService();
            List<FixtureHistory> result = instance.getHistoricMatchesByLeagueAndDateInterval(3, startDate, endDate);
            assertTrue(result.size() > 0);
        } catch (ParseException ex) {
            Logger.getLogger(XmlSoccerServiceImplTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("cannot parse date");
        }
    }

    /**
     * Test of getHistoricMatchesByLeagueAndSeason method, of class XmlSoccerServiceImpl.
     */
    @Test
    public void testGetHistoricMatchesByLeagueAndSeason() {
        System.out.println("getHistoricMatchesByLeagueAndSeason");
        XmlSoccerService instance = XmlSoccerServiceFactory.getService();
        List<FixtureHistory> result = instance.getHistoricMatchesByLeagueAndSeason(3, "1314");
        assertTrue(result.size() > 0);
    }

    /**
     * Test of getHistoricMatchesByTeamAndDateInterval method, of class XmlSoccerServiceImpl.
     */
    @Test
    public void testGetHistoricMatchesByTeamAndDateInterval() {
        System.out.println("getHistoricMatchesByTeamAndDateInterval");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date startDate;
        Date endDate;
        try {
            startDate = dateFormat.parse("2014-01-01");
            endDate = dateFormat.parse("2014-04-30");
            XmlSoccerService instance = XmlSoccerServiceFactory.getService();
            List<FixtureHistory> result = instance.getHistoricMatchesByTeamAndDateInterval(52, startDate, endDate);
            assertTrue(result.size() > 0);
        } catch (ParseException ex) {
            Logger.getLogger(XmlSoccerServiceImplTest.class.getName()).log(Level.SEVERE, null, ex);
            fail("cannot parse date");
        }
    }

    /**
     * Test of getLiveScore method, of class XmlSoccerServiceImpl.
     */
    @Ignore
    @Test
    public void testGetLiveScore() {
        System.out.println("getLiveScore");
        XmlSoccerServiceImpl instance = new XmlSoccerServiceImpl();
        List<Fixture> expResult = null;
        List<Fixture> result = instance.getLiveScore();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLiveScoreByLeague method, of class XmlSoccerServiceImpl.
     */
    @Ignore
    @Test
    public void testGetLiveScoreByLeague() {
        System.out.println("getLiveScoreByLeague");
        int leagueId = 0;
        XmlSoccerServiceImpl instance = new XmlSoccerServiceImpl();
        List<Fixture> expResult = null;
        List<Fixture> result = instance.getLiveScoreByLeague(leagueId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOddsByFixtureMatchId method, of class XmlSoccerServiceImpl.
     */
    @Ignore
    @Test
    public void testGetOddsByFixtureMatchId() {
        System.out.println("getOddsByFixtureMatchId");
        int fixtureId = 0;
        XmlSoccerServiceImpl instance = new XmlSoccerServiceImpl();
        String expResult = "";
        String result = instance.getOddsByFixtureMatchId(fixtureId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOddsByFixtureMatchId2 method, of class XmlSoccerServiceImpl.
     */
    @Ignore
    @Test
    public void testGetOddsByFixtureMatchId2() {
        System.out.println("getOddsByFixtureMatchId2");
        int fixtureId = 0;
        XmlSoccerServiceImpl instance = new XmlSoccerServiceImpl();
        String expResult = "";
        String result = instance.getOddsByFixtureMatchId2(fixtureId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTopScorersByLeagueAndSeason method, of class XmlSoccerServiceImpl.
     */
    @Test
    public void testGetTopScorersByLeagueAndSeason() {
        System.out.println("getTopScorersByLeagueAndSeason");
        int leagueId = 3;
        String session = "1314";
        XmlSoccerService instance = XmlSoccerServiceFactory.getService();
        List<TopScore> result = instance.getTopScorersByLeagueAndSeason(leagueId, session);
        assertTrue(result.size() > 0);
    }

    @Test
    public void testGetLeagueStandingBySeason() {
        System.out.println("Start test getLeagueStandingBySeason");
        int leagueId = 3;
        String season = "1314";
        XmlSoccerService servier = XmlSoccerServiceFactory.getService();
        List<LeagueStanding> resutl = servier.getLeagueStandingBySeason(leagueId, season);
        assertTrue(resutl.size() > 0);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.dao.factory;

import com.nms.football.dao.FixtureDao;
import com.nms.football.dao.FixtureHistoryDao;
import com.nms.football.dao.LeagueDao;
import com.nms.football.dao.TeamDao;
import com.nms.football.dao.LeagueStandingDao;
import com.nms.football.dao.TopScoreDao;
import com.nms.football.dao.impl.FixtureDaoImpl;
import com.nms.football.dao.impl.FixtureHistoryDaoImpl;
import com.nms.football.dao.impl.LeagueDaoImpl;
import com.nms.football.dao.impl.TeamDaoImpl;
import com.nms.football.dao.impl.LeagueStandingDaoImpl;
import com.nms.football.dao.impl.TopScoreDaoImpl;

/**
 *
 * @author Cuong
 */
public class DaoFactory {

    private static FixtureDao fixtureDao;
    private static FixtureHistoryDao fixtureHistoryDao;
    private static LeagueDao leagueDao;
    private static TeamDao teamDao;
    private static TopScoreDao topScoreDao;
    private static LeagueStandingDao teamLeagueStandingDao;

    public static FixtureDao getFixtureDao() {
        if (fixtureDao == null) {
            fixtureDao = new FixtureDaoImpl();
        }

        return fixtureDao;
    }

    public static FixtureHistoryDao getFixtureHistoryDao() {
        if (fixtureHistoryDao == null) {
            fixtureHistoryDao = new FixtureHistoryDaoImpl();
        }

        return fixtureHistoryDao;
    }

    public static LeagueDao getLeagueDao() {
        if (leagueDao == null) {
            leagueDao = new LeagueDaoImpl();
        }

        return leagueDao;
    }

    public static TeamDao getTeamDao() {
        if (teamDao == null) {
            teamDao = new TeamDaoImpl();
        }
        return teamDao;
    }

    public static TopScoreDao getTopScoreDao() {
        if (topScoreDao == null) {
            topScoreDao = new TopScoreDaoImpl();
        }
        return topScoreDao;
    }
    
    public static LeagueStandingDao getLeagueStandingDao() {
        if (teamLeagueStandingDao == null) {
            teamLeagueStandingDao = new LeagueStandingDaoImpl();
        }
        return teamLeagueStandingDao;
    }
}

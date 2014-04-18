/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.xmlsoccer.util;

import com.nms.football.util.Utils;

/**
 *
 * @author Cuong
 */
public class XmlSoccerConstants {

    public static final String XMLSOCCER_SERVICE_ADDRESS = Utils.getProperties().getProperty("xmlsoccer.service.address");
    public static final String XMLSOCCER_API_KEY = Utils.getProperties().getProperty("xmlsoccer.api.key");

    // Service method urls
    public static final String CHECK_API_KEY_URL = XMLSOCCER_SERVICE_ADDRESS
            + "/CheckApiKey?ApiKey="
            + XMLSOCCER_API_KEY;
    public static final String GET_ALL_LEAGUES_URL = XMLSOCCER_SERVICE_ADDRESS
            + "/GetAllLeagues?ApiKey="
            + XMLSOCCER_API_KEY;
    public static final String GET_ALL_TEAMS_URL = XMLSOCCER_SERVICE_ADDRESS
            + "/GetAllTeams?ApiKey="
            + XMLSOCCER_API_KEY;
    public static final String GET_ALL_TEAM_BY_LEAGUE_AND_SESSION_TMP = XMLSOCCER_SERVICE_ADDRESS
            + "/GetAllTeamsByLeagueAndSeason?ApiKey="
            + XMLSOCCER_API_KEY + "&league=%s&seasonDateString=%s";
    public static final String GET_EARLIEST_MATCH_DATE_PER_LEAGUE_TMP = XMLSOCCER_SERVICE_ADDRESS
            + "/GetEarliestMatchDatePerLeague?ApiKey="
            + XMLSOCCER_API_KEY + "&league=%s";
    public static final String GET_FIXTURES_BY_DATE_INTERVAL_TMP = XMLSOCCER_SERVICE_ADDRESS
            + "/GetFixturesByDateInterval?ApiKey="
            + XMLSOCCER_API_KEY
            + "&startDateString=%s&endDateString=%s";
    public static final String GET_FIXTURES_BY_DATE_INTERVAL_AND_LEAGUE_TMP = XMLSOCCER_SERVICE_ADDRESS
            + "/GetFixturesByDateIntervalAndLeague?league=%s&ApiKey="
            + XMLSOCCER_API_KEY + "&startDateString=%s&endDateString=%s";
    public static final String GET_FIXTURES_BY_DATE_INTERVAL_AND_TEAM_TMP = XMLSOCCER_SERVICE_ADDRESS
            + "/GetFixturesByDateIntervalAndTeam?ApiKey="
            + XMLSOCCER_API_KEY + "&startDateString=%s&endDateString=%s&teamId=%s";
    public static final String GET_FIXTURES_BY_LEAGUE_AND_SESSION_TMP = XMLSOCCER_SERVICE_ADDRESS
            + "/GetFixturesByLeagueAndSeason?ApiKey="
            + XMLSOCCER_API_KEY + "&seasonDateString=%s&league=%s";
    public static final String GET_HISTORIC_MATCHES_BY_FIXTURED_ID_TMP = XMLSOCCER_SERVICE_ADDRESS
            + "/GetHistoricMatchesByFixtureMatchID?ApiKey=" + XMLSOCCER_API_KEY + "&Id=%s";
    public static final String GET_HISTORIC_MATCHES_BY_ID_TMP = XMLSOCCER_SERVICE_ADDRESS
            + "/GetHistoricMatchesByID?ApiKey=" + XMLSOCCER_API_KEY + "&Id=%s";
    public static final String GET_HISTORIC_MATCHES_BY_LEAGUE_AND_DATE_INTERVAL_TMP = XMLSOCCER_SERVICE_ADDRESS
            + "/GetHistoricMatchesByLeagueAndDateInterval?ApiKey="
            + XMLSOCCER_API_KEY + "&league=%s&startDateString=%s&endDateString=%s";
    public static final String GET_HISTORIC_MATCHES_BY_LEAGUE_AND_SESSION_TMP = XMLSOCCER_SERVICE_ADDRESS
            + "/GetHistoricMatchesByLeagueAndSeason?ApiKey="
            + XMLSOCCER_API_KEY + "&league=%s&seasonDateString=%s";
    public static final String GET_HISTORIC_MATCHES_BY_TEAM_AND_DATE_INTERVAL_TMP = XMLSOCCER_SERVICE_ADDRESS
            + "/GetHistoricMatchesByTeamAndDateInterval?ApiKey="
            + XMLSOCCER_API_KEY + "&teamId=%s&startDateString=%s&endDateString=%s";
    public static final String GET_LIVESCORE_URL = XMLSOCCER_SERVICE_ADDRESS
            + "/GetLiveScore?ApiKey="
            + XMLSOCCER_API_KEY;
    public static final String GET_LIVESCORE_BY_LEAGUE_TMP = XMLSOCCER_SERVICE_ADDRESS
            + "/GetLiveScoreByLeague?ApiKey="
            + XMLSOCCER_API_KEY + "&league=%s";
    public static final String GET_ODDS_BY_FIXTURE_ID_TMP = XMLSOCCER_SERVICE_ADDRESS
            + "/GetOddsByFixtureMatchId?ApiKey="
            + XMLSOCCER_API_KEY + "&fixtureMatch_Id=%s";
    public static final String GET_ODDS_BY_FIXTURE_ID_2_TMP = XMLSOCCER_SERVICE_ADDRESS
            + "/GetOddsByFixtureMatchId2?ApiKey="
            + XMLSOCCER_API_KEY + "&fixtureMatch_Id=%s";
    public static final String GET_TOP_SCORE_BY_LEAGUE_AND_SESSION_TMP = XMLSOCCER_SERVICE_ADDRESS
            + "/GetTopScorersByLeagueAndSeason?ApiKey=" 
            + XMLSOCCER_API_KEY + "&league=%s&seasonDateString=%s";
}

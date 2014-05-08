/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.model;

/**
 * Contain data of TEAMLEAGUESTANDING table.
 *
 * @author Tiger_Cave
 */
public class LeagueStanding {

    private int leagueId;
    private String season;
    private String team;
    private int teamId;
    private int played;
    private int playedAtHome;
    private int playedAway;
    private int won;
    private int draw;
    private int lost;
    private int goalsFor;
    private int goalsAgainst;
    private int goalsDifference;
    private int points;

    public LeagueStanding() {
    }

    public LeagueStanding(int leagueId, String season, String team, int teamId, int played, int playedAtHome,
            int playedAway, int won, int draw, int lost, int goalsFor, int goalsAgainst,
            int goalsDifference, int points) {
        this.leagueId = leagueId;
        this.season = season;
        this.team = team;
        this.teamId = teamId;
        this.played = played;
        this.playedAtHome = playedAtHome;
        this.playedAway = playedAway;
        this.won = won;
        this.draw = draw;
        this.lost = lost;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
        this.goalsDifference = goalsDifference;
        this.points = points;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getPlayed() {
        return played;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public int getPlayedAtHome() {
        return playedAtHome;
    }

    public void setPlayedAtHome(int playedAtHome) {
        this.playedAtHome = playedAtHome;
    }

    public int getPlayedAway() {
        return playedAway;
    }

    public void setPlayedAway(int playedAway) {
        this.playedAway = playedAway;
    }

    public int getWon() {
        return won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(int goalsFor) {
        this.goalsFor = goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    public int getGoalsDifference() {
        return goalsDifference;
    }

    public void setGoalsDifference(int goalsDifference) {
        this.goalsDifference = goalsDifference;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public int hashCode() {
        int hash = 0;

        hash += leagueId;
        hash += teamId;

        if (team != null) {
            hash += team.hashCode();
        }
        if (season != null) {
            hash += season.hashCode();
        }

        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final LeagueStanding other = (LeagueStanding) obj;
        if (this.leagueId != other.leagueId) {
            return false;
        }
        if ((this.season == null) ? (other.season != null) : !this.season.equals(other.season)) {
            return false;
        }
        if ((this.team == null) ? (other.team != null) : !this.team.equals(other.team)) {
            return false;
        }
        return this.teamId == other.teamId;
    }

}

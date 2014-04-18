/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.model;

import java.util.Date;

/**
 * Contain data of FIXTURE Table.
 *
 * @author Cuong
 */
public class Fixture {

    private int id;
    private String code;
    private Date date;
    private String league;
    private int round;
    private int spectators;
    private String homeTeam;
    private int homeTeamId;
    private int homeGoals;
    private String awayTeam;
    private int awayTeamId;
    private int awayGoals;
    private String time;
    private String location;
    private String stadium;
    private String homeGoalDetals;
    private String awayGoalDetails;
    private String homeLineupGoalkeeper;
    private String awayLineupGoalKeeper;
    private String homeLineupDefense;
    private String awayLineupDefense;
    private String homeLineupMidfield;
    private String awayLineupMidfield;
    private String homeLineupForward;
    private String awayLineupForward;
    private String homeLineupSubstitutes;
    private String awayLineupSubstitutes;
    private String homeLineupCoach;
    private String awayLineupCoach;
    private String homeSubDetails;
    private String awaySubDetails;
    private String homeTeamFormation;
    private String awayTeamFormation;
    private String homeTeamYellowCardDetails;
    private String awayTeamYellowCardDetails;
    private String homeTeamRedCardDetails;
    private String awayTeamRedCardDetails;

    public Fixture() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int getSpectators() {
        return spectators;
    }

    public void setSpectators(int spectators) {
        this.spectators = spectators;
    }

    public String getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    public int getHomeTeamId() {
        return homeTeamId;
    }

    public void setHomeTeamId(int homeTeamId) {
        this.homeTeamId = homeTeamId;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public String getAwayTeam() {
        return awayTeam;
    }

    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    public int getAwayTeamId() {
        return awayTeamId;
    }

    public void setAwayTeamId(int awayTeamId) {
        this.awayTeamId = awayTeamId;
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(int awayGoals) {
        this.awayGoals = awayGoals;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getHomeGoalDetals() {
        return homeGoalDetals;
    }

    public void setHomeGoalDetals(String homeGoalDetals) {
        this.homeGoalDetals = homeGoalDetals;
    }

    public String getAwayGoalDetails() {
        return awayGoalDetails;
    }

    public void setAwayGoalDetails(String awayGoalDetails) {
        this.awayGoalDetails = awayGoalDetails;
    }

    public String getHomeLineupGoalkeeper() {
        return homeLineupGoalkeeper;
    }

    public void setHomeLineupGoalkeeper(String homeLineupGoalkeeper) {
        this.homeLineupGoalkeeper = homeLineupGoalkeeper;
    }

    public String getAwayLineupGoalKeeper() {
        return awayLineupGoalKeeper;
    }

    public void setAwayLineupGoalKeeper(String awayLineupGoalKeeper) {
        this.awayLineupGoalKeeper = awayLineupGoalKeeper;
    }

    public String getHomeLineupDefense() {
        return homeLineupDefense;
    }

    public void setHomeLineupDefense(String homeLineupDefense) {
        this.homeLineupDefense = homeLineupDefense;
    }

    public String getAwayLineupDefense() {
        return awayLineupDefense;
    }

    public void setAwayLineupDefense(String awayLineupDefense) {
        this.awayLineupDefense = awayLineupDefense;
    }

    public String getHomeLineupMidfield() {
        return homeLineupMidfield;
    }

    public void setHomeLineupMidfield(String homeLineupMidfield) {
        this.homeLineupMidfield = homeLineupMidfield;
    }

    public String getAwayLineupMidfield() {
        return awayLineupMidfield;
    }

    public void setAwayLineupMidfield(String awayLineupMidfield) {
        this.awayLineupMidfield = awayLineupMidfield;
    }

    public String getHomeLineupForward() {
        return homeLineupForward;
    }

    public void setHomeLineupForward(String homeLineupForward) {
        this.homeLineupForward = homeLineupForward;
    }

    public String getAwayLineupForward() {
        return awayLineupForward;
    }

    public void setAwayLineupForward(String awayLineupForward) {
        this.awayLineupForward = awayLineupForward;
    }

    public String getHomeLineupSubstitutes() {
        return homeLineupSubstitutes;
    }

    public void setHomeLineupSubstitutes(String homeLineupSubstitutes) {
        this.homeLineupSubstitutes = homeLineupSubstitutes;
    }

    public String getAwayLineupSubstitutes() {
        return awayLineupSubstitutes;
    }

    public void setAwayLineupSubstitutes(String awayLineupSubstitutes) {
        this.awayLineupSubstitutes = awayLineupSubstitutes;
    }

    public String getHomeLineupCoach() {
        return homeLineupCoach;
    }

    public void setHomeLineupCoach(String homeLineupCoach) {
        this.homeLineupCoach = homeLineupCoach;
    }

    public String getAwayLineupCoach() {
        return awayLineupCoach;
    }

    public void setAwayLineupCoach(String awayLineupCoach) {
        this.awayLineupCoach = awayLineupCoach;
    }

    public String getHomeSubDetails() {
        return homeSubDetails;
    }

    public void setHomeSubDetails(String homeSubDetails) {
        this.homeSubDetails = homeSubDetails;
    }

    public String getAwaySubDetails() {
        return awaySubDetails;
    }

    public void setAwaySubDetails(String awaySubDetails) {
        this.awaySubDetails = awaySubDetails;
    }

    public String getHomeTeamFormation() {
        return homeTeamFormation;
    }

    public void setHomeTeamFormation(String homeTeamFormation) {
        this.homeTeamFormation = homeTeamFormation;
    }

    public String getAwayTeamFormation() {
        return awayTeamFormation;
    }

    public void setAwayTeamFormation(String awayTeamFormation) {
        this.awayTeamFormation = awayTeamFormation;
    }

    public String getHomeTeamYellowCardDetails() {
        return homeTeamYellowCardDetails;
    }

    public void setHomeTeamYellowCardDetails(String homeTeamYellowCardDetails) {
        this.homeTeamYellowCardDetails = homeTeamYellowCardDetails;
    }

    public String getAwayTeamYellowCardDetails() {
        return awayTeamYellowCardDetails;
    }

    public void setAwayTeamYellowCardDetails(String awayTeamYellowCardDetails) {
        this.awayTeamYellowCardDetails = awayTeamYellowCardDetails;
    }

    public String getHomeTeamRedCardDetails() {
        return homeTeamRedCardDetails;
    }

    public void setHomeTeamRedCardDetails(String homeTeamRedCardDetails) {
        this.homeTeamRedCardDetails = homeTeamRedCardDetails;
    }

    public String getAwayTeamRedCardDetails() {
        return awayTeamRedCardDetails;
    }

    public void setAwayTeamRedCardDetails(String awayTeamRedCardDetails) {
        this.awayTeamRedCardDetails = awayTeamRedCardDetails;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        if (id != 0) {
            hash += id;
        }
        if (code != null) {
            hash += code.hashCode();
        }
        if (date != null) {
            hash += date.hashCode();
        }
        if (league != null) {
            hash += league.hashCode();
        }
        if (round != 0) {
            hash += round;
        }
        if (spectators != 0) {
            hash += spectators;
        }
        if (homeTeam != null) {
            hash += homeTeam.hashCode();
        }
        if (homeTeamId != 0) {
            hash += homeTeamId;
        }
        if (homeGoals != 0) {
            hash += homeGoals;
        }
        if (awayTeam != null) {
            hash += awayTeam.hashCode();
        }
        if (awayTeamId != 0) {
            hash += awayTeamId;
        }
        if (awayGoals != 0) {
            hash += awayGoals;
        }
        if (time != null) {
            hash += time.hashCode();
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
        final Fixture other = (Fixture) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.code == null) ? (other.code != null) : !this.code.equals(other.code)) {
            return false;
        }
        if (this.date != other.date && (this.date == null || !this.date.equals(other.date))) {
            return false;
        }
        if ((this.league == null) ? (other.league != null) : !this.league.equals(other.league)) {
            return false;
        }
        if (this.round != other.round) {
            return false;
        }
        if (this.spectators != other.spectators) {
            return false;
        }
        if ((this.homeTeam == null) ? (other.homeTeam != null) : !this.homeTeam.equals(other.homeTeam)) {
            return false;
        }
        if (this.homeTeamId != other.homeTeamId) {
            return false;
        }
        if (this.homeGoals != other.homeGoals) {
            return false;
        }
        if ((this.awayTeam == null) ? (other.awayTeam != null) : !this.awayTeam.equals(other.awayTeam)) {
            return false;
        }
        if (this.awayTeamId != other.awayTeamId) {
            return false;
        }
        if (this.awayGoals != other.awayGoals) {
            return false;
        }
        return !((this.time == null) ? (other.time != null) : !this.time.equals(other.time));
    }
}

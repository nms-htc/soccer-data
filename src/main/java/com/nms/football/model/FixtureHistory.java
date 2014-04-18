/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.model;

import java.util.Date;

/**
 * Contain data of FIXTUREHISTORY tables.
 *
 * @author Cuong
 */
public class FixtureHistory {

    private int id;
    private int fixtureId;
    private Date date;
    private int round;
    private int spectators;
    private String league;
    private String homeTeam;
    private int homeTeamId;
    private int homeCorners;
    private int homeGoals;
    private int halfTimeHomeGoals;
    private int homeShorts;
    private int homeShortOnTarget;
    private int homeFauls;
    private String homeGoalDetails;
    private String homeLineupGoalkeeper;
    private String homeLineupDefense;
    private String homeLineupMidfield;
    private String homeLineupForward;
    private String homeLineupSubstitutes;
    private String homeLineupCoach;
    private int homeYellowCards;
    private int homeRedCards;
    private String homeTeamFormation;
    private String awayTeam;
    private int awayTeamId;
    private int awayCorners;
    private int awayGoals;
    private int halfTimeAwayGoals;
    private int awayShorts;
    private int awayShortOnTarget;
    private int awayFauls;
    private String awayGoalDetais;
    private String awayLineupGoalkeeper;
    private String awayLineupDefense;
    private String awayLineupMidfield;
    private String awayLineupForward;
    private String awayLineupSubsitutes;
    private String awayLineupCoach;
    private int awayYellowCards;
    private int awayRedCards;
    private String awayTeamFormation;
    private String homeTeamYellowCardDetails;
    private String awayTeamYellowCardDetails;
    private String homeTeamRedCardDetails;
    private String awayTeamRedCardDetails;
    private String homeSubDetails;
    private String awaySubDetails;

    public FixtureHistory() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFixtureId() {
        return fixtureId;
    }

    public void setFixtureId(int fixtureId) {
        this.fixtureId = fixtureId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
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

    public int getHomeCorners() {
        return homeCorners;
    }

    public void setHomeCorners(int homeCorners) {
        this.homeCorners = homeCorners;
    }

    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public int getHalfTimeHomeGoals() {
        return halfTimeHomeGoals;
    }

    public void setHalfTimeHomeGoals(int halfTimeHomeGoals) {
        this.halfTimeHomeGoals = halfTimeHomeGoals;
    }

    public int getHomeShorts() {
        return homeShorts;
    }

    public void setHomeShorts(int homeShorts) {
        this.homeShorts = homeShorts;
    }

    public int getHomeShortOnTarget() {
        return homeShortOnTarget;
    }

    public void setHomeShortOnTarget(int homeShortOnTarget) {
        this.homeShortOnTarget = homeShortOnTarget;
    }

    public int getHomeFauls() {
        return homeFauls;
    }

    public void setHomeFauls(int homeFauls) {
        this.homeFauls = homeFauls;
    }

    public String getHomeGoalDetails() {
        return homeGoalDetails;
    }

    public void setHomeGoalDetails(String homeGoalDetails) {
        this.homeGoalDetails = homeGoalDetails;
    }

    public String getHomeLineupGoalkeeper() {
        return homeLineupGoalkeeper;
    }

    public void setHomeLineupGoalkeeper(String homeLineupGoalkeeper) {
        this.homeLineupGoalkeeper = homeLineupGoalkeeper;
    }

    public String getHomeLineupDefense() {
        return homeLineupDefense;
    }

    public void setHomeLineupDefense(String homeLineupDefense) {
        this.homeLineupDefense = homeLineupDefense;
    }

    public String getHomeLineupMidfield() {
        return homeLineupMidfield;
    }

    public void setHomeLineupMidfield(String homeLineupMidfield) {
        this.homeLineupMidfield = homeLineupMidfield;
    }

    public String getHomeLineupForward() {
        return homeLineupForward;
    }

    public void setHomeLineupForward(String homeLineupForward) {
        this.homeLineupForward = homeLineupForward;
    }

    public String getHomeLineupSubstitutes() {
        return homeLineupSubstitutes;
    }

    public void setHomeLineupSubstitutes(String homeLineupSubstitutes) {
        this.homeLineupSubstitutes = homeLineupSubstitutes;
    }

    public String getHomeLineupCoach() {
        return homeLineupCoach;
    }

    public void setHomeLineupCoach(String homeLineupCoach) {
        this.homeLineupCoach = homeLineupCoach;
    }

    public int getHomeYellowCards() {
        return homeYellowCards;
    }

    public void setHomeYellowCards(int homeYellowCards) {
        this.homeYellowCards = homeYellowCards;
    }

    public int getHomeRedCards() {
        return homeRedCards;
    }

    public void setHomeRedCards(int homeRedCards) {
        this.homeRedCards = homeRedCards;
    }

    public String getHomeTeamFormation() {
        return homeTeamFormation;
    }

    public void setHomeTeamFormation(String homeTeamFormation) {
        this.homeTeamFormation = homeTeamFormation;
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

    public int getAwayCorners() {
        return awayCorners;
    }

    public void setAwayCorners(int awayCorners) {
        this.awayCorners = awayCorners;
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(int awayGoals) {
        this.awayGoals = awayGoals;
    }

    public int getHalfTimeAwayGoals() {
        return halfTimeAwayGoals;
    }

    public void setHalfTimeAwayGoals(int halfTimeAwayGoals) {
        this.halfTimeAwayGoals = halfTimeAwayGoals;
    }

    public int getAwayShorts() {
        return awayShorts;
    }

    public void setAwayShorts(int awayShorts) {
        this.awayShorts = awayShorts;
    }

    public int getAwayShortOnTarget() {
        return awayShortOnTarget;
    }

    public void setAwayShortOnTarget(int awayShortOnTarget) {
        this.awayShortOnTarget = awayShortOnTarget;
    }

    public int getAwayFauls() {
        return awayFauls;
    }

    public void setAwayFauls(int awayFauls) {
        this.awayFauls = awayFauls;
    }

    public String getAwayGoalDetais() {
        return awayGoalDetais;
    }

    public void setAwayGoalDetais(String awayGoalDetais) {
        this.awayGoalDetais = awayGoalDetais;
    }

    public String getAwayLineupGoalkeeper() {
        return awayLineupGoalkeeper;
    }

    public void setAwayLineupGoalkeeper(String awayLineupGoalkeeper) {
        this.awayLineupGoalkeeper = awayLineupGoalkeeper;
    }

    public String getAwayLineupDefense() {
        return awayLineupDefense;
    }

    public void setAwayLineupDefense(String awayLineupDefense) {
        this.awayLineupDefense = awayLineupDefense;
    }

    public String getAwayLineupMidfield() {
        return awayLineupMidfield;
    }

    public void setAwayLineupMidfield(String awayLineupMidfield) {
        this.awayLineupMidfield = awayLineupMidfield;
    }

    public String getAwayLineupForward() {
        return awayLineupForward;
    }

    public void setAwayLineupForward(String awayLineupForward) {
        this.awayLineupForward = awayLineupForward;
    }

    public String getAwayLineupSubsitutes() {
        return awayLineupSubsitutes;
    }

    public void setAwayLineupSubsitutes(String awayLineupSubsitutes) {
        this.awayLineupSubsitutes = awayLineupSubsitutes;
    }

    public String getAwayLineupCoach() {
        return awayLineupCoach;
    }

    public void setAwayLineupCoach(String awayLineupCoach) {
        this.awayLineupCoach = awayLineupCoach;
    }

    public int getAwayYellowCards() {
        return awayYellowCards;
    }

    public void setAwayYellowCards(int awayYellowCards) {
        this.awayYellowCards = awayYellowCards;
    }

    public int getAwayRedCards() {
        return awayRedCards;
    }

    public void setAwayRedCards(int awayRedCards) {
        this.awayRedCards = awayRedCards;
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

    @Override
    public int hashCode() {
        int hash = 0;

        if (fixtureId != 0) {
            hash += fixtureId;
        }
        if (date != null) {
            hash += date.hashCode();
        }
        if (round != 0) {
            hash = +round;
        }
        if (spectators != 0) {
            hash += spectators;
        }
        if (league != null) {
            hash += league.hashCode();
        }
        if (homeTeam != null) {
            hash += homeTeam.hashCode();
        }
        if (homeTeamId != 0) {
            hash += homeTeamId;
        }
        if (awayTeam != null) {
            hash += awayTeam.hashCode();
        }
        if (awayTeamId != 0) {
            hash += awayTeamId;
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
        final FixtureHistory other = (FixtureHistory) obj;
        if (this.fixtureId != other.fixtureId) {
            return false;
        }
        if (this.date != other.date && (this.date == null || !this.date.equals(other.date))) {
            return false;
        }
        if (this.round != other.round) {
            return false;
        }
        if (this.spectators != other.spectators) {
            return false;
        }
        if ((this.league == null) ? (other.league != null) : !this.league.equals(other.league)) {
            return false;
        }
        if ((this.homeTeam == null) ? (other.homeTeam != null) : !this.homeTeam.equals(other.homeTeam)) {
            return false;
        }
        if (this.homeTeamId != other.homeTeamId) {
            return false;
        }
        if ((this.awayTeam == null) ? (other.awayTeam != null) : !this.awayTeam.equals(other.awayTeam)) {
            return false;
        }
        return this.awayTeamId == other.awayTeamId;
    }
}

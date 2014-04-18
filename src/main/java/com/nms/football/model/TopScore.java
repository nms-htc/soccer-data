/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.model;

/**
 * Contain data of TOPSCORE table.
 *
 * @author Cuong
 */
public class TopScore {

    private int id;
    private int leagueId;
    private String session;
    private int rank;
    private String name;
    private String teamName;
    private int teamId;
    private String nationality;
    private int goals;
    private int firstSoccer;
    private int penalties;
    private int missedPenalties;

    public TopScore() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getFirstSoccer() {
        return firstSoccer;
    }

    public void setFirstSoccer(int firstSoccer) {
        this.firstSoccer = firstSoccer;
    }

    public int getPenalties() {
        return penalties;
    }

    public void setPenalties(int penalties) {
        this.penalties = penalties;
    }

    public int getMissedPenalties() {
        return missedPenalties;
    }

    public void setMissedPenalties(int missedPenalties) {
        this.missedPenalties = missedPenalties;
    }

    @Override
    public int hashCode() {
        int hash = 0;

        if (leagueId != 0) {
            hash += leagueId;
        }
        if (session != null) {
            hash += session.hashCode();
        }
        if (name != null) {
            hash += name.hashCode();
        }
        if (teamName != null) {
            hash += teamName.hashCode();
        }
        if (teamId != 0) {
            hash += teamId;
        }
        if (rank != 0) {
            hash += rank;
        }
        if (nationality != null) {
            hash += nationality.hashCode();
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
        final TopScore other = (TopScore) obj;
        if (this.leagueId != other.leagueId) {
            return false;
        }
        if ((this.session == null) ? (other.session != null) : !this.session.equals(other.session)) {
            return false;
        }
        if (this.rank != other.rank) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        if ((this.teamName == null) ? (other.teamName != null) : !this.teamName.equals(other.teamName)) {
            return false;
        }
        if (this.teamId != other.teamId) {
            return false;
        }
        return !((this.nationality == null) ? (other.nationality != null) : !this.nationality.equals(other.nationality));
    }
}

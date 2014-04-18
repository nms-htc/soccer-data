/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.model;

/**
 * Contain data of LEAGUE table.
 *
 * @author Cuong
 */
public class League {

    private int id;
    private String code;
    private String name;
    private String coutry;
    private boolean historyData;
    private boolean fixtures;
    private boolean livescore;
    private int numberOfMatch;

    public League() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoutry() {
        return coutry;
    }

    public void setCoutry(String coutry) {
        this.coutry = coutry;
    }

    public boolean isHistoryData() {
        return historyData;
    }

    public void setHistoryData(boolean historyData) {
        this.historyData = historyData;
    }

    public boolean isFixtures() {
        return fixtures;
    }

    public void setFixtures(boolean fixtures) {
        this.fixtures = fixtures;
    }

    public boolean isLivescore() {
        return livescore;
    }

    public void setLivescore(boolean livescore) {
        this.livescore = livescore;
    }

    public int getNumberOfMatch() {
        return numberOfMatch;
    }

    public void setNumberOfMatch(int numberOfMatch) {
        this.numberOfMatch = numberOfMatch;
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
        if (name != null) {
            hash += name.hashCode();
        }
        if (coutry != null) {
            hash += coutry.hashCode();
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
        final League other = (League) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.code == null) ? (other.code != null) : !this.code.equals(other.code)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return !((this.coutry == null) ? (other.coutry != null) : !this.coutry.equals(other.coutry));
    }
}

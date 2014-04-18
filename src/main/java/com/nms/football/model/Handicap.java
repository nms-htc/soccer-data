/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.model;

/**
 * Contain info of HANDICAP table.
 *
 * @author Cuong
 */
public class Handicap {

    private int fixtureId;
    private String asianHandicap;
    private String asianHome;
    private String asianAway;
    private String ouHandicap;
    private String ouOver;
    private String ouUnder;
    private String euHome;
    private String euDraw;
    private String euAway;

    public Handicap() {

    }

    public int getFixtureId() {
        return fixtureId;
    }

    public void setFixtureId(int fixtureId) {
        this.fixtureId = fixtureId;
    }

    public String getAsianHandicap() {
        return asianHandicap;
    }

    public void setAsianHandicap(String asianHandicap) {
        this.asianHandicap = asianHandicap;
    }

    public String getAsianHome() {
        return asianHome;
    }

    public void setAsianHome(String asianHome) {
        this.asianHome = asianHome;
    }

    public String getAsianAway() {
        return asianAway;
    }

    public void setAsianAway(String asianAway) {
        this.asianAway = asianAway;
    }

    public String getOuHandicap() {
        return ouHandicap;
    }

    public void setOuHandicap(String ouHandicap) {
        this.ouHandicap = ouHandicap;
    }

    public String getOuOver() {
        return ouOver;
    }

    public void setOuOver(String ouOver) {
        this.ouOver = ouOver;
    }

    public String getOuUnder() {
        return ouUnder;
    }

    public void setOuUnder(String ouUnder) {
        this.ouUnder = ouUnder;
    }

    public String getEuHome() {
        return euHome;
    }

    public void setEuHome(String euHome) {
        this.euHome = euHome;
    }

    public String getEuDraw() {
        return euDraw;
    }

    public void setEuDraw(String euDraw) {
        this.euDraw = euDraw;
    }

    public String getEuAway() {
        return euAway;
    }

    public void setEuAway(String euAway) {
        this.euAway = euAway;
    }
}

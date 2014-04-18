/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.model;

/**
 * Contain data of TEAM table.
 *
 * @author Cuong
 */
public class Team {

    private int id;
    private String code;
    private String name;
    private String country;
    private String stadium;
    private String homeLinkUrl;
    private String wikiLink;

    public Team() {
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }

    public String getHomeLinkUrl() {
        return homeLinkUrl;
    }

    public void setHomeLinkUrl(String homeLinkUrl) {
        this.homeLinkUrl = homeLinkUrl;
    }

    public String getWikiLink() {
        return wikiLink;
    }

    public void setWikiLink(String wikiLink) {
        this.wikiLink = wikiLink;
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
        if (country != null) {
            hash += country.hashCode();
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
        final Team other = (Team) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.code == null) ? (other.code != null) : !this.code.equals(other.code)) {
            return false;
        }
        if ((this.name == null) ? (other.name != null) : !this.name.equals(other.name)) {
            return false;
        }
        return !((this.country == null) ? (other.country != null) : !this.country.equals(other.country));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.model;

import java.util.Date;

/**
 * Contain data of TIP table.
 *
 * @author Cuong
 */
public class Tip {

    private int id;
    private Date createDate;
    private int teamId;
    private String teamCode;
    private int type;
    private String mt1;
    private String mt2;
    private String mt3;
    private String mt4;
    private String mt5;
    private String mt6;
    private String properties;

    public Tip() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getMt1() {
        return mt1;
    }

    public void setMt1(String mt1) {
        this.mt1 = mt1;
    }

    public String getMt2() {
        return mt2;
    }

    public void setMt2(String mt2) {
        this.mt2 = mt2;
    }

    public String getMt3() {
        return mt3;
    }

    public void setMt3(String mt3) {
        this.mt3 = mt3;
    }

    public String getMt4() {
        return mt4;
    }

    public void setMt4(String mt4) {
        this.mt4 = mt4;
    }

    public String getMt5() {
        return mt5;
    }

    public void setMt5(String mt5) {
        this.mt5 = mt5;
    }

    public String getMt6() {
        return mt6;
    }

    public void setMt6(String mt6) {
        this.mt6 = mt6;
    }

    public String getProperties() {
        return properties;
    }

    public void setProperties(String properties) {
        this.properties = properties;
    }

    @Override
    public int hashCode() {
        int hash = 0;

        if (createDate != null) {
            hash += createDate.hashCode();
        }
        if (teamId != 0) {
            hash += teamId;
        }
        if (teamCode != null) {
            hash += teamCode.hashCode();
        }
        if (type != 0) {
            hash += type;
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
        final Tip other = (Tip) obj;
        if (this.createDate != other.createDate && (this.createDate == null || !this.createDate.equals(other.createDate))) {
            return false;
        }
        if (this.teamId != other.teamId) {
            return false;
        }
        if ((this.teamCode == null) ? (other.teamCode != null) : !this.teamCode.equals(other.teamCode)) {
            return false;
        }
        return this.type == other.type;
    }
}

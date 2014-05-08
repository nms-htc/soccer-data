/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.xmlsoccer.saxhandler;

import com.nms.football.model.LeagueStanding;
import com.nms.football.util.ConvertUtils;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/**
 *
 * @author Tiger_Cave
 */
public class LeagueStandingSaxHandler extends XmlSoccerSaxHandler<LeagueStanding> {

    private List<LeagueStanding> standings;
    private LeagueStanding tmpStanding;
    private String tmpStr;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        tmpStr = "";
        if ("TeamLeagueStanding".equals(qName)) {
            if (standings == null) {
                standings = new ArrayList<LeagueStanding>();
            }
            tmpStanding = new LeagueStanding();
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if ("TeamLeagueStanding".equals(qName)) {
            standings.add(tmpStanding);
        } else if ("Team".equals(qName)) {
            tmpStanding.setTeam(tmpStr);
        } else if ("Team_Id".equals(qName)) {
            tmpStanding.setTeamId(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("Played".equals(qName)) {
            tmpStanding.setPlayed(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("PlayedAtHome".equals(qName)) {
            tmpStanding.setPlayedAtHome(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("PlayedAway".equals(qName)) {
            tmpStanding.setPlayedAway(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("Won".equals(qName)) {
            tmpStanding.setWon(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("Draw".equals(qName)) {
            tmpStanding.setDraw(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("Lost".equals(qName)) {
            tmpStanding.setLost(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("Goals_For".equals(qName)) {
            tmpStanding.setGoalsFor(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("Goals_Against".equals(qName)) {
            tmpStanding.setGoalsAgainst(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("Goal_Difference".equals(qName)) {
            tmpStanding.setGoalsDifference(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("Points".equals(qName)) {
            tmpStanding.setPoints(ConvertUtils.parseStr2Int(tmpStr));
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String string = new String(ch, start, length);
        tmpStr += string;
    }

    @Override
    public List<LeagueStanding> getResult() {
        return standings;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.xmlsoccer.saxhandler;

import com.nms.football.model.FixtureHistory;
import com.nms.football.util.ConvertUtils;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/**
 *
 * @author Cuong
 */
public class FixtureHistorySaxHandler extends XmlSoccerSaxHandler<FixtureHistory> {

    private List<FixtureHistory> fixtureHistories;
    private FixtureHistory tmpFixtureHistory;
    private String tmpStr;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        tmpStr = "";

        if ("Match".equals(qName)) {
            if (fixtureHistories == null) {
                fixtureHistories = new ArrayList<FixtureHistory>();
            }
            tmpFixtureHistory = new FixtureHistory();
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if ("Match".equals(qName)) {
            fixtureHistories.add(tmpFixtureHistory);
        } else if ("Id".equals(qName)) {
            tmpFixtureHistory.setId(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("FixtureMatch_Id".equals(qName)) {
            tmpFixtureHistory.setFixtureId(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("Date".equals(qName)) {
            tmpFixtureHistory.setDate(ConvertUtils.parserXmlSoccerDate(tmpStr));
        } else if ("Round".equals(qName)) {
            tmpFixtureHistory.setRound(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("Spectators".equals(qName)) {
            tmpFixtureHistory.setSpectators(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("League".equals(qName)) {
            tmpFixtureHistory.setLeague(tmpStr);
        } else if ("HomeTeam".equals(qName)) {
            tmpFixtureHistory.setHomeTeam(tmpStr);
        } else if ("HomeTeam_Id".equals(qName)) {
            tmpFixtureHistory.setHomeTeamId(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("HomeCorners".equals(qName)) {
            tmpFixtureHistory.setHomeCorners(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("HomeGoals".equals(qName)) {
            tmpFixtureHistory.setHomeGoals(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("HalfTimeHomeGoals".equals(qName)) {
            tmpFixtureHistory.setHalfTimeHomeGoals(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("HomeShots".equals(qName)) {
            tmpFixtureHistory.setHomeShorts(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("HomeShotsOnTarget".equals(qName)) {
            tmpFixtureHistory.setHomeShortOnTarget(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("HomeFouls".equals(qName)) {
            tmpFixtureHistory.setHomeFauls(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("HomeGoalDetails".equals(qName)) {
            tmpFixtureHistory.setHomeGoalDetails(tmpStr);
        } else if ("HomeLineupGoalkeeper".equals(qName)) {
            tmpFixtureHistory.setHomeLineupGoalkeeper(tmpStr);
        } else if ("HomeLineupDefense".equals(qName)) {
            tmpFixtureHistory.setHomeLineupDefense(tmpStr);
        } else if ("HomeLineupMidfield".equals(qName)) {
            tmpFixtureHistory.setHomeLineupMidfield(tmpStr);
        } else if ("HomeLineupForward".equals(qName)) {
            tmpFixtureHistory.setHomeLineupForward(tmpStr);
        } else if ("HomeLineUpSubstitutes".equals(qName)) {
            tmpFixtureHistory.setHomeLineupSubstitutes(tmpStr);
        } else if ("HomeLineUpCoach".equals(qName)) {
            tmpFixtureHistory.setHomeLineupCoach(tmpStr);
        } else if ("HomeYellowCards".equals(qName)) {
            tmpFixtureHistory.setHomeYellowCards(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("HomeRedCards".equals(qName)) {
            tmpFixtureHistory.setHomeRedCards(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("HomeTeamFormation".equals(qName)) {
            tmpFixtureHistory.setHomeTeamFormation(tmpStr);
        } else if ("AwayTeam".equals(qName)) {
            tmpFixtureHistory.setAwayTeam(tmpStr);
        } else if ("AwayTeam_Id".equals(qName)) {
            tmpFixtureHistory.setAwayTeamId(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("AwayCorners".equals(qName)) {
            tmpFixtureHistory.setAwayCorners(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("AwayGoals".equals(qName)) {
            tmpFixtureHistory.setAwayGoals(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("HalfTimeAwayGoals".equals(qName)) {
            tmpFixtureHistory.setHalfTimeAwayGoals(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("AwayShots".equals(qName)) {
            tmpFixtureHistory.setAwayShorts(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("AwayShotsOnTarget".equals(qName)) {
            tmpFixtureHistory.setAwayShortOnTarget(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("AwayFouls".equals(qName)) {
            tmpFixtureHistory.setAwayFauls(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("AwayGoalDetails".equals(qName)) {
            tmpFixtureHistory.setAwayGoalDetais(tmpStr);
        } else if ("AwayLineupGoalkeeper".equals(qName)) {
            tmpFixtureHistory.setAwayLineupGoalkeeper(tmpStr);
        } else if ("AwayLineupDefense".equals(qName)) {
            tmpFixtureHistory.setAwayLineupDefense(tmpStr);
        } else if ("AwayLineupMidfield".equals(qName)) {
            tmpFixtureHistory.setAwayLineupMidfield(tmpStr);
        } else if ("AwayLineupForward".equals(qName)) {
            tmpFixtureHistory.setAwayLineupForward(tmpStr);
        } else if ("AwayLineUpSubstitutes".equals(qName)) {
            tmpFixtureHistory.setAwayLineupSubsitutes(tmpStr);
        } else if ("AwayLineUpCoach".equals(qName)) {
            tmpFixtureHistory.setAwayLineupCoach(tmpStr);
        } else if ("AwayYellowCards".equals(qName)) {
            tmpFixtureHistory.setAwayYellowCards(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("AwayRedCards".equals(qName)) {
            tmpFixtureHistory.setAwayRedCards(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("AwayTeamFormation".equals(qName)) {
            tmpFixtureHistory.setAwayTeamFormation(tmpStr);
        } else if ("HomeTeamYellowCardDetails".equals(qName)) {
            tmpFixtureHistory.setHomeTeamYellowCardDetails(tmpStr);
        } else if ("AwayTeamYellowCardDetails".equals(qName)) {
            tmpFixtureHistory.setAwayTeamYellowCardDetails(tmpStr);
        } else if ("HomeTeamRedCardDetails".equals(qName)) {
            tmpFixtureHistory.setHomeTeamRedCardDetails(tmpStr);
        } else if ("AwayTeamRedCardDetails".equals(qName)) {
            tmpFixtureHistory.setAwayTeamRedCardDetails(tmpStr);
        } else if ("HomeSubDetails".equals(qName)) {
            tmpFixtureHistory.setHomeSubDetails(tmpStr);
        } else if ("AwaySubDetails".equals(qName)) {
            tmpFixtureHistory.setAwaySubDetails(tmpStr);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String string = new String(ch, start, length);
        tmpStr += string;
    }

    @Override
    public List<FixtureHistory> getResult() {
        return fixtureHistories;
    }

}

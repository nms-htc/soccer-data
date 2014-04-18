/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.xmlsoccer.saxhandler;

import com.nms.football.model.Fixture;
import com.nms.football.util.ConvertUtils;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/**
 *
 * @author Cuong
 */
public class FixtureSaxHandler extends XmlSoccerSaxHandler<Fixture> {

    private List<Fixture> fixtures = null;
    private Fixture tmpFixture;
    private String tmpStr;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        tmpStr = "";
        
        if ("Match".equals(qName)) {
            if (fixtures == null) {
                fixtures = new ArrayList<Fixture>();
            }
            tmpFixture = new Fixture();
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if ("Match".equals(qName)) {
            fixtures.add(tmpFixture);
        } else if ("Id".equals(qName)) {
            tmpFixture.setId(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("Date".equals(qName)) {
            tmpFixture.setDate(ConvertUtils.parserXmlSoccerDate(tmpStr));
        } else if ("League".equals(qName)) {
            tmpFixture.setLeague(tmpStr);
        } else if ("Round".equals(qName)) {
            tmpFixture.setRound(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("Spectators".equals(qName)) {
            tmpFixture.setSpectators(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("HomeTeam".equals(qName)) {
            tmpFixture.setHomeTeam(tmpStr);
        } else if ("HomeTeam_Id".equals(qName)) {
            tmpFixture.setHomeTeamId(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("AwayTeam".equals(qName)) {
            tmpFixture.setAwayTeam(tmpStr);
        } else if ("AwayTeam_Id".equals(qName)) {
            tmpFixture.setAwayTeamId(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("Time".equals(qName)) {
            tmpFixture.setTime(tmpStr);
        } else if ("HomeGoals".equals(qName)) {
            tmpFixture.setHomeGoals(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("AwayGoals".equals(qName)) {
            tmpFixture.setAwayGoals(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("HomeGoalDetails".equals(qName)) {
            tmpFixture.setHomeGoalDetals(tmpStr);
        } else if ("AwayGoalDetails".equals(qName)) {
            tmpFixture.setAwayGoalDetails(tmpStr);
        } else if ("HomeLineupGoalkeeper".equals(qName)) {
            tmpFixture.setHomeLineupGoalkeeper(tmpStr);
        } else if ("AwayLineupGoalkeeper".equals(qName)) {
            tmpFixture.setAwayLineupGoalKeeper(tmpStr);
        } else if ("HomeLineupDefense".equals(qName)) {
            tmpFixture.setHomeLineupDefense(tmpStr);
        } else if ("AwayLineupDefense".equals(qName)) {
            tmpFixture.setAwayLineupDefense(tmpStr);
        } else if ("HomeLineupMidfield".equals(qName)) {
            tmpFixture.setHomeLineupMidfield(tmpStr);
        } else if ("AwayLineupMidfield".equals(qName)) {
            tmpFixture.setAwayLineupMidfield(tmpStr);
        } else if ("HomeLineupForward".equals(qName)) {
            tmpFixture.setHomeLineupForward(tmpStr);
        } else if ("AwayLineupForward".equals(qName)) {
            tmpFixture.setAwayLineupForward(tmpStr);
        } else if ("HomeLineupSubstitutes".equals(qName)) {
            tmpFixture.setHomeLineupSubstitutes(tmpStr);
        } else if ("AwayLineupSubstitutes".equals(qName)) {
            tmpFixture.setAwayLineupSubstitutes(tmpStr);
        } else if ("HomeLineupCoach".equals(qName)) {
            tmpFixture.setHomeLineupCoach(tmpStr);
        } else if ("AwayLineupCoach".equals(qName)) {
            tmpFixture.setAwayLineupCoach(tmpStr);
        } else if ("HomeSubDetails".equals(qName)) {
            tmpFixture.setHomeSubDetails(tmpStr);
        } else if ("AwaySubDetails".equals(qName)) {
            tmpFixture.setAwaySubDetails(tmpStr);
        } else if ("HomeTeamFormation".equals(qName)) {
            tmpFixture.setHomeTeamFormation(tmpStr);
        } else if ("AwayTeamFormation".equals(qName)) {
            tmpFixture.setAwayTeamFormation(tmpStr);
        } else if ("Location".equals(qName)) {
            tmpFixture.setLocation(tmpStr);
        } else if ("Stadium".equals(qName)) {
            tmpFixture.setStadium(tmpStr);
        } else if ("HomeTeamYellowCardDetails".equals(qName)) {
            tmpFixture.setHomeTeamYellowCardDetails(tmpStr);
        } else if ("AwayTeamYellowCardDetails".equals(qName)) {
            tmpFixture.setAwayTeamYellowCardDetails(tmpStr);
        } else if ("HomeTeamRedCardDetails".equals(qName)) {
            tmpFixture.setHomeTeamRedCardDetails(tmpStr);
        } else if ("AwayTeamRedCardDetails".equals(qName)) {
            tmpFixture.setAwayTeamRedCardDetails(tmpStr);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        String string = new String(ch, start, length);
        tmpStr += string;
    }

    @Override
    public List<Fixture> getResult() {
        return fixtures;
    }
}

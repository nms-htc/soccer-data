/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.xmlsoccer.saxhandler;

import com.nms.football.model.Team;
import com.nms.football.util.ConvertUtils;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/**
 *
 * @author Cuong
 */
public class TeamSaxHandler extends XmlSoccerSaxHandler<Team> {

    private List<Team> teams = null;
    private Team tmpTeam;
    private String tmpStr = null;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        tmpStr = "";
        if ("Team".equals(qName)) {
            if (teams == null) {
                teams = new ArrayList<Team>();
            }
            tmpTeam = new Team();
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if ("Team".equals(qName)) {
            
            teams.add(tmpTeam);
        } else if ("Team_Id".equals(qName)) {
            
            tmpTeam.setId(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("Name".equals(qName)) {
            
            tmpTeam.setName(tmpStr);
        } else if ("Country".equals(qName)) {
            
            tmpTeam.setCountry(tmpStr);
        } else if ("Stadium".equals(qName)) {
            
            tmpTeam.setStadium(tmpStr);
        } else if ("HomePageURL".equals(qName)) {
            
            tmpTeam.setHomeLinkUrl(tmpStr);
        } else if ("WIKILink".equals(qName)) {
            
            tmpTeam.setWikiLink(tmpStr);
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        String string = new String(ch, start, length);
        tmpStr += string;
    }

    @Override
    public List<Team> getResult() {
        return teams;
    }

}

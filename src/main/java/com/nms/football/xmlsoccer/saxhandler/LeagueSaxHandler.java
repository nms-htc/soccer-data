/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.xmlsoccer.saxhandler;

import com.nms.football.model.League;
import com.nms.football.util.ConvertUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.xml.bind.DatatypeConverter;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/**
 *
 * @author Cuong
 */
public class LeagueSaxHandler extends XmlSoccerSaxHandler<League> {

    private List<League> leagues = null;
    private League tmpLeague;
    private String tmpStr;    

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        
        tmpStr = "";

        if ("League".equals(qName)) {
            
            if (leagues == null) {
                leagues = new ArrayList<League>();
            }
            tmpLeague = new League();
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

        if ("League".equals(qName)) {
            leagues.add(tmpLeague);
        } else if ("Id".equals(qName)) {
            
            tmpLeague.setId(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("Name".equals(qName)) {
            
            tmpLeague.setName(tmpStr);
        } else if ("Country".equals(qName)) {
            tmpLeague.setCoutry(tmpStr);
        } else if ("Historical_Data".equals(qName)) {
            if (tmpStr.equalsIgnoreCase("Yes")) {
                tmpLeague.setHistoryData(true);
            }
            
        } else if ("Fixtures".equals(qName)) {
            if (tmpStr.equalsIgnoreCase("Yes")) {
                tmpLeague.setFixtures(true);
            }
        } else if ("Livescore".equals(qName)) {
            if (tmpStr.equalsIgnoreCase("Yes")) {
                tmpLeague.setLivescore(true);
            }
        } else if ("NumberOfMatches".equals(qName)) {
            tmpLeague.setNumberOfMatch(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("LatestMatch".equals(qName)) {
            Date date = ConvertUtils.parserXmlSoccerDate(tmpStr);
            //tmpLeague.setL
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        
        String string = new String(ch, start, length);
        tmpStr += string;
    }

    @Override
    public List<League> getResult() {
        
        return leagues;
    }
}

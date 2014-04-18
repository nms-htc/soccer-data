/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.xmlsoccer.saxhandler;

import com.nms.football.model.TopScore;
import com.nms.football.util.ConvertUtils;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;

/**
 *
 * @author Cuong
 */
public class TopScoreSaxHandler extends XmlSoccerSaxHandler<TopScore> {

    private List<TopScore> topscores = null;
    private TopScore tmpTopScore;
    private String tmpStr;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

        tmpStr = "";

        if ("Topscorer".equals(qName)) {
            if (topscores == null) {
                topscores = new ArrayList<TopScore>();
            }
            tmpTopScore = new TopScore();
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if ("Topscorer".equals(qName)) {
            topscores.add(tmpTopScore);
        } else if ("Rank".equals(qName)) {
            tmpTopScore.setRank(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("Name".equals(qName)) {
            tmpTopScore.setName(tmpStr);
        } else if ("TeamName".equals(qName)) {
            tmpTopScore.setTeamName(tmpStr);
        } else if ("Team_Id".equals(qName)) {
            tmpTopScore.setTeamId(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("Nationality".equals(qName)) {
            tmpTopScore.setNationality(tmpStr);
        } else if ("Goals".equals(qName)) {
            tmpTopScore.setGoals(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("FirstScorer".equals(qName)) {
            tmpTopScore.setFirstSoccer(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("Penalties".equals(qName)) {
            tmpTopScore.setPenalties(ConvertUtils.parseStr2Int(tmpStr));
        } else if ("MissedPenalties".equals(qName)) {
            tmpTopScore.setMissedPenalties(ConvertUtils.parseStr2Int(tmpStr));
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        String string = new String(ch, start, length);
        tmpStr += string;
    }

    @Override
    public List<TopScore> getResult() {
        return topscores;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nms.football.xmlsoccer.saxhandler;

import java.util.List;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author Cuong
 * @param <T>
 */
public abstract class XmlSoccerSaxHandler<T> extends DefaultHandler {
    public abstract List<T> getResult();
}

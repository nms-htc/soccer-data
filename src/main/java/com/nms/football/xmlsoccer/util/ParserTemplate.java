/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.xmlsoccer.util;

import com.nms.football.exception.FootballGetterException;
import com.nms.football.xmlsoccer.saxhandler.XmlSoccerSaxHandler;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/**
 *
 * @author Cuong
 * @param <T> a model class.
 */
public class ParserTemplate<T> {

    // Logger
    private static final Logger _logger = Logger.getLogger(ParserTemplate.class.getName());

    public List<T> get(String urlStr, XmlSoccerSaxHandler<T> handler) {
        List<T> result = null;
        URL url = null;
        InputStream is = null;
        URLConnection conn = null;
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();

        try {
            url = new URL(urlStr);
        } catch (MalformedURLException ex) {
            _logger.log(Level.SEVERE, "Malformed url error with url=" + urlStr, ex);
            throw new FootballGetterException("Malformed url error with url=" + urlStr, ex);
        }

        try {
            conn = url.openConnection();
        } catch (IOException ex) {
            _logger.log(Level.SEVERE, "Cannot open connection with url=" + urlStr, ex);
            throw new FootballGetterException("Cannot open connection with url=" + urlStr, ex);
        }

        if (conn != null) {
            try {
                conn.connect();
                is = conn.getInputStream();
                SAXParser saxParser = saxParserFactory.newSAXParser();
                saxParser.parse(is, handler);
                result = handler.getResult();
            } catch (IOException ex) {
                _logger.log(Level.SEVERE, "a IO error occur during processing(url = " + urlStr + ");", ex);
                throw new FootballGetterException("a SAX error occur during processing(url = " + urlStr + ");", ex);
            } catch (SAXException ex) {
                _logger.log(Level.SEVERE, "a SAX error occur during processing(url = " + urlStr + ");", ex);
                throw new FootballGetterException("a SAX error occur during processing(url = " + urlStr + ");", ex);
            } catch (ParserConfigurationException ex) {
                _logger.log(Level.SEVERE, "Cannot create saxPaser", ex);
                throw new FootballGetterException("Cannot create saxPaser", ex);
            } finally {
                if (is != null) {
                    try {
                        is.close();
                    } catch (IOException ex) {
                        _logger.log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
        
        return result;
    }
}

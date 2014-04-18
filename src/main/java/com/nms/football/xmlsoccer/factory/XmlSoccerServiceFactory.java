/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nms.football.xmlsoccer.factory;

import com.nms.football.xmlsoccer.XmlSoccerService;
import com.nms.football.xmlsoccer.impl.XmlSoccerServiceImpl;

/**
 *
 * @author Cuong
 */
public class XmlSoccerServiceFactory {
    private static XmlSoccerService service;
    
    public static XmlSoccerService getService() {
        if (service == null) {
            service = new XmlSoccerServiceImpl();
        }
        
        return service;
    }
}

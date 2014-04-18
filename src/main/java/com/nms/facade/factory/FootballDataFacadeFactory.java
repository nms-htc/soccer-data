/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nms.facade.factory;

import com.nms.facade.FootballDataFacade;
import com.nms.facade.impl.FootballDataFacadeImpl;

/**
 *
 * @author Cuong
 */
public class FootballDataFacadeFactory {
    private static FootballDataFacade footballDataFacade;
    
    public static FootballDataFacade getInstase() {
        if (footballDataFacade == null) {
            footballDataFacade = new FootballDataFacadeImpl();
        }
        return footballDataFacade;
    }
}

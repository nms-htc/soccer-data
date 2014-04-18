/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.util;

import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cuong
 */
public class Utils {

    private static final Logger _logger = Logger.getLogger(Utils.class.getName());
    private static Properties properties;

    static {
        try {
            loadProps();
        } catch (IOException e) {
            _logger.log(Level.SEVERE, "Can not load 'config/config.properties' resource", e);
        }

    }

    private static void loadProps() throws IOException {
        properties = new Properties();
        properties.load(Utils.class.getClassLoader().getResourceAsStream("config/config.properties"));
    }

    public static Properties getProperties() {
        if (properties == null) {
            try {
                loadProps();
            } catch (IOException e) {
                _logger.log(Level.SEVERE, "Can not load 'config/config.properties' resource", e);
            }
        }

        return properties;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nms.football.util;

import java.util.Properties;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Cuong
 */
@Ignore
public class UtilsTest {
    
    public UtilsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of getProperties method, of class Utils.
     */
    @Test
    public void testGetProperties() {
        System.out.println("getProperties");
        Properties result = Utils.getProperties();
        assertEquals(result.getProperty("db.oracle.jdbc.url"), "jdbc:oracle:thin:@localhost:1521:ORCL");
    }
}

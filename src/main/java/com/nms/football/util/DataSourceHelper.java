/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.util;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Cuong
 */
public class DataSourceHelper {

    private static OracleDataSource dataSource = null;

    private static DataSource getDataSource() throws SQLException {
        if (dataSource == null) {
            dataSource = new OracleDataSource();
            dataSource.setURL(Utils.getProperties().getProperty("db.oracle.jdbc.url"));
            dataSource.setUser(Utils.getProperties().getProperty("db.oracle.jdbc.username"));
            dataSource.setPassword(Utils.getProperties().getProperty("db.oracle.jdbc.password"));
        }

        return dataSource;
    }

    public static Connection createConnection() throws SQLException {
        return getDataSource().getConnection();
    }
}

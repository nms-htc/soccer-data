/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.dao.impl;

import com.nms.football.dao.BaseDao;
import com.nms.football.exception.FootballGetterException;
import com.nms.football.util.DataSourceHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cuong
 * @param <T>
 */
public abstract class BaseDaoImpl<T> implements BaseDao<T> {

    private static final Logger _logger = Logger.getLogger(BaseDaoImpl.class.getName());

    @Override
    public int saveOrUpdate(List<T> entities) {
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = DataSourceHelper.createConnection();
            conn.setAutoCommit(false);
            
            processSaveOrUpdate(conn, pstm, entities);
            
            conn.commit();
        } catch (SQLException ex) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex1) {
                    _logger.log(Level.SEVERE, "Error when try roleback database", ex1);
                }
            }
            throw new FootballGetterException("Error when saveOrupdate database", ex);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException ex) {
                    _logger.log(Level.SEVERE, "Error when close connection.", ex);
                }
            }

            if (pstm != null) {
                try {
                    pstm.close();
                } catch (SQLException ex) {
                    _logger.log(Level.SEVERE, "Error when close prepred statement.", ex);
                }
            }
        }

        return 0;
    }

    protected abstract void processSaveOrUpdate(Connection conn,PreparedStatement pstm, List<T> entities) throws SQLException;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nms.football.dao;

import java.util.List;

/**
 *
 * @author Cuong
 * @param <T> entity class
 */
public interface BaseDao<T> {
    public int saveOrUpdate(List<T> entities);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.dao;

import com.nms.football.model.Team;
import java.util.List;

/**
 *
 * @author Cuong
 */
public interface TeamDao extends BaseDao<Team> {
    public void updateWithLeagueAndSession(int leagueId, String session, List<Team> teams);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nms.football.dao.impl;

import com.nms.football.dao.LeagueDao;
import com.nms.football.model.League;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Logger;

/**
 *
 * @author Cuong
 */
public class LeagueDaoImpl extends BaseDaoImpl<League> implements LeagueDao {

    private static final Logger _logger = Logger.getLogger(LeagueDaoImpl.class.getName());

    @Override
    protected void processSaveOrUpdate(Connection conn, PreparedStatement pstm, List<League> entities) throws SQLException {
        String sql = "MERGE INTO league a USING "
                + "(SELECT ? as id, ? as name, ? as country,  ? as history_data, "
                + "? as fixture, ? as livescore, ? as number_of_match FROM DUAL) b "
                + "ON (a.id = b.id) "
                + "WHEN MATCHED THEN "
                + "UPDATE SET "
                + "a.name = b.name, "
                + "a.country = b.country, "
                + "a.history_data = b.history_data, "
                + "a.fixture = b.fixture, "
                + "a.livescore= b.livescore, "
                + "a.number_of_match = b.number_of_match "
                + "WHEN NOT MATCHED THEN "
                + "INSERT (id, name, country, history_data, fixture, livescore, number_of_match) "
                + "VALUES "
                + "(b.id,b.name,b.country,b.history_data,b.fixture,b.livescore,b.number_of_match)";
        pstm = conn.prepareStatement(sql);

        int batchSize = 100;

        for (int count = 0; count < entities.size(); count++) {
            League league = entities.get(count);
            
            pstm.setInt(1, league.getId());
            pstm.setString(2, league.getName());
            pstm.setString(3, league.getCoutry());
            pstm.setBoolean(4, league.isHistoryData());
            pstm.setBoolean(5, league.isFixtures());
            pstm.setBoolean(6, league.isLivescore());
            pstm.setInt(7, league.getNumberOfMatch());
            
            pstm.addBatch();

            if (count % batchSize == 0) {
                pstm.executeBatch();
            }
        }

        pstm.executeBatch();
    }

}

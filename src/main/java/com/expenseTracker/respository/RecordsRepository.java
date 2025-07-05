package com.expenseTracker.respository;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@RequiredArgsConstructor
public class RecordsRepository {
    private final NamedParameterJdbcTemplate jdbcTemplate;

    //crud operations
    // create return boolean --> {type, amount, description}
    public boolean createTransaction(String type, double amount, String description) {
        String sql = "INSERT INTO transactions (type, amount, description) VALUES (:type, :amount, :description)";
        // Using named parameters for better readability and maintainability
         MapSqlParameterSource params = new MapSqlParameterSource();
         params.addValue("type", type);
            params.addValue("amount", amount);
            params.addValue("description", description);
            jdbcTemplate.query(sql, params, rs -> { });
            return true;
    }
}

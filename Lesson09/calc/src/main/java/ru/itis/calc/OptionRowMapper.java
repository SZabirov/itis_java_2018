package ru.itis.calc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OptionRowMapper implements RowMapper<Option> {
    @Override
    public Option mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id = rs.getInt("id");
        String text = rs.getString("text");
        Option o = new Option(id, text);
        return o;
    }
}

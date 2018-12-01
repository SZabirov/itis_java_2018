package ru.itis.calc;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

//RowMapper - такой объект, который по конкретной строке составляет новый объект некоторого типа
//RowMapper используется, например, для того, чтобы из табличного результата получить список некоторых объектов
public class PollRowMapper implements RowMapper<Poll> {

    //ResultSet rs - объект, хранящий строки
    @Override
    public Poll mapRow(ResultSet rs, int rowNum) throws SQLException {
        int id = rs.getInt("id");
        String text = rs.getString("question");
        Poll p = new Poll(id, text);
        return p;
    }
}

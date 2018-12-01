package ru.itis.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PollController {
    @Autowired//просит Spring проинициализировать данное поле
    private JdbcTemplate jdbcTemplate;//объект для доступа к базе данных

    @RequestMapping("/polls")
    String getAllPolls(Model model) {
        PollRowMapper mapper = new PollRowMapper();
        List<Poll> allPolls = jdbcTemplate.query(
                "SELECT id, question FROM poll;", mapper);

        model.addAttribute("questions", allPolls);
        return "polls_template";
    }
}

package ru.itis.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/poll")
    String poll(Model model,
                @RequestParam int id) {
        OptionRowMapper mapper = new OptionRowMapper();
        List<Option> options = jdbcTemplate.query(
          "SELECT id, text FROM option " +
                  "WHERE poll_id = " + id + " ORDER BY id", mapper);
        model.addAttribute("options", options);
        return "poll_template";
    }

    @RequestMapping("/saveanswer")
    String saveAnswer(Model model,
                      @RequestParam int option) {
        jdbcTemplate.update("UPDATE option SET " +
                "count = count + 1 WHERE id = " + option);
        return "redirect:/polls";
    }
}
package ru.itis.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class PollController {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/polls")
    String getAllPolls(Model model) {
        List<String> allPolls = jdbcTemplate.queryForList(
                "SELECT question FROM poll;", String.class);
        model.addAttribute("str0", allPolls.get(0));
        model.addAttribute("str1", allPolls.get(1));
        return "polls_template";
    }
}

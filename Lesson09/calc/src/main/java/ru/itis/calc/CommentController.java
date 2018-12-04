package ru.itis.calc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CommentController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @RequestMapping("/sendfeedback")
    String send(@RequestParam String comment) {
        String query = "INSERT INTO feedback(comment) " +
                "VALUES (?)";
        Object[] params = {comment};
        jdbcTemplate.update(query, params);
        return "redirect:/polls";
    }

    @RequestMapping("/feedback")
    String feedback() {
        return "feedback_template";
    }
}

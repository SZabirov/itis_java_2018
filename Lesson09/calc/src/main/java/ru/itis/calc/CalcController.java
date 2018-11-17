package ru.itis.calc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalcController {
    @RequestMapping("/")
    public String index() {
        return "main";
    }

    @RequestMapping("/result")
    public String result(@RequestParam String operation,
                         @RequestParam double num1, @RequestParam double num2,
                         Model model) {
        double res = 0;
        if (operation.equals("+")) {
            res = num1 + num2;
        }
        if (operation.equals("-")) {
            res = num1 - num2;
        }
        model.addAttribute("result", res);
        return "result_template";
    }

}












package ru.itis.greeting;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Hello!";
    }

    @RequestMapping("/greeting")
    public String greeting() {
        return "<html>\n" +
                "\t<head>\n" +
                "\t\t<title>Приветствие</title>\n" +
                "\t</head>\n" +
                "\t<body>\n" +
                "\t\t<form action=\"/sayhello\">\n" +
                "\t\t\t<input name=\"username\" type=\"text\">\n" +
                "\t\t\t<input type=\"submit\">\n" +
                "\t\t</form>\n" +
                "\t</body>\n" +
                "</html>";
    }

    @RequestMapping("/sayhello")
    public String sayHello(@RequestParam String username) {
        return "Привет, " + username;
    }
}

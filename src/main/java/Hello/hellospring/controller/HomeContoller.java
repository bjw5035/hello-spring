package Hello.hellospring.controller;

import Hello.hellospring.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeContoller {

    @GetMapping("/")
    public String home() {
        return "home";
    }

}

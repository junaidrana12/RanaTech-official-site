package com.RanaTech.Portfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String abount(){
        return "index";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }
    @GetMapping("/services")
    public String services() {
        return "services";
    }

    @GetMapping("/portfolio")
    public String portfolio() {
        return "portfolio";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }
}

package com.example.hw5.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
@Controller
public class homeController {

    @GetMapping("/home")
    public String home() {
        return "home";
        }
    
    @GetMapping("/partials")
    public String aboutus() {
        return "index";
    }
    @GetMapping("/Books")
    public String Books() {
        return "books";
    }
}

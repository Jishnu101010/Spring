package com.example.cw3.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model) {
    	String message="welcome all , Learning is super";
        model.addAttribute("message", message);
        String hello ="<h1>Hello ,from Spring Boot!</h1>";
        model.addAttribute("hello", hello);
        boolean isLoggedIn = true;
        model.addAttribute("isLoggedIn", isLoggedIn);
        return "cw3"; 
    }
}
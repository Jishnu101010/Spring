package com.example.hw3.Controller;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class movieController {

    @GetMapping("/hw3")
    public String showMovie(Model model, Principal principal) {

        String title = "Inception";
        model.addAttribute("title", title);

        String description =
                "A thief who steals corporate secrets through dream-sharing technology. "
              + "He is given the inverse task of planting an idea into the mind of a CEO. "
              + "The mission becomes dangerously complex as reality blurs with dreams.";

        model.addAttribute("Description", description);

        String firstLine = description.split("\\.")[0];
        model.addAttribute("firstLine", firstLine);

        boolean isLoggedIn = (principal != null);
        model.addAttribute("isLoggedIn", isLoggedIn);

        return "hw3";
    }
}


package com.example.Project.controller;

import com.example.Project.Dto.UserDto;
import com.example.Project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    // ✅ SHOW SIGNUP PAGE
    @GetMapping("/signup")
    public String getRegistrationPage(Model model) {
        model.addAttribute("user", new UserDto());
        return "register";
    }

    // ✅ HANDLE SIGNUP
    @PostMapping("/signup")
    public String saveUser(@ModelAttribute("user") UserDto userDto,
                           Model model) {

        try {
            userService.save(userDto);
        } catch (Exception e) {
            model.addAttribute("message", "Username already exists!");
            return "register";
        }

        // ✅ redirect to login after successful signup
        return "redirect:/login";
    }

    // ✅ SHOW LOGIN PAGE
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
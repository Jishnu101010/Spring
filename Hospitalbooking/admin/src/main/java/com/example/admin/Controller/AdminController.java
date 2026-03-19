package com.example.admin.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/dashboard")
    public String dashboard(){
        return "dashboard";
    }

    @GetMapping("/doctors")
    public String doctors(){
        return "doctors";
    }

    @GetMapping("/addDoctor")
    public String addDoctor(){
        return "addDoctor";
    }

    @GetMapping("/editDoctor")
    public String editDoctor(){
        return "editDoctor";
    }

    @GetMapping("/doctorProfile")
    public String doctorProfile(){
        return "doctorProfile";
    }

    @GetMapping("/users")
    public String users(){
        return "users";
    }

    @GetMapping("/userProfile")
    public String userProfile(){
        return "userProfile";
    }

    @GetMapping("/appointments")
    public String appointments(){
        return "appointments";
    }

    @GetMapping("/reports")
    public String reports(){
        return "reports";
    }
}
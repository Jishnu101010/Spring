package com.example.hw4.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.hw4.Model.Student;

import java.util.Arrays;
import java.util.List;

@Controller
public class StudentController {

    @GetMapping("/studentinfo")
    public String studentInfo(Model model) {
        Student student = new Student(101, "Anjali Sharma", 92.5);
        model.addAttribute("student", student);
        return "studentinfo";
    }

    @GetMapping("/studentlist")
    public String studentList(Model model) {
        List<Student> students = Arrays.asList(
                new Student(101, "Anjali Sharma", 92.5),
                new Student(102, "Rohit Mehta", 85.0),
                new Student(103, "Sneha Iyer", 78.6)
        );
        model.addAttribute("students", students);
        return "studentlist";
    }
}

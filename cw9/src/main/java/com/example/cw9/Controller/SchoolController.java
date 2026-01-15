package com.example.cw9.Controller;

import com.example.cw9.Models.SchoolModel;
import com.example.cw9.Repository.StudentRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SchoolController {

    private final StudentRepository repo;

    public SchoolController(StudentRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/create")
    public String viewStudents(Model model,
                               @RequestParam(required = false) String keyword) {
        List<SchoolModel> students =
                (keyword == null) ? repo.findAll()
                                  : repo.findByNameContainingIgnoreCase(keyword);

        model.addAttribute("students", students);
        model.addAttribute("student", new SchoolModel());
        return "students";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute SchoolModel student) {
        repo.save(student);
        return "redirect:/";
    }

    @GetMapping("/edit/{id}")
    public String editStudent(@PathVariable Long id, Model model) {
        model.addAttribute("student", repo.findById(id).orElseThrow());
        model.addAttribute("students", repo.findAll());
        return "students";
    }

    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        repo.deleteById(id);
        return "redirect:/";
    }
}

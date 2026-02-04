package com.example.Project.controller;

import com.example.Project.models.Bookmark;
import com.example.Project.models.User;
import com.example.Project.service.BookmarkService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@Controller
@RequestMapping("/bookmarks")
public class BookmarkController {

    private final BookmarkService bookmarkService;

    public BookmarkController(BookmarkService bookmarkService) {
        this.bookmarkService = bookmarkService;
    }

    @GetMapping("/home")
    public String list(Model model, Principal principal) {
        model.addAttribute("bookmarks",
                bookmarkService.list(new User(), 0, 10).getContent());
        return "bookmarks";
    }

    @PostMapping("/add")
    public String add(@RequestParam String title,
                      @RequestParam String url) {
        return "redirect:/bookmarks";
    }

    @PostMapping("/edit/{id}")
    public String edit(@PathVariable Long id,
                       @RequestParam String title,
                       @RequestParam String url) {
        bookmarkService.update(id, title, url);
        return "redirect:/bookmarks";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        bookmarkService.delete(id);
        return "redirect:/bookmarks";
    }
}

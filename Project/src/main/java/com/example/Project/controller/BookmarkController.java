package com.example.Project.controller;

import java.security.Principal;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Project.models.Bookmark;
import com.example.Project.models.User;
import com.example.Project.repository.UserRepository;
import com.example.Project.service.BookmarkService;

@Controller
@RequestMapping("/bookmarks")
public class BookmarkController {

    private final BookmarkService bookmarkService;
    private final UserRepository userRepository;

    public BookmarkController(BookmarkService bookmarkService,
                              UserRepository userRepository) {
        this.bookmarkService = bookmarkService;
        this.userRepository = userRepository;
    }

    @GetMapping("/home")
    public String list(Model model,
                       Principal principal,
                       @RequestParam(defaultValue = "0") int page,
                       @RequestParam(defaultValue = "") String q) {

        User user = userRepository.findByUsername(principal.getName());

        Page<Bookmark> bookmarkPage;

        if (q != null && !q.isEmpty()) {
            bookmarkPage = bookmarkService.search(user, q, page, 5);
        } else {
            bookmarkPage = bookmarkService.list(user, page, 5);
        }

        model.addAttribute("bookmarks", bookmarkPage.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", bookmarkPage.getTotalPages());
        model.addAttribute("q", q);

        return "bookmarks";
    }

    @PostMapping("/add")
    public String add(@RequestParam String title,
                      @RequestParam String url,
                      Principal principal,
                      Model model) {

        try {
            User user = userRepository.findByUsername(principal.getName());
            bookmarkService.addBookmark(user, title, url);
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return list(model, principal, 0, "");
        }

        return "redirect:/bookmarks/home";
    }

    @PostMapping("/edit/{id}")
    public String edit(@PathVariable Long id,
                       @RequestParam String title,
                       @RequestParam String url) {
        bookmarkService.update(id, title, url);
        return "redirect:/bookmarks/home";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        bookmarkService.delete(id);
        return "redirect:/bookmarks/home";
    }
}
package com.example.Project.controller;

import com.example.Project.models.Bookmark;
import com.example.Project.models.User;
import com.example.Project.repository.UserRepository;
import com.example.Project.service.BookmarkService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/users/bookmarks") 
public class BookmarkAPIController {

    private final BookmarkService bookmarkService;
    private final UserRepository userRepository;

    public BookmarkAPIController(BookmarkService bookmarkService,
                                  UserRepository userRepository) {
        this.bookmarkService = bookmarkService;
        this.userRepository = userRepository;
    }

    @PostMapping
    public Bookmark add(@RequestBody Map<String, String> body) {

        User user = userRepository.findByUsername(body.get("username"));

        return bookmarkService.addBookmark(
                user,
                body.get("title"),
                body.get("url")
        );
    }

    @GetMapping("/{username}")
    public List<Bookmark> list(@PathVariable String username) {

        User user = userRepository.findByUsername(username);

        return bookmarkService.list(user, 0, 10).getContent();
    }
}

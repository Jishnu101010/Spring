package com.example.hw7.controller;

import com.example.hw7.Models.BookModel;
import com.example.hw7.Repository.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/new")
    public String showBookForm(Model model) {
        model.addAttribute("book", new BookModel());
        return "book-form";
    }

    @PostMapping("/books")
    public String saveBook(@ModelAttribute BookModel book) {
        bookRepository.save(book);
        return "redirect:/books";
    }

    @GetMapping("/books")
    public String listBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "book-list";
    }
}

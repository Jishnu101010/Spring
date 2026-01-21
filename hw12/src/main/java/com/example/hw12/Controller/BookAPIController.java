package com.example.hw12.Controller;

import com.example.hw12.exception.*;
import com.example.hw12.Model.Book;
import com.example.hw12.Repository.BookRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.ui.Model;
import java.util.List;


import java.util.List;

@RestController
@CrossOrigin("http://localhost:3002")
@RequestMapping("/api/books")
public class BookAPIController {

    private final BookRepository repository;

    public BookAPIController(BookRepository repository) {
        this.repository = repository;
    }

    
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return repository.save(book);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return repository.findAll();
    }

   
    @GetMapping("/details{id}")
    public Book getBookById(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));
    }

  
    @PutMapping("/update{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {

        Book book = repository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));

        book.setTitle(updatedBook.getTitle());
        book.setAuthor(updatedBook.getAuthor());
        book.setGenre(updatedBook.getGenre());
        book.setPrice(updatedBook.getPrice());
        book.setPublishedDate(updatedBook.getPublishedDate());

        return repository.save(book);
    }

   
    @DeleteMapping("/delete{id}")
    public void deleteBook(@PathVariable Long id) {
        Book book = repository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));
        repository.delete(book);
    }

   
    @GetMapping("/search")
    public List<Book> searchBooks(@RequestParam String keyword) {
        return repository.findByTitleContainingIgnoreCase(keyword);
    }
}

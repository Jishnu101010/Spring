package com.example.Project.service;

import com.example.Project.exception.BookmarklimitException;
import com.example.Project.models.Bookmark;
import com.example.Project.models.User;
import com.example.Project.repository.BookmarkRepository;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BookmarkService {

    private final BookmarkRepository bookmarkRepository;

    public BookmarkService(BookmarkRepository bookmarkRepository) {
        this.bookmarkRepository = bookmarkRepository;
    }

    public Bookmark addBookmark(User user, String title, String url) {

        if (bookmarkRepository.countByUser(user) >= 5) {
            throw new BookmarklimitException("Only 5 bookmarks allowed");
        }

        Bookmark bookmark = new Bookmark();
        bookmark.setTitle(title);
        bookmark.setUrl(url);
        bookmark.setCreatedAt(LocalDateTime.now());
        bookmark.setUser(user);

        return bookmarkRepository.save(bookmark);
    }

    public Page<Bookmark> list(User user, int page, int size) {
        return bookmarkRepository.findByUser(
                user,
                PageRequest.of(page, size, Sort.by("createdAt").descending())
        );
    }

    public Page<Bookmark> search(User user, String q, int page, int size) {
        return bookmarkRepository
                .findByUserAndTitleContainingIgnoreCaseOrUserAndUrlContainingIgnoreCase(
                        user, q, user, q, PageRequest.of(page, size)
                );
    }

    public Bookmark update(Long id, String title, String url, User user) {

        Bookmark bookmark = bookmarkRepository.findById(id).orElseThrow();

        if (!bookmark.getUser().getId().equals(user.getId())) {
            throw new RuntimeException("Unauthorized");
        }

        bookmark.setTitle(title);
        bookmark.setUrl(url);

        return bookmarkRepository.save(bookmark);
    }

    public void delete(Long id, User user) {

        Bookmark bookmark = bookmarkRepository.findById(id).orElseThrow();

        if (!bookmark.getUser().getId().equals(user.getId())) {
            throw new RuntimeException("Unauthorized");
        }

        bookmarkRepository.delete(bookmark);
    }
}
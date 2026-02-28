package com.example.Project.service;

import java.time.LocalDateTime;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.Project.exception.BookmarklimitException;
import com.example.Project.models.Bookmark;
import com.example.Project.models.User;
import com.example.Project.repository.BookmarkRepository;

@Service
public class BookmarkService {

    private final BookmarkRepository bookmarkRepository;

    public BookmarkService(BookmarkRepository bookmarkRepository) {
        this.bookmarkRepository = bookmarkRepository;
    }

    // ✅ ADD BOOKMARK WITH LIMIT
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

    // ✅ LIST WITH PAGINATION
    public Page<Bookmark> list(User user, int page, int size) {
        return bookmarkRepository.findByUser(
                user,
                PageRequest.of(page, size, Sort.by("createdAt").descending())
        );
    }

    // ✅ SEARCH
    public Page<Bookmark> search(User user, String q, int page, int size) {
        return bookmarkRepository
                .findByUserAndTitleContainingIgnoreCaseOrUserAndUrlContainingIgnoreCase(
                        user, q, user, q, PageRequest.of(page, size)
                );
    }

    // 🔐 SAFE UPDATE (VERY IMPORTANT)
    public Bookmark update(Long id, String title, String url, User user) {

        Bookmark bookmark = bookmarkRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bookmark not found"));

        // ✅ ownership check
        if (!bookmark.getUser().getId().equals(user.getId())) {
            throw new RuntimeException("Unauthorized action");
        }

        bookmark.setTitle(title);
        bookmark.setUrl(url);

        return bookmarkRepository.save(bookmark);
    }

    // 🔐 SAFE DELETE
    public void delete(Long id, User user) {

        Bookmark bookmark = bookmarkRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Bookmark not found"));

        // ✅ ownership check
        if (!bookmark.getUser().getId().equals(user.getId())) {
            throw new RuntimeException("Unauthorized action");
        }

        bookmarkRepository.delete(bookmark);
    }
}
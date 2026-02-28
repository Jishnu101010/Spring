package com.example.Project.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project.models.Bookmark;
import com.example.Project.models.User;

public interface BookmarkRepository extends JpaRepository<Bookmark, Long> {

    long countByUser(User user);

    Page<Bookmark> findByUser(User user, Pageable pageable);

    Page<Bookmark> findByUserAndTitleContainingIgnoreCaseOrUserAndUrlContainingIgnoreCase(
            User user1, String title,
            User user2, String url,
            Pageable pageable
    );
}
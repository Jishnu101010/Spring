package com.example.hw7.Repository;

import com.example.hw7.Models.BookModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookModel, Integer> {
}

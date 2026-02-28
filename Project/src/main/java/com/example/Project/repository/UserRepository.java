package com.example.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Project.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
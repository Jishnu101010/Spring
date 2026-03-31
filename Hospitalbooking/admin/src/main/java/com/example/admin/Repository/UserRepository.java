package com.example.admin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.admin.Models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
    User findByToken(String token);
    boolean existsByToken(String token);

    boolean existsByEmail(String email);
}
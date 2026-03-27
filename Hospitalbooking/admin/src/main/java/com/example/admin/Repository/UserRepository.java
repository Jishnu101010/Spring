package com.example.admin.Repository;


import com.example.admin.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserID(int UserID);
}
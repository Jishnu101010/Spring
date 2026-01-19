package com.example.cw11.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cw11.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByPhonenumber(String Phonenumber);
}
package com.example.cw13.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cw13.Model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {
    UserModel findByEmail(String email);
}
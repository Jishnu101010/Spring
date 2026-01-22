package com.example.hw13.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hw13.Model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Long> {
    UserModel findByEmail(String email);
}

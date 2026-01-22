package com.example.hw13.Controller;

import com.example.hw13.Model.UserModel;
import com.example.hw13.Repository.UserRepository;
import com.example.hw13.response.RegisterResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserAPIController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(@RequestBody UserModel user) {

        user.setPassword(passwordEncoder.encode(user.getPassword()));

        String username = user.getFirstName() + user.getLastName();
        user.setUsername(username);

        userRepository.save(user);

        RegisterResponse response =
                new RegisterResponse(user.getUsername(), user.getEmail());

        return ResponseEntity.ok(response);
    }
}

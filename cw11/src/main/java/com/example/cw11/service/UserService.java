package com.example.cw11.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.cw11.dto.UserDto;
import com.example.cw11.Model.User;
import com.example.cw11.Repository.UserRepository;

@Service
public class UserService{
   
    @Autowired
    private PasswordEncoder passwordEncoder;
   
    @Autowired
    private UserRepository userRepository;

    public User save(UserDto userDto) {
        User user = new User(userDto.getPhonenumber(), passwordEncoder.encode(userDto.getPassword()) , userDto.getusername());
        return userRepository.save(user);
    }
}
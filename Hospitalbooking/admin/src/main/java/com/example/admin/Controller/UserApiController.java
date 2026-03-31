package com.example.admin.Controller;

import com.example.admin.Models.User;
import com.example.admin.Repository.UserRepository;
import com.example.admin.Models.Booking;
import com.example.admin.Models.Doctor;

import com.example.admin.Dto.*;
import com.example.admin.Repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;
import com.example.admin.Security.TokenGenerator;
import java.util.Map;
import java.util.*;


@RestController
@RequestMapping("/api/user")
public class UserApiController {

    @Autowired
    private UserRepository userRepository;
    
    @Autowired
    private TokenGenerator tokenGenerator;
    
    @Autowired
    private PasswordEncoder passwordEncoder;
    
    @Autowired
    private BookingRepository bookingRepository;
    
    @Autowired
    private DoctorRepository doctorRepository;
    

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return ResponseEntity.ok("User registered successfully");
    }
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {
        String token = tokenGenerator.generateToken(user.getEmail(), user.getPassword());
        if (token != null) {
            return ResponseEntity.ok(Map.of("token", token));
        }
        return ResponseEntity.status(401).body("Invalid credentials");
        }
    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id) {

        Optional<User> optionalUser = userRepository.findById(id);

        if (optionalUser.isEmpty()) {
            return ResponseEntity.status(404).body("User not found");
        }

        User user = optionalUser.get();

        UserDto dto = new UserDto();
        dto.setUsername(user.getUsername());
        dto.setEmail(user.getEmail());
        dto.setAddress(user.getAddress());
        dto.setPhoneNo(user.getPhoneNo());
        dto.setDob(user.getDob());

        return ResponseEntity.ok(dto);
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(@PathVariable Long id, @RequestBody User updatedUser) {

        Optional<User> optionalUser = userRepository.findById(id);

        if (optionalUser.isEmpty()) {
            return ResponseEntity.status(404).body("User not found");
        }

        User user = optionalUser.get();

        user.setUsername(updatedUser.getUsername());
        user.setEmail(updatedUser.getEmail());
        user.setAddress(updatedUser.getAddress());
        user.setPhoneNo(updatedUser.getPhoneNo());
        user.setDob(updatedUser.getDob());

        // 🔥 re-encode password
        user.setPassword(passwordEncoder.encode(updatedUser.getPassword()));

        userRepository.save(user);

        return ResponseEntity.ok("User updated successfully");
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id) {

        if (!userRepository.existsById(id)) {
            return ResponseEntity.status(404).body("User not found");
        }

        userRepository.deleteById(id);

        return ResponseEntity.ok("User deleted successfully");
    }
    @PostMapping("/booking")
    public ResponseEntity<?> createBooking(@RequestBody Booking booking) {
    	System.out.println(booking);
        Booking savedBooking = bookingRepository.save(booking);
        return ResponseEntity.ok(savedBooking);
    }
    @GetMapping("/alldoctors")
    public List<Doctor> getAllDoctor() {
        return doctorRepository.findAll();
    }
    
    
    }
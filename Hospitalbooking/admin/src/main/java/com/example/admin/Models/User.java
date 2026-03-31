package com.example.admin.Models;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(unique = true, nullable = false)
    private String email;

    private String address;

    @Column(nullable = false)
    private Long phoneNo;

    private LocalDate dob;
    private String token;
    @Column(nullable = false)
    private String password;

    // 🔥 One User → Many Bookings
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Booking> bookings;

    // Default Constructor
    public User() {}

    // Parameterized Constructor
    public User(String username, String email, String address,
                Long phoneNo, LocalDate dob, String password) {
        this.username = username;
        this.email = email;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.password = password;
    }

    // Getters
    public Long getId() { 
    	return id; 
    	}

    public String getUsername() { 
    	return username; 
    	}

    public String getEmail() { 
    	return email; 
    	}

    public String getAddress() { 
    	return address; 
    	}

    public Long getPhoneNo() { 
    	return phoneNo; 
    	}

    public LocalDate getDob() { 
    	return dob; 
    	}

    public String getPassword() { 
    	return password; }
    public String getToken() {
    	return token;
    }

    public List<Booking> getBookings() { 
    	return bookings; }

    // Setters
    public void setId(Long id) { 
    	this.id = id; }

    public void setUsername(String username) { 
    	this.username = username; }

    public void setEmail(String email) { 
    	this.email = email; }

    public void setAddress(String address) { 
    	this.address = address; }

    public void setPhoneNo(Long phoneNo) { 
    	this.phoneNo = phoneNo; 
    	}

    public void setDob(LocalDate dob) { 
    	this.dob = dob; }

    public void setPassword(String password) { 
    	this.password = password; }
    public void setToken(String token) {
    	this.token = token;
    }

    public void setBookings(List<Booking> bookings) { 
    	this.bookings = bookings; }
}
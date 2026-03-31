package com.example.admin.Dto;

import java.time.LocalDate;

public class UserDto {

    private String username;
    private String email;
    private String address;
    private Long phoneNo;
    private LocalDate dob;
    private String password;

    // Constructor
    public UserDto(String username, String email, String address,
                   Long phoneNo, LocalDate dob, String password) {
        super();
        this.username = username;
        this.email = email;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.password = password;
    }

    // Default Constructor (IMPORTANT for Spring 🔥)
    public UserDto() {}

    // Getters & Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
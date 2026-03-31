package com.example.admin.Models;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // 🔥 Foreign Key → Doctor.id
    @ManyToOne
    @JoinColumn(name = "doctor_id", nullable = false)
    private Doctor doctor;

    // 🔥 Foreign Key → User.id
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private LocalTime time;

    private LocalDate date;

    // Default Constructor
    public Booking() {}

    // Parameterized Constructor
    public Booking(Doctor doctor, User user,
                   LocalTime time, LocalDate date) {
        this.doctor = doctor;
        this.user = user;
        this.time = time;
        this.date = date;
    }

    // Getters
    public Long getId() { 
    	return id; 
    	}

    public Doctor getDoctor() { 
    	return doctor; 
    	}

    public User getUser() { 
    	return user; 
    	}

    public LocalTime getTime() { 
    	return time; 
    	}

    public LocalDate getDate() { 
    	return date; 
    	}

    // Setters
    public void setId(Long id) { 
    	this.id = id; 
    	}

    public void setDoctor(Doctor doctor) { 
    	this.doctor = doctor; 
    	}

    public void setUser(User user) { 
    	this.user = user; 
    	}

    public void setTime(LocalTime time) { 
    	this.time = time; 
    	}

    public void setDate(LocalDate date) { 
    	this.date = date; 
    	}
}
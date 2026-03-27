package com.example.admin.Models;

import jakarta.persistence.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String specialization;

    @Column(nullable = false)
    private String qualification;

    @Lob
    @Column(nullable = false)
    private byte[] photo;

    @Column(nullable = false)
    private String experience;

    @Column(length = 1000)
    private String about;

    private Integer bookCount;

    // 🔥 One Doctor → Many Bookings
    @OneToMany(mappedBy = "doctor", cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Booking> bookings;

    // Default Constructor
    public Doctor() {}

    // Parameterized Constructor
    public Doctor(String name, String specialization, String qualification,
                  byte[] photo, String experience, String about, Integer bookCount) {
        this.name = name;
        this.specialization = specialization;
        this.qualification = qualification;
        this.photo = photo;
        this.experience = experience;
        this.about = about;
        this.bookCount = bookCount;
    }

    // Getters
    public Long getId() { return id; }

    public String getName() { return name; }

    public String getSpecialization() { return specialization; }

    public String getQualification() { return qualification; }

    public byte[] getPhoto() { return photo; }

    public String getExperience() { return experience; }

    public String getAbout() { return about; }

    public Integer getBookCount() { return bookCount; }

    public List<Booking> getBookings() { return bookings; }

    // Setters
    public void setId(Long id) { this.id = id; }

    public void setName(String name) { this.name = name; }

    public void setSpecialization(String specialization) { this.specialization = specialization; }

    public void setQualification(String qualification) { this.qualification = qualification; }

    public void setPhoto(byte[] photo) { this.photo = photo; }

    public void setExperience(String experience) { this.experience = experience; }

    public void setAbout(String about) { this.about = about; }

    public void setBookCount(Integer bookCount) { this.bookCount = bookCount; }

    public void setBookings(List<Booking> bookings) { this.bookings = bookings; }
}
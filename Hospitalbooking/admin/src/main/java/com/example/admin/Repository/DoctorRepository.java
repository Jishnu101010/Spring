package com.example.admin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.admin.Models.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
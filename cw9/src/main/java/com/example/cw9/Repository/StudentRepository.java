package com.example.cw9.Repository;

import com.example.cw9.Models.SchoolModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<SchoolModel, Long> {
    List<SchoolModel> findByNameContainingIgnoreCase(String name);
}

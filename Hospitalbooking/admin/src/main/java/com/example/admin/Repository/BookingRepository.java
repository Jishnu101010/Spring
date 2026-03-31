package com.example.admin.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.admin.Models.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
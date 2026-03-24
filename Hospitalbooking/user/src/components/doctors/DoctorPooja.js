import React from "react";
import Nav from "../../Nav";
import { useNavigate } from "react-router-dom";

function DoctorPooja() {
  const navigate = useNavigate();

  return (
    <div>
      <Nav />

      <button className="back-btn" onClick={() => navigate(-1)}>← Back</button>

      <div className="doctor-profile-card">
        <img
          src="https://i.pinimg.com/originals/1f/54/d5/1f54d53b1ad2f6187a7e527fbcde89be.jpg"
          alt="Dr Pooja"
        />

        <div className="doctor-info">
          <h1>Dr. Pooja</h1>
          <p className="special">Dermatologist</p>
          <p><b>About:</b> Expert in skin care and cosmetic treatments.</p>
          <p><b>Experience:</b> 8+ Years</p>
          <p><b>Education:</b> MBBS, MD (Dermatology)</p>
          <p><b>Hospital:</b> CityCare Hospital</p>
          <p><b>Languages:</b> English, Tamil</p>
        </div>
      </div>

      <div className="filter-section">
        <input type="date" />
        
        <button className="filter-btn">Filter</button>
      </div>

      <h2 className="page-title">Booking Slots</h2>

      <div className="slot-container">
        <div className="slot-card available"><p>10:00 AM</p><button>Book</button></div>
        <div className="slot-card available"><p>12:00 PM</p><button>Book</button></div>
        <div className="slot-card booked"><p>3:00 PM</p><button disabled>Booked</button></div>
        <div className="slot-card available"><p>6:00 PM</p><button>Book</button></div>
      </div>
    </div>
  );
}

export default DoctorPooja;
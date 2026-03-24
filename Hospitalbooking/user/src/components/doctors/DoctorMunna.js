import React from "react";
import Nav from "../../Nav";
import { useNavigate } from "react-router-dom";

function DoctorMunna() {
  const navigate = useNavigate();

  return (
    <div>
      <Nav />

      <button className="back-btn" onClick={() => navigate(-1)}>← Back</button>

      <div className="doctor-profile-card">
        <img
          src="https://images.filmibeat.com/img/2018/12/mkup-1545225244.jpg"
          alt="Dr Munna"
        />

        <div className="doctor-info">
          <h1>Dr. Munna</h1>
          <p className="special">General Physician</p>
          <p><b>About:</b> Provides complete medical care for all patients.</p>
          <p><b>Experience:</b> 10+ Years</p>
          <p><b>Education:</b> MBBS</p>
          <p><b>Hospital:</b> CityCare Hospital</p>
          <p><b>Languages:</b> English, Malayalam</p>
        </div>
      </div>

      <div className="filter-section">
        <input type="date" />
       
        <button className="filter-btn">Filter</button>
      </div>

      <h2 className="page-title">Booking Slots</h2>

      <div className="slot-container">
        <div className="slot-card available"><p>8:30 AM</p><button>Book</button></div>
        <div className="slot-card available"><p>10:30 AM</p><button>Book</button></div>
        <div className="slot-card booked"><p>12:00 PM</p><button disabled>Booked</button></div>
        <div className="slot-card available"><p>5:00 PM</p><button>Book</button></div>
      </div>
    </div>
  );
}

export default DoctorMunna;
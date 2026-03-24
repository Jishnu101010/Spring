import React from "react";
import Nav from "../../Nav";
import { useNavigate } from "react-router-dom";

function DoctorRavi() {
  const navigate = useNavigate();

  return (
    <div>
      <Nav />

      <button className="back-btn" onClick={() => navigate(-1)}>← Back</button>

      <div className="doctor-profile-card">
        <img
          src="https://pbs.twimg.com/profile_images/1434764437257289730/lklJwNVy_400x400.jpg"
          alt="Dr Ravi"
        />

        <div className="doctor-info">
          <h1>Dr. Ravi Tharakan</h1>
          <p className="special">Neurologist</p>
          <p><b>About:</b> Specialist in brain and nervous system disorders.</p>
          <p><b>Experience:</b> 12+ Years</p>
          <p><b>Education:</b> MBBS, MD (Neurology)</p>
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
        <div className="slot-card available"><p>9:00 AM</p><button>Book</button></div>
        <div className="slot-card booked"><p>11:30 AM</p><button disabled>Booked</button></div>
        <div className="slot-card available"><p>1:00 PM</p><button>Book</button></div>
        <div className="slot-card available"><p>3:00 PM</p><button>Book</button></div>
      </div>
    </div>
  );
}

export default DoctorRavi;
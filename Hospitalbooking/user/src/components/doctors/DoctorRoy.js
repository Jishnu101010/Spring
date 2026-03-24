import React from "react";
import Nav from "../../Nav";
import { useNavigate } from "react-router-dom";

function DoctorRoy() {
  const navigate = useNavigate();

  return (
    <div>
      <Nav />

      <button className="back-btn" onClick={() => navigate(-1)}>
        ← Back
      </button>

      <div className="doctor-profile-card">

        <img
          src="https://preview.redd.it/is-mohanlals-performance-as-dr-roy-underrated-v0-wipzo9kp3qla1.jpeg?width=400&format=pjpg&auto=webp&s=37df19df5ccc267d2c0d30b809548f923ddeafc8"
          alt="Dr Roy"
        />

        <div className="doctor-info">
          <h1>Dr. Roy</h1>
          <p className="special">Cardiologist</p>

          <p><b>About:</b> Expert in heart care and advanced cardiac treatments.</p>
          <p><b>Experience:</b> 15+ Years</p>
          <p><b>Education:</b> MBBS, MD (Cardiology)</p>
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

        <div className="slot-card available">
          <p>10:00 AM</p>
          <button>Book</button>
        </div>

        <div className="slot-card booked">
          <p>11:00 AM</p>
          <button disabled>Booked</button>
        </div>

        <div className="slot-card available">
          <p>2:00 PM</p>
          <button>Book</button>
        </div>

        <div className="slot-card available">
          <p>4:00 PM</p>
          <button>Book</button>
        </div>

      </div>
    </div>
  );
}

export default DoctorRoy;
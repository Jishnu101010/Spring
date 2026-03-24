import React from "react";
import Nav from "./Nav";
import "./App.css";
import { useNavigate } from "react-router-dom";

function App() {
  const navigate = useNavigate();

  return (
    <div>
      <Nav />

      <section className="hero-super">
        <div className="overlay"></div>

        <div className="hero-content">
          <h1>Advanced Healthcare for Everyone</h1>
          <p>
            Book appointments with top specialists anytime, anywhere.
          </p>

          <div className="hero-buttons">
            <button onClick={() => navigate("/doctors")}>
              Book Appointment
            </button>

            <button 
              className="secondary-btn"
              onClick={() => navigate("/doctors")}
            >
              Explore Doctors
            </button>
          </div>
        </div>
      </section>

      <section className="features">
        <h2>Why Choose CityCare?</h2>

        <div className="feature-container">
          <div className="feature-card">
            <h3>Expert Doctors</h3>
            <p>Highly qualified specialists across all departments.</p>
          </div>

          <div className="feature-card">
            <h3>Easy Booking</h3>
            <p>Book appointments in just a few clicks.</p>
          </div>

          <div className="feature-card">
            <h3>24/7 Support</h3>
            <p>We are always available for your healthcare needs.</p>
          </div>
        </div>
      </section>

      <section className="stats">
        <div className="stat">
          <h2>100+</h2>
          <p>Doctors</p>
        </div>

        <div className="stat">
          <h2>5000+</h2>
          <p>Patients</p>
        </div>

        <div className="stat">
          <h2>50+</h2>
          <p>Departments</p>
        </div>
      </section>

      <footer className="footer">
        <p>© 2026 CityCare Hospital | All Rights Reserved</p>
      </footer>
    </div>
  );
}

export default App;
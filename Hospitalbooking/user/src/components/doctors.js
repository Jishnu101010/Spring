import React from "react";
import Nav from "../Nav";
import { useNavigate } from "react-router-dom";

function Doctors() {
  const navigate = useNavigate();

  return (
    <div>
      <Nav />

      <h2 className="page-title">Find Your Doctor</h2>

      <div className="filter-section">
        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 640" width={"25"}>
        <path d="M480 272C480 317.9 465.1 360.3 440 394.7L566.6 521.4C579.1 533.9 579.1 554.2 566.6 566.7C554.1 579.2 533.8 579.2 521.3 566.7L394.7 440C360.3 465.1 317.9 480 272 480C157.1 480 64 386.9 64 272C64 157.1 157.1 64 272 64C386.9 64 480 157.1 480 272zM272 416C351.5 416 416 351.5 416 272C416 192.5 351.5 128 272 128C192.5 128 128 192.5 128 272C128 351.5 192.5 416 272 416z"/></svg>
        <input type="text" placeholder="Search by name or specialization" />
        <select>
          <option>All Specializations</option>
          <option>Cardiologist</option>
          <option>Neurologist</option>
          <option>General Physician</option>
          <option>Dermatologist</option>
        </select>

        <input type="date" />

        <button className="filter-btn">Search</button>
      </div>

      <div className="doctor-container">

        {/* Dr Roy */}
        <div className="doctor-card" onClick={() => navigate("/doctor/roy")}>
          <img src="https://preview.redd.it/is-mohanlals-performance-as-dr-roy-underrated-v0-wipzo9kp3qla1.jpeg?width=400&format=pjpg&auto=webp&s=37df19df5ccc267d2c0d30b809548f923ddeafc8" alt="Dr Roy"/>
          <h3>Dr. Roy</h3>
          <p className="special">Cardiologist</p>
          <p className="desc">Expert in heart care and advanced treatments.</p>
          <button>View Profile</button>
        </div>

        {/* Dr Ravi */}
        <div className="doctor-card" onClick={() => navigate("/doctor/ravi")}>
          <img src="https://pbs.twimg.com/profile_images/1434764437257289730/lklJwNVy_400x400.jpg" alt="Dr Ravi"/>
          <h3>Dr. Ravi Tharakan</h3>
          <p className="special">Neurologist</p>
          <p className="desc">Specialist in brain and nervous system disorders.</p>
          <button>View Profile</button>
        </div>

        {/* Dr Munna */}
        <div className="doctor-card" onClick={() => navigate("/doctor/munna")}>
          <img src="https://images.filmibeat.com/img/2018/12/mkup-1545225244.jpg" alt="Dr Munna"/>
          <h3>Dr. Munna</h3>
          <p className="special">General Physician</p>
          <p className="desc">Provides complete medical care for all patients.</p>
          <button>View Profile</button>
        </div>

        {/* Dr Pooja */}
        <div className="doctor-card" onClick={() => navigate("/doctor/pooja")}>
          <img src="https://i.pinimg.com/originals/1f/54/d5/1f54d53b1ad2f6187a7e527fbcde89be.jpg" alt="Dr Pooja"/>
          <h3>Dr. Pooja</h3>
          <p className="special">Dermatologist</p>
          <p className="desc">Expert in skin care and cosmetic treatments.</p>
          <button>View Profile</button>
        </div>

      </div>
    </div>
  );
}

export default Doctors;
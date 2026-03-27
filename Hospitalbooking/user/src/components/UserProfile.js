import React from "react";
import Nav from "../Nav";
import { useNavigate } from "react-router-dom";

function UserProfile() {
  const navigate = useNavigate();

  return (
    <div>
      <Nav />

      <h2 className="page-title">My Profile</h2>

      <div className="profile-card">

        {/* LEFT SIDE */}
        <div className="profile-left">
          <img 
            src="https://cdn-icons-png.flaticon.com/512/3135/3135715.png"
            alt="User"
          />
          <h2>JISHNU</h2>
          <p className="role">Patient</p>
        </div>

        {/* RIGHT SIDE */}
        <div className="profile-right">

          {/* Personal */}
          <div className="profile-section">
            <h3>Personal Details</h3>
            <p><span>Age:</span> 22</p>
            <p><span>Gender:</span> Male</p>
          </div>

          {/* Contact */}
          <div className="profile-section">
            <h3>Contact Information</h3>
            <p><span>Email:</span> jishnue@gmail.com</p>
            <p><span>Phone:</span> +91 9876543210</p>
            <p><span>Address:</span> Trivandrum, Kerala</p>
          </div>

          {/* Medical */}
          <div className="profile-section">
            <h3>Medical Information</h3>
            <p><span>Blood Group:</span> AB+</p>
            <p><span>Allergies:</span> None</p>
            <p><span>Conditions:</span> None</p>
          </div>

          {/* Emergency */}
          <div className="profile-section">
            <h3>Emergency Contact</h3>
            <p><span>Name:</span> Jishnu</p>
            <p><span>Phone:</span> +91 9123456780</p>
          </div>

          <button
            className="edit-btn"
            onClick={() => navigate("/edit-profile")}
          >
            Edit Profile
          </button>

        </div>
      </div>
    </div>
  );
}

export default UserProfile;
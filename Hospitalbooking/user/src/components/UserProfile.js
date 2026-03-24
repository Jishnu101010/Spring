import React from "react";
import Nav from "../Nav";
import { useNavigate } from "react-router-dom";

function UserProfile() {
  const navigate = useNavigate();

  return (
    <div>
      <Nav />

      <h2 className="page-title">My Profile</h2>

      <div className="profile-card-modern">

        <div className="profile-left">
          <img 
            src="https://cdn-icons-png.flaticon.com/512/3135/3135715.png"
            alt="User"
          />
          <h2>JISHNU</h2>
          <p className="role">Patient</p>
        </div>

        <div className="profile-right">

          <div className="profile-section">
            <h3>Personal Details</h3>
            <p><b>Age:</b> 22</p>
            <p><b>Gender:</b> Male</p>
          </div>

          <div className="profile-section">
            <h3>Contact Information</h3>
            <p><b>Email:</b> jishnue@gmail.com</p>
            <p><b>Phone:</b> +91 9876543210</p>
            <p><b>Address:</b> Trivandrum, Kerala</p>
          </div>

          <div className="profile-section">
            <h3>Medical Information</h3>
            <p><b>Blood Group:</b> AB+</p>
            <p><b>Allergies:</b> None</p>
            <p><b>Conditions:</b> None</p>
          </div>

          <div className="profile-section">
            <h3>Emergency Contact</h3>
            <p><b>Name:</b> Jishnu</p>
            <p><b>Phone:</b> +91 9123456780</p>
          </div>

          {/* ✅ FIXED */}
          <button
            type="button"
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
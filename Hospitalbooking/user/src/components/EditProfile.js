import React from "react";
import Nav from "../Nav";

function EditProfile() {
  return (
    <div>
      <Nav />

      <h2 className="page-title">Edit Profile</h2>

      <div className="form-container large-form">

        <h3>Personal Details</h3>
        <input type="text" placeholder="Full Name" defaultValue="Jishnu" />
        <input type="number" placeholder="Age" defaultValue="22" />
        
        <select defaultValue="Male">
          <option>Male</option>
          <option>Female</option>
        </select>

        <h3>Contact Information</h3>
        <input type="email" defaultValue="jishnue@gmail.com" />
        <input type="text" defaultValue="+91 9876543210" />
        <input type="text" defaultValue="Trivandrum, Kerala" />

        <h3>Medical Information</h3>
        <input type="text" defaultValue="AB+" />
        <input type="text" defaultValue="None" />
        <input type="text" defaultValue="" />

        <h3>Emergency Contact</h3>
        <input type="text" defaultValue="Jishnu" />
        <input type="text" defaultValue="+91 9123456780" />

        <button className="filter-btn">Save Changes</button>

      </div>
    </div>
  );
}

export default EditProfile;
import React from "react";
import Nav from "../Nav";

function EditProfile() {
  return (
    <div>
      <Nav />

      <h2 className="page-title">Edit Profile</h2>

      <div className="form-container large-form">

        {/* Personal Details */}
        <h3>Personal Details</h3>
        <input type="text" placeholder="Full Name" />
        <input type="number" placeholder="Age" />

        <select>
          <option value="">Select Gender</option>
          <option>Male</option>
          <option>Female</option>
        </select>

        {/* Contact Information */}
        <h3>Contact Information</h3>
        <input type="email" placeholder="Email Address" />
        <input type="text" placeholder="Phone Number" />
        <input type="text" placeholder="Address" />

        {/* Medical Information */}
        <h3>Medical Information</h3>
        <input type="text" placeholder="Blood Group (Eg: O+, AB+)" />
        <input type="text" placeholder="Allergies (Eg: None)" />
        <input type="text" placeholder="Medical Conditions" />

        {/* Emergency Contact */}
        <h3>Emergency Contact</h3>
        <input type="text" placeholder="Contact Name" />
        <input type="text" placeholder="Contact Phone" />

        <button className="filter-btn">Save Changes</button>

      </div>
    </div>
  );
}

export default EditProfile;
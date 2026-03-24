import React from "react";
import { NavLink } from "react-router-dom";

function Nav() {
  return (
    <nav className="navbar">

      <h2 className="logo">CityCare</h2>

      <div className="nav-links">

        <NavLink to="/" className="nav-item">Home</NavLink>

        <NavLink to="/doctors" className="nav-item">Doctors</NavLink>

        <NavLink to="/appointments" className="nav-item">Appointments</NavLink>

        <NavLink to="/profile" className="nav-item">Profile</NavLink>

        <NavLink to="/login" className="login-btn">Login</NavLink>

        <NavLink to="/register" className="register-btn">Register</NavLink>

      </div>

    </nav>
  );
}

export default Nav;
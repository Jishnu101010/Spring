import React from "react";
import { BrowserRouter, Routes, Route } from "react-router-dom";

import App from "./App";
import Login from "./components/login";
import Register from "./components/register";
import Doctors from "./components/doctors";
import UserProfile from "./components/UserProfile";
import Appointments from "./components/appointments";
import EditProfile from "./components/EditProfile";

import DoctorRoy from "./components/doctors/DoctorRoy";
import DoctorRavi from "./components/doctors/DoctorRavi";
import DoctorMunna from "./components/doctors/DoctorMunna";
import DoctorPooja from "./components/doctors/DoctorPooja";

function RouterPage() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<App />} />
        <Route path="/login" element={<Login />} />
        <Route path="/register" element={<Register />} />
        <Route path="/doctors" element={<Doctors />} />
        <Route path="/profile" element={<UserProfile />} />
        <Route path="/appointments" element={<Appointments />} />

        <Route path="/edit-profile" element={<EditProfile />} />

        <Route path="/doctor/roy" element={<DoctorRoy />} />
        <Route path="/doctor/ravi" element={<DoctorRavi />} />
        <Route path="/doctor/munna" element={<DoctorMunna />} />
        <Route path="/doctor/pooja" element={<DoctorPooja />} />
      </Routes>
    </BrowserRouter>
  );
}

export default RouterPage;
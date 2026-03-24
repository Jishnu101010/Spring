import React from "react";
import Nav from "../Nav";

function Appointments() {
  return (
    <div>
      <Nav />

      <h2 className="page-title">My Appointments</h2>

      <div className="filter-section">
        <svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 640 640" width={"25"}>
        <path d="M480 272C480 317.9 465.1 360.3 440 394.7L566.6 521.4C579.1 533.9 579.1 554.2 566.6 566.7C554.1 579.2 533.8 579.2 521.3 566.7L394.7 440C360.3 465.1 317.9 480 272 480C157.1 480 64 386.9 64 272C64 157.1 157.1 64 272 64C386.9 64 480 157.1 480 272zM272 416C351.5 416 416 351.5 416 272C416 192.5 351.5 128 272 128C192.5 128 128 192.5 128 272C128 351.5 192.5 416 272 416z"/></svg>
        <input type="text" placeholder="Search appointments" />
        <input type="date" />
        <input type="time" />
        <button className="filter-btn">Filter</button>
      </div>

      <div className="table-container">

        <table className="appointment-table">
          <thead>
            <tr>
              <th>Doctor</th>
              <th>Specialization</th>
              <th>Date</th>
              <th>Time</th>
              <th>Status</th>
            </tr>
          </thead>

          <tbody>

            <tr>
              <td>Dr. Roy</td>
              <td>Cardiologist</td>
              <td>20 March 2026</td>
              <td>10:00 AM</td>
              <td className="status-completed">Completed</td>
            </tr>

            <tr>
              <td>Dr. Pooja</td>
              <td>Dermatologist</td>
              <td>22 March 2026</td>
              <td>4:30 PM</td>
              <td className="status-completed">Completed</td>
            </tr>

            <tr>
              <td>Dr. Ravi Tharakan</td>
              <td>Neurologist</td>
              <td>28 March 2026</td>
              <td>1:00 PM</td>
              <td className="status-upcoming">Upcoming</td>
            </tr>

            <tr>
              <td>Dr. Munna</td>
              <td>General Physician</td>
              <td>30 March 2026</td>
              <td>3:00 PM</td>
              <td className="status-upcoming">Upcoming</td>
            </tr>

            <tr>
              <td>Dr. Roy</td>
              <td>Cardiologist</td>
              <td>18 March 2026</td>
              <td>11:00 AM</td>
              <td className="status-missed">Not Attended</td>
            </tr>

          </tbody>
        </table>

      </div>
    </div>
  );
}

export default Appointments;
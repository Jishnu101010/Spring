import React from "react";
import Nav from "../Nav";

function Appointments() {
  return (
    <div>
      <Nav />

      <h2 className="page-title">My Appointments</h2>

      <div className="filter-section">
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
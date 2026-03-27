import React, { useState } from "react";

function Register() {

    const [formData, setFormData] = useState({
        username: "",
        email: "",
        address: "",
        phoneNo: "",
        dob: "",
        gender: "",
        password: "",
        confirmPassword: ""
    });

    const handleChange = (e) => {
        setFormData({
            ...formData,
            [e.target.name]: e.target.value
        });
    };

    const handleSubmit = (e) => {
        e.preventDefault();

        if (formData.password !== formData.confirmPassword) {
            alert("Passwords do not match");
            return;
        }

        console.log(formData); // later send to backend
        alert("Registered Successfully!");
    };

    return (
        <div className="container">
            <div className="row">
                <div className="col-8 offset-2">
                    <h1>Register</h1>

                    <form onSubmit={handleSubmit}>

                        <div className="form-group">
                            <label>Name:</label>
                            <input
                                type="text"
                                name="username"
                                className="form-control"
                                onChange={handleChange}
                            />
                        </div>

                        <div className="form-group">
                            <label>Email:</label>
                            <input
                                type="email"
                                name="email"
                                className="form-control"
                                onChange={handleChange}
                            />
                        </div>

                        <div className="form-group">
                            <label>Address:</label>
                            <input
                                type="text"
                                name="address"
                                className="form-control"
                                onChange={handleChange}
                            />
                        </div>

                        <div className="form-group">
                            <label>Phone Number:</label>
                            <input
                                type="number"
                                name="phoneNo"
                                className="form-control"
                                onChange={handleChange}
                            />
                        </div>

                        <div className="form-group">
                            <label>Date of Birth:</label>
                            <input
                                type="date"
                                name="dob"
                                className="form-control"
                                onChange={handleChange}
                            />
                        </div>

                        {/* 🔥 Gender Section */}
                        <div className="form-group">
                            <label>Gender:</label>
                            <select
                                name="gender"
                                className="form-control"
                                onChange={handleChange}
                            >
                                <option value="">Select Gender</option>
                                <option value="MALE">Male</option>
                                <option value="FEMALE">Female</option>
                            </select>
                        </div>

                        <div className="form-group">
                            <label>Password:</label>
                            <input
                                type="password"
                                name="password"
                                className="form-control"
                                onChange={handleChange}
                            />
                        </div>

                        <div className="form-group">
                            <label>Confirm Password:</label>
                            <input
                                type="password"
                                name="confirmPassword"
                                className="form-control"
                                onChange={handleChange}
                            />
                        </div>

                        <br />

                        <button className="btn btn-primary float-right">
                            Submit
                        </button>

                    </form>
                </div>
            </div>
        </div>
    );
}

export default Register;
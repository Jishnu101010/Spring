import React from "react";
function Register() {


    return (<div>
     
        <div className="container">
            <div className="row">
                <div className="col-8 offset-2">
                    <h1>Register</h1>
                    <div className="form-group">
                        <label>Name:</label>
                        <input type="text"
                        className="form-control"
                      
                        />
                    </div>
                <div className="form-group">
                    <label>Email:</label>
                    <input type="email"
                    className="form-control"
                   
                    />
                </div>
                <div className="form-group">
                    <label>Password:</label>
                    <input type="password"
                    className="form-control"
              
                    />
                </div>
                <div className="form-group">
                    <label>Confirm Password:</label>
                    <input type="password"
                    className="form-control"
                  
                    />
                </div>
                    <div className="form-group">
                        <button className="btn btn-primary float-right">Submit</button>
                    </div>
                </div>
            </div>
        </div>
    </div>);
}

export default Register;
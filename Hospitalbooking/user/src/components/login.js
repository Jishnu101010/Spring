import React from 'react';
function Login() {
    return (<div>
        <div className="container">
            <div className="row">
                <div className="col-8 offset-2">
                    <h1 class="card-title" >Login</h1>
                     <div class="card">
                <div class="card-body">  
                    <div className="form-group">
                        <label>Email:</label>
                        <input type="text"
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
                        <button className="btn btn-primary float-right">Login</button>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </div>
    </div>
    );
}

export default Login;
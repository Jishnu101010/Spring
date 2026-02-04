package com.example.Project.Dto;

public class UserDto {
   
    private String username;
    private String password;
    private String fullname;
   
    public UserDto(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public String getusername() {
        return username;
    }

    public void setEmail(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
}
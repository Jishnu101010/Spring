package com.example.cw11.dto;

public class UserDto {
   
    private String Phonenumber;
    private String password;
    private String username;
   
    public UserDto(String Phonenumber, String password, String fullname) {
        super();
        this.Phonenumber = Phonenumber;
        this.password = password;
        this.username = username;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(String Phonenumber) {
        this.Phonenumber = Phonenumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }
   
}
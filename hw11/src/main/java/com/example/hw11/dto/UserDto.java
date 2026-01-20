package com.example.hw11.dto;

public class UserDto {
	 	private Long id;
	 	private String email;
	    private String password;
	    private String fullname;
	    private String lastName;
	    private String address;

	    public UserDto(String email, String password, String fullname, String lastName,String address) {
	        this.email = email;
	        this.password = password;
	        this.fullname = fullname;
	        this.lastName = lastName;
	        this.address = address;
	    }

	    public Long getId() {
	        return id;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public String getFullName() {
	        return fullname;
	    }

	    public String getLastName() {
	        return lastName;
	    }

	    public String getAddress() {
	        return address;
	    }

    }
   

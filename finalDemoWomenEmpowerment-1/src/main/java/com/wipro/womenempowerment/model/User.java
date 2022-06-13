package com.wipro.womenempowerment.model;

import java.util.Date;

import javax.persistence.*;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private String username;
	
	private String email;
	
	private Date dob;

	private String password;

	private String number;
		
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String username, String email, Date dob, String password, String number) {
		this.username = username;
		this.email = email;
		this.dob = dob;
		this.password = password;
		this.number = number;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	
	
	
	
	
	
	
	

}

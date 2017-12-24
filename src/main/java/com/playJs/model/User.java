package com.playJs.model;

import java.time.LocalDateTime;

public class User {
	
	private int id;
	private String userName;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private LocalDateTime dob;
	private LocalDateTime createdOn;
	private LocalDateTime lastLoggedOn;
	
	public User() {
		super();
	}
	
	
	
	public User(int id, String userName, String email, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.email = email;
		this.password = password;
	}



	public User(int id, String userName, String firstName, String lastName, String email, String password,
			LocalDateTime dob, LocalDateTime createdOn, LocalDateTime lastLoggedOn) {
		super();
		this.id = id;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.dob = dob;
		this.createdOn = createdOn;
		this.lastLoggedOn = lastLoggedOn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LocalDateTime getDob() {
		return dob;
	}
	public void setDob(LocalDateTime dob) {
		this.dob = dob;
	}
	public LocalDateTime getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(LocalDateTime createdOn) {
		this.createdOn = createdOn;
	}
	public LocalDateTime getLastLoggedOn() {
		return lastLoggedOn;
	}
	public void setLastLoggedOn(LocalDateTime lastLoggedOn) {
		this.lastLoggedOn = lastLoggedOn;
	}
	

}

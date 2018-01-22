package com.playJs.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

@Entity
public class Player {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	@Column(nullable=false)
	private String userName;
	
	private String firstName;
	
	private String lastName;
	
	@Column(nullable=false)
	private String email;
	
	@Column(nullable=false)
	private String password;
	
	@JsonSerialize(using = LocalDateSerializer.class)
	private LocalDate dob;
	
	@Column(nullable=false)
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	private LocalDateTime createdOn;
	
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	private LocalDateTime lastLoggedOn;
	
	public Player() {
		super();
	}

	public Player(int id, String userName, String firstName, String lastName, String email, String password,
			LocalDate dob, LocalDateTime createdOn, LocalDateTime lastLoggedOn) {
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
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
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

package com.boot.noteapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
 @Id
	private String userID;
	private String firstName;
	private String lastName;
	
	
	public User() {

	}
	public User(String userID, String firstName, String lastName) {

		this.userID = userID;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
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
	
}

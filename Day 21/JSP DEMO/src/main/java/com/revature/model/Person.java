package com.revature.model;

public class Person {
	private String username;
	private String email;
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
	@Override
	public String toString() {
		return "Person [username=" + username + ", email=" + email + "]";
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String username, String email) {
		super();
		this.username = username;
		this.email = email;
	}
	
}

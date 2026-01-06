package com.day4.edumentor;

public abstract class User {
	protected int userId;
	protected String name;
	protected String email;
	
	
	User (int userId, String name, String email) {
		this.userId = userId;
		this.name = name;
		this.email = email;
	}
	
	abstract void printDetails();
}
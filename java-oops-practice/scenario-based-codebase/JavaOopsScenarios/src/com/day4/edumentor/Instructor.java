package com.day4.edumentor;

public class Instructor extends User {

	private String specialization;

	Instructor(int userId, String name, String email, String specialization) {
		super(userId, name, email);
		this.specialization = specialization;
	}

	@Override
	void printDetails() {
		System.out.println("Instructor ID: " + userId);
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Specialization: " + specialization);
	}
}
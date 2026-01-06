package com.day4.edumentor;

public class Learner extends User implements ICertifiable {
	private String courseType;
	
	
	Learner(int userId, String name, String email, String courseType) {
		super(userId, name, email);
		this.courseType = courseType;
	}
	
	@Override
	public void generateCertificate() {
		if(courseType.equalsIgnoreCase("short")) {
			System.out.println("Short course certificate generated for: " + name);
		} else {
			System.out.println("Full-Time course generated for: " + name);
		}
	}
	
	@Override
	public void printDetails() {
		System.out.println("Learner ID: " + userId);
		System.out.println("Name: " + name);
		System.out.println("Email: " + email);
		System.out.println("Course Type: " + courseType);
	}
}
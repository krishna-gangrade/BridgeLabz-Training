package com.day3.campusconnect;

abstract class Person {

	protected String name;
	protected String email;
	protected int id;

	public Person(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	// Polymorphic method
	public abstract void printDetails();
}
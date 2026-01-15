package com.day2.traincompanion;

public class Compartment {
	String type;
	String description;
	Compartment prev;
	Compartment next;

	// constructor
	public Compartment(String type, String description) {
		this.type = type;
		this.description = description;
		this.prev = null;
		this.next = null;
	}

	// method to get compartment details
	public String getInfo() {
		return type + " (" + description + ")";
	}
}
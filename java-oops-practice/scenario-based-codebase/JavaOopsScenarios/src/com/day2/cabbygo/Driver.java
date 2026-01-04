package com.day2.cabbygo;

class Driver {

	String name;
	String licenseNumber;
	private double rating; // sensitive

	Driver(String name, String licenseNumber, double rating) {
		this.name = name;
		this.licenseNumber = licenseNumber;
		this.rating = rating;
	}

	public double getRating() {
		return rating;
	}

	void showDriverDetails() {
		System.out.println("Driver Name : " + name);
		System.out.println("License No  : " + licenseNumber);
		System.out.println("Rating      : " + rating);
	}
}
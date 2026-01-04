package com.day2.cabbygo;

class Vehicle {

	String vehicleNumber;
	int capacity;
	String type;

	Vehicle(String vehicleNumber, int capacity, String type) {
		this.vehicleNumber = vehicleNumber;
		this.capacity = capacity;
		this.type = type;
	}

	double getRatePerKm() {
		return 0; // overridden
	}

	void showVehicleDetails() {
		System.out.println("Vehicle No : " + vehicleNumber);
		System.out.println("Type       : " + type);
		System.out.println("Capacity   : " + capacity);
	}
}
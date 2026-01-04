package com.day2.cabbygo;

class Sedan extends Vehicle {

	Sedan(String vehicleNumber) {
		super(vehicleNumber, 4, "Sedan");
	}

	@Override
	double getRatePerKm() {
		return 15;
	}
}
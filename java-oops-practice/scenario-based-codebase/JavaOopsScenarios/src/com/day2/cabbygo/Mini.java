package com.day2.cabbygo;

class Mini extends Vehicle {

	Mini(String vehicleNumber) {
		super(vehicleNumber, 4, "Mini");
	}

	@Override
	double getRatePerKm() {
		return 10;
	}
}
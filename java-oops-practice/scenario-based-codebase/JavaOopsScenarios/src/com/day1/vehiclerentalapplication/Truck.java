package com.day1.vehiclerentalapplication;

class Truck extends Vehicle implements Rentable {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 2000); // base rate for truck
    }

    @Override
    public double calculateRent(int days) {
        double loadCharge = 1000;
        return (baseRate * days) + loadCharge;
    }
}


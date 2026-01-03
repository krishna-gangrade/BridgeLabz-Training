package com.day1.vehiclerentalapplication;

class Bike extends Vehicle implements Rentable {

    public Bike(String vehicleNumber) {
        super(vehicleNumber, 300); // base rate for bike
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days;
    }
}
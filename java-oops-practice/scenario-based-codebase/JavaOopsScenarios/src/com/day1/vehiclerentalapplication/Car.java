package com.day1.vehiclerentalapplication;

class Car extends Vehicle implements Rentable {

    public Car(String vehicleNumber) {
        super(vehicleNumber, 1000); // base rate for car
    }

    @Override
    public double calculateRent(int days) {
        double insuranceCharge = 500;
        return (baseRate * days) + insuranceCharge;
    }
}


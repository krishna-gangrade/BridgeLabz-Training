package com.day1.vehiclerentalapplication;

class Vehicle {
    protected String vehicleNumber;
    protected double baseRate;

    public Vehicle(String vehicleNumber, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.baseRate = baseRate;
    }

    // Encapsulation via getters/setters
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public double getBaseRate() {
        return baseRate;
    }
}


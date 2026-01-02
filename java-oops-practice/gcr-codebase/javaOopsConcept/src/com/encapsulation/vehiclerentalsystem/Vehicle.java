
package com.encapsulation.vehiclerentalsystem;

abstract class Vehicle {

    private String vehicleNumber;
    private String type;
    protected double rentalRate;

    Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Encapsulation
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    // Abstract method
    abstract double calculateRentalCost(int days);

    // Common behavior
    void displayDetails() {
        System.out.println("Vehicle No : " + vehicleNumber);
        System.out.println("Type       : " + type);
        System.out.println("Rate/Day   : ₹" + rentalRate);
    }
}

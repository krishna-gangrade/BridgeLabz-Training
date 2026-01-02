package com.encapsulation.ridehailingapplication;

abstract class Vehicle {

    private String vehicleId;
    private String driverName;
    protected double ratePerKm;

    Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Encapsulation
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    // Abstract method
    abstract double calculateFare(double distance);

    // Concrete method
    void getVehicleDetails() {
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Driver     : " + driverName);
        System.out.println("Rate/Km    : ₹" + ratePerKm);
    }
}
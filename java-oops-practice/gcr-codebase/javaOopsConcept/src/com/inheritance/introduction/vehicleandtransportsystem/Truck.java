package com.inheritance.introduction.vehicleandtransportsystem;

class Truck extends Vehicle {

    double loadCapacity;

    Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Vehicle Type : Truck");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
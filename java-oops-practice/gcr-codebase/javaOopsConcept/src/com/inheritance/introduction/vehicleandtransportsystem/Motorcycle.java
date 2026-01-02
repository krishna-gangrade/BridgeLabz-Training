package com.inheritance.introduction.vehicleandtransportsystem;

class Motorcycle extends Vehicle {

    boolean hasGear;

    Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
        super(maxSpeed, fuelType);
        this.hasGear = hasGear;
    }

    @Override
    void displayInfo() {
        System.out.println("Vehicle Type : Motorcycle");
        super.displayInfo();
        System.out.println("Gear System  : " + (hasGear ? "Available" : "Not Available"));
    }
}
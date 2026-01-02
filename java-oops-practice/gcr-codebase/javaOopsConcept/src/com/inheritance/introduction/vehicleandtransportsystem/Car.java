package com.inheritance.introduction.vehicleandtransportsystem;

class Car extends Vehicle {

    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    void displayInfo() {
        System.out.println("Vehicle Type : Car");
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}
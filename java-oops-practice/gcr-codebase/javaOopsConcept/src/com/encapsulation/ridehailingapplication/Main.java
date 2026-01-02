package com.encapsulation.ridehailingapplication;

public class Main {

    public static void main(String[] args) {

        Vehicle[] rides = {
            new Car("CAR101", "Amit", 15),
            new Bike("BIKE202", "Rohit", 8),
            new Auto("AUTO303", "Suresh", 10)
        };

        double distance = 12.5; // km

        for (Vehicle v : rides) {

            v.getVehicleDetails();

            GPS gps = (GPS) v;
            gps.updateLocation("MG Road");

            System.out.println("Current Location : " + gps.getCurrentLocation());
            System.out.println("Fare for " + distance + " km : ₹" +
                               v.calculateFare(distance));
            System.out.println("--------------------------------");
        }
    }
}
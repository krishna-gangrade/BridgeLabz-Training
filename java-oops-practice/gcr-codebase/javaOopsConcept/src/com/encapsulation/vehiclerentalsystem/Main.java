
package com.encapsulation.vehiclerentalsystem;

public class Main {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car("CAR101", 1500, "CAR-POL-001"),
                new Bike("BIKE202", 600, "BIKE-POL-002"),
                new Truck("TRK303", 3000, "TRK-POL-003")
        };

        int days = 3;

        for (Vehicle v : vehicles) {

            v.displayDetails();

            double rentalCost = v.calculateRentalCost(days);
            double insuranceCost = 0;

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                insuranceCost = ins.calculateInsurance(days);
                System.out.println(ins.getInsuranceDetails());
            }

            System.out.println("Rental Cost   : ₹" + rentalCost);
            System.out.println("Insurance     : ₹" + insuranceCost);
            System.out.println("Total Payable : ₹" + (rentalCost + insuranceCost));
            System.out.println("--------------------------------");
        }
    }
}

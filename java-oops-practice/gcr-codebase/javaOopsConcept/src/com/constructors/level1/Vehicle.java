package com.constructors.level1;

public class Vehicle {
	
	 // Instance variables
    String ownerName;
    String vehicleType;

    // Class variable (shared)
    static double registrationFee = 5000;

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance method
    public void displayVehicleDetails() {
        System.out.println("Owner Name        : " + ownerName);
        System.out.println("Vehicle Type      : " + vehicleType);
        System.out.println("Registration Fee  : ₹" + registrationFee);
    }

    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle v1 = new Vehicle("Krishna", "Car");
        Vehicle v2 = new Vehicle("Amit", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(6500);

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

	}

}

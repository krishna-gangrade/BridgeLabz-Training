package com.constructors.level1;

public class CarRental {
	
	// Attributes
    String customerName;
    String carModel;
    int rentalDays;

    // Rental cost per day
    final double COST_PER_DAY = 1500;

    // 1. Default constructor
    public CarRental() {
        customerName = "Unknown Customer";
        carModel = "Standard Car";
        rentalDays = 1;
    }

    // 2. Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        return rentalDays * COST_PER_DAY;
    }

    // Method to display rental details
    public void displayRentalDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : ₹" + calculateTotalCost());
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Using default constructor
        CarRental rental1 = new CarRental();

        // Using parameterized constructor
        CarRental rental2 = new CarRental("Krishna", "Honda City", 4);

        rental1.displayRentalDetails();
        rental2.displayRentalDetails();

	}

}

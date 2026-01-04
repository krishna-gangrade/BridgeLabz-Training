package com.day2.cabbygo;

import java.util.Scanner;

public class Main implements IRideService {

	private Vehicle vehicle;
	private Driver driver;
	private double fare;
	private final double baseFare = 50;

	Main(Vehicle vehicle, Driver driver) {
		this.vehicle = vehicle;
		this.driver = driver;
	}
	
	public static void displayMenu() {

		System.out.println("----------------------------------------------");
		System.out.println("|             Welcome to CappyGo             |");
		System.out.println("----------------------------------------------\n");
		System.out.println();
	}

	@Override
	public void bookRide(double distance) {
		fare = baseFare + (distance * vehicle.getRatePerKm());

		System.out.println("\nRide Booked Successfully");
		vehicle.showVehicleDetails();
		driver.showDriverDetails();
		System.out.println("Distance   : " + distance + " km");
		System.out.println("Fare       : Rs. " + fare);
	}

	@Override
	public void endRide() {
		System.out.println("\nRide Ended");
		System.out.println("Final Fare : Rs. " + fare);
		System.out.println("Thank you for riding with CabbyGo!");
	}

	public double checkFare(double distance, Vehicle v) {
		return baseFare + (distance * v.getRatePerKm());
	}

	public static void main(String[] args) {

		displayMenu();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Distance: ");
		double distance = sc.nextDouble();

		Vehicle[] vehicles = { new Mini("DL 9C CS 5841"), new Sedan("DL 4R AB 2267"), new SUV("DL 3C AE 7923") };

		Driver driver = new Driver("Prashant", "DLX445566", 4.9);

		System.out.println("\nVehicles List");
		System.out.println("--------------------------------");

		Main temp = new Main(vehicles[0], driver); // dummy object for fare check

		for (Vehicle v : vehicles) {
			v.showVehicleDetails();
			System.out.println("Fare : Rs. " + temp.checkFare(distance, v));
			System.out.println("--------------------------------");
		}

		System.out.print("Enter the Vehicle (Mini, SUV, Sedan): ");
		String choice = sc.next().trim().toLowerCase();

		IRideService ride = null;
		
		sc.close(); 
		
		switch (choice) {
		case "mini":
			ride = new Main(vehicles[0], driver);
			break;
		case "sedan":
			ride = new Main(vehicles[1], driver);
			break;
		case "suv":
			ride = new Main(vehicles[2], driver);
			break;
		default:
			System.out.println("Invalid Input! Exiting...");
			return;
		}

		ride.bookRide(distance);
		ride.endRide();
		
	}
}
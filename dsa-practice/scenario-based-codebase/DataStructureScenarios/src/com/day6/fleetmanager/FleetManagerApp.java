package com.day6.fleetmanager;

/*
10. FleetManager – Vehicle Maintenance Scheduler (Merge Sort)
Story: 
	● A fleet company schedules vehicle maintenance based on mileage. 
	● Each depot sends a sorted list of vehicles. 
	● To create a master schedule, Merge Sort is used to combine these depot lists efficiently.
Key Concepts:
	● Sorted sublists from multiple sources
	● Merge sort for final master list
	● Efficient memory usage for large lists
*/


public class FleetManagerApp {
	public static void main(String[] args) {

		System.out.println("=========================== FLEETMANAGER ==============================\n");
		// Added example depots with pre-sorted vehicles list by mileage
		Depot[] depots = new Depot[] {
				new Depot("Ranchi", new Vehicle("JH09AB1234", "Tata Ace", 12450, "2025-11-10"),
						new Vehicle("JH09CD5678", "Mahindra Bolero", 18920, "2025-10-05"),
						new Vehicle("JH09EF9012", "Eicher Pro", 25670, "2025-12-01")),
				new Depot("Palamu", new Vehicle("JH04GH3456", "Ashok Leyland", 9800, "2025-12-15"),
						new Vehicle("JH04IJ7890", "Tata Ultra", 14230, "2025-09-20"),
						new Vehicle("JH04KL2345", "Eicher Skyline", 20110, "2025-11-28"),
						new Vehicle("JH04MN6789", "Mahindra Furio", 27890, "2025-10-30")),
				new Depot("Garhwa", new Vehicle("JH21OP1122", "Tata Prima", 16780, "2025-12-05"),
						new Vehicle("JH21QR3344", "BharatBenz", 22340, "2025-11-18")),
				new Depot("Dhanbad") // empty
		};

		// Display depots
		printDepots(depots);

		// Vehicle[][] for the merge function
		Vehicle[][] lists = new Vehicle[depots.length][];
		for (int i = 0; i < depots.length; i++) {
			lists[i] = depots[i].getVehicles();
		}

		// Merge all lists
		Vehicle[] schedule = FleetMergeSort.mergeMultipleSortedLists(lists);

		// Display sorted schedule
		FleetMergeSort.printSchedule(schedule);
		System.out.println("======================= THANKS FOR VISITING ===========================\n");
	}

	private static void printDepots(Depot[] depots) {
		System.out.println("Pre-sorted lists from each depot:");
		System.out.println("-----------------------------------------------------------------------");

		for (Depot depot : depots) {
			System.out.printf("Depot: %s%n", depot);
			if (depot.size() == 0) {
				System.out.println("(empty)");
			} else {
				for (Vehicle v : depot.getVehicles()) {
					System.out.println(v);
				}
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------------------------------------\n");
	}
}
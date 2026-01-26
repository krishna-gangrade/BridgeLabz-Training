
/*
2. AVL Tree
Story: Hospital Queue Management
	Patients are sorted by check-in time and balanced for quick lookups.
Scenarios:
	● 🔹 Scenario 1: Patient Registration
	● 🔹 Scenario 2: Discharge/Delete Record
	● 🔹 Scenario 3: Display by Arrival Time
*/

package com.day10.hospitalqueuemanagement;

public class HospitalQueueApp {
	public static void main(String[] args) {
		HospitalQueueAVL queue = new HospitalQueueAVL();

		System.out.println("=====================================================================================");
		System.out.println("                         HOSPITAL QUEUE MANAGEMENT (AVL)");
		System.out.println("=====================================================================================\n");

		// Scenario 1: Patient Registration
		queue.registerPatient(
		        new Patient("P20260210-101", "Rakesh Malhotra", "2026-02-10 08:05", "Cardiology", "Chest Discomfort"));
		queue.registerPatient(
		        new Patient("P20260210-102", "Anjali Nair", "2026-02-10 08:35", "Neurology", "Frequent Headache"));
		queue.registerPatient(
		        new Patient("P20260210-103", "Mohit Kulkarni", "2026-02-10 07:50", "Ophthalmology", "Blurred Vision"));
		queue.registerPatient(
		        new Patient("P20260210-104", "Pallavi Deshmukh", "2026-02-10 09:00", "Gynecology", "Lower Abdominal Pain"));
		queue.registerPatient(
		        new Patient("P20260210-105", "Sandeep Rao", "2026-02-10 08:45", "Urology", "Burning Sensation"));

		System.out.println("Current Waiting Queue (by arrival time):");
		queue.displayQueue();

		// Scenario 2: Discharge / remove patient
		System.out.println("\nPatient P20260210-103 (Mohit Kulkarni) discharged / seen");
		queue.dischargePatient("P20260210-103");

		System.out.println("\nUpdated Queue:");
		queue.displayQueue();

		System.out.println("\nNew patient arrives:");
		queue.registerPatient(
		        new Patient("P20260210-106", "Kavita Joshi", "2026-02-10 09:20", "Pulmonology", "Shortness of Breath"));

		System.out.println("\nFinal Queue:");
		queue.displayQueue();
		System.out.println("=====================================================================================");
	}
}

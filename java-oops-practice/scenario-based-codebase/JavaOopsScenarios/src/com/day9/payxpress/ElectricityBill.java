package com.day9.payxpress;

import java.time.LocalDate;

public class ElectricityBill extends Bill{
	
	public ElectricityBill(double amount, LocalDate dueDate) {
		super("Electricity", amount, dueDate);
	}

	@Override
	public void pay() {
		if(!isPaid()) {
			markAsPaid();
			System.out.println("Electricity bill paid Successfully...");
		}
		else {
			System.out.println("Electricity bill already paid...");
		}
	}

	@Override
	public void sendReminder() {
		System.out.println("Reminder : Electricity bill due soon. Avoid power disconnection.");
	}
}
package com.day9.payxpress;

import java.time.LocalDate;

public class WaterBill extends Bill{

	protected WaterBill(double amount, LocalDate dueDate) {
		super("Water", amount, dueDate);
	}

	@Override
	public void pay() {
		if(!isPaid()) {
			markAsPaid();
			System.out.println("Water bill paid Successfully...");
		}
		else {
			System.out.println("Water bill already paid...");
		}
	}

	@Override
	public void sendReminder() {
		System.out.println("Reminder : Water bill pending. Please pay to avoid penalties.");
	}

}

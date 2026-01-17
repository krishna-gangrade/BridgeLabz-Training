package com.day9.payxpress;

import java.time.LocalDate;

public class InternetBill extends Bill{

	protected InternetBill(double amount, LocalDate dueDate) {
		super("Internet", amount, dueDate);
	}

	@Override
	public void pay() {
		if(!isPaid()) {
            markAsPaid();
            System.out.println("Internet bill paid successfully.");
        } else {
            System.out.println("Internet bill already paid.");
        }
	}

	@Override
	public void sendReminder() {
		System.out.println("Reminder : Internet bill unpaid. Service interruption possible.");
	}
}

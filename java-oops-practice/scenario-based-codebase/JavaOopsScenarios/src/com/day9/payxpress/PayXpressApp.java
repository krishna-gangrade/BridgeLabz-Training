package com.day9.payxpress;


/*
 
25. "PayXpress – Utility Bill Payment System"
Story: PayXpress enables users to pay utility bills (electricity, water, internet) with tracking and
reminders.
Requirements:
● Bill class: type, amount, dueDate, isPaid.
● Interface IPayable with pay() and sendReminder().
● Use constructors to create recurring bills.
● Operators for calculating late fees: baseAmount + penalty.
● Encapsulation: prevent direct payment status changes.
● Inheritance: ElectricityBill, InternetBill, WaterBill.
● Polymorphism: reminders vary depending on utility type.
● Access Modifiers: payment details are internal only.

*/



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PayXpressApp {
	public static void main(String args[]) {
		
		List<Bill> bills= new ArrayList<>();
		
		bills.add(new ElectricityBill(1200, LocalDate.now().plusDays(3)));
        bills.add(new WaterBill(450, LocalDate.now().plusDays(5)));
        bills.add(new InternetBill(899, LocalDate.now().plusDays(2)));
		
		System.out.println("-----All Bills-----");
		for(Bill bill: bills) {
			bill.displayBill();
		}
		
		System.out.println("-----Sending Reminder-----");
		for(Bill bill: bills) {
			bill.sendReminder();
		}
		
		System.out.println("-----Paying Bills-----");
		for(Bill bill: bills) {
			bill.pay();
		}
		
		System.out.println("-----Late Fee Calculation-----");
		double latefee= bills.get(0).calculateLateFee(100);
		System.out.println("Electricity bill with late fees : rs "+ latefee);
	}
}

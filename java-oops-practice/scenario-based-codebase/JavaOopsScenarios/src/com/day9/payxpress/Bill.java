package com.day9.payxpress;

import java.time.LocalDate;

public abstract class Bill implements IPayable{
	
	private String type;
	private double amount;
	private LocalDate dueDate;
	private boolean isPaid;
	
	protected Bill(String type, double amount, LocalDate dueDate) {
		this.type= type;
		this.amount= amount;
		this.dueDate= dueDate;
		this.isPaid= false;
	}
	
	 protected void markAsPaid() {
		 this.isPaid=true;
	 }
	 
	 public boolean isPaid() {
		 return isPaid;
	 }
	 
	 public double calculateLateFee(double penalty) {
		 return amount + penalty;
	 }
	 
	 protected double getAmount() {
		 return amount;
	 }
	 
	 protected String getType() {
		 return type;
	 }
	 
	 protected LocalDate getDueDate() {
		 return dueDate;
	 }
	
	 public void displayBill() {
		 System.out.println("Bill Type : "+ type + ", Amount : "+amount+ ", Due Date : "+dueDate+ ", Paid : "+ isPaid);
	 }
	 
}

package com.day4.zipzipmart;

public class SalesRecord {
	private String date;
	private double amount;

	public SalesRecord(String date, double amount) {
		this.date = date;
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public double getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "Date: " + date + ", Amount: " + amount;
	}
}
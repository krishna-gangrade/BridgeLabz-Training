package com.methodreferences.invoiceobject;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class InvoiceCreationApp {
	public static void main(String[] args) {
		// sample transaction IDs coming from payment gateway
		List<String> transactionIds = Arrays.asList("TXN48291", "TXN10573", "TXN73946", "TXN26084", "TXN91837");

		System.out.println("Invoice Generation System");
		System.out.println("Generating invoices from transaction IDs using constructor reference");
		System.out.println("----------------------------------------------------------------");

		// Use constructor reference Invoice::new
		Function<String, Invoice> invoiceCreator = Invoice::new;

		// Create invoices using the constructor reference
		transactionIds.stream().map(invoiceCreator) // constructor reference
				.forEach(System.out::println); // print each invoice

		System.out.println("----------------------------------------------------------------");
		System.out.println("Total invoices generated: " + transactionIds.size());
	}
}
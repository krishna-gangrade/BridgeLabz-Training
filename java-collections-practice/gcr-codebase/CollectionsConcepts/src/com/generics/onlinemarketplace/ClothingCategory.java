package com.generics.onlinemarketplace;

public class ClothingCategory extends Product {

	// Constructor with price validation
	public ClothingCategory(String name, double price) {
		super(name, price);
		if (price < 10.0 || price > 300.0) {
			throw new IllegalArgumentException("Clothing price must be between $10 and $300");
		}
	}

	@Override
	public String getCategory() {
		return "Clothing";
	}
}
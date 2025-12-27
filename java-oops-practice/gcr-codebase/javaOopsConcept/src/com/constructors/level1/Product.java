package com.constructors.level1;

public class Product {
	
	// Instance variables
    String productName;
    double price;

    // Class variable (shared)
    static int totalProducts = 0;

    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // increment when a product is created
    }

    // Instance method
    public void displayProductDetails() {
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
    }

    // Class method (static method)
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1 = new Product("Laptop", 55000);
	    Product p2 = new Product("Mouse", 800);
	    Product p3 = new Product("Keyboard", 1500);

	    p1.displayProductDetails();
	    p2.displayProductDetails();
	    p3.displayProductDetails();

	    Product.displayTotalProducts();

	}

}

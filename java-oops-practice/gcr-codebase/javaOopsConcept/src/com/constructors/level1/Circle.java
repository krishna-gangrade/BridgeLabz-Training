package com.constructors.level1;

public class Circle {
	
	// Attribute
    double radius;

    // Default constructor
    public Circle() {
        this(1.0);   // constructor chaining
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Display method
    void display() {
        System.out.println("Radius: " + radius);
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle();      // uses default radius
        Circle c2 = new Circle(5.5);   // user-provided radius

        c1.display();
        c2.display();

	}

}


package com.constructors.level1;


//Subclass
class PostgraduateStudent extends Student {

// Constructor
public PostgraduateStudent(int rollNumber, String name, double cgpa) {
   super(rollNumber, name, cgpa);
}

// Method demonstrating protected member access
public void displayDetails() {
   System.out.println("Roll Number : " + rollNumber); // public
   System.out.println("Name        : " + name);       // protected
   System.out.println("CGPA        : " + getCGPA());  // private via getter
}

public static void main(String[] args) {

   PostgraduateStudent pg = new PostgraduateStudent(101, "Rahul", 8.5);

   // Access CGPA
   pg.displayDetails();

   // Modify CGPA using public method
   pg.setCGPA(9.0);

   System.out.println("\nAfter CGPA Update:");
   pg.displayDetails();
}
}

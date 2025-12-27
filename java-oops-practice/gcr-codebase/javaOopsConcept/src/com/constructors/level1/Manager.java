package com.constructors.level1;

//Subclass
class Manager extends Employee {

// Constructor
public Manager(int employeeID, String department, double salary) {
   super(employeeID, department, salary);
}

// Method demonstrating access to public & protected members
public void displayDetails() {
   System.out.println("Employee ID : " + employeeID);   // public
   System.out.println("Department  : " + department);   // protected
   System.out.println("Salary      : " + getSalary());  // private via getter
}

public static void main(String[] args) {

   Manager mgr = new Manager(201, "IT", 75000.0);

   // Display initial details
   mgr.displayDetails();

   // Modify salary using public method
   mgr.setSalary(85000.0);

   System.out.println("\nAfter Salary Update:");
   mgr.displayDetails();
}
}
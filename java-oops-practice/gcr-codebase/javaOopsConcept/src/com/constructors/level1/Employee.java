package com.constructors.level1;

//Superclass
public class Employee {

 // Access modifiers
 public int employeeID;          // public
 protected String department;    // protected
 private double salary;          // private

 // Constructor
 public Employee(int employeeID, String department, double salary) {
     this.employeeID = employeeID;
     this.department = department;
     this.salary = salary;
 }

 // Public method to modify salary
 public void setSalary(double salary) {
     this.salary = salary;
 }

 // Public method to access salary (needed for display)
 public double getSalary() {
     return salary;
 }
}
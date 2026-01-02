
package com.encapsulation.employeemanagementsystem;

abstract class Employee {

    private int employeeId;
    private String name;
    protected double baseSalary;

    Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation: Getters & Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary > 0) {
            this.baseSalary = baseSalary;
        }
    }

    // Abstract method
    abstract double calculateSalary();

    // Concrete method
    void displayDetails() {
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Name        : " + name);
        System.out.println("Salary      : ₹" + calculateSalary());
    }
}

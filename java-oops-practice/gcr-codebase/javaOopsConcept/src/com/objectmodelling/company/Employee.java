package com.objectmodelling.company;

public class Employee {

    private String employeeName;
    private int employeeId;

    // Constructor
    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    // Display employee details
    public void showEmployee() {
        System.out.println("Employee ID   : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
    }
}
package com.objectmodelling.company;

import java.util.ArrayList;

public class Department {

    private String departmentName;
    private ArrayList<Employee> employees;

    // Constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Add employee to department
    public void addEmployee(int id, String name) {
        Employee employee = new Employee(id, name);
        employees.add(employee);
    }

    // Display department details
    public void showDepartment() {
        System.out.println("Department: " + departmentName);
        System.out.println("-----------------------");

        for (Employee emp : employees) {
            emp.showEmployee();
            System.out.println();
        }
    }

    // Cleanup method (used in composition)
    public void clearEmployees() {
        employees.clear();
    }
}
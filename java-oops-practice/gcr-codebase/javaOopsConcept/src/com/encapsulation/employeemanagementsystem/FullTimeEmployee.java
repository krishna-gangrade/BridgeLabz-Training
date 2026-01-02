package com.encapsulation.employeemanagementsystem;

class FullTimeEmployee extends Employee implements Department {

    private String department;

    FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    double calculateSalary() {
        return baseSalary; // fixed salary
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return department;
    }
}
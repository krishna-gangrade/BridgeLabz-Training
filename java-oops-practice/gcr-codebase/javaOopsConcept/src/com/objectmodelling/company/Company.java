package com.objectmodelling.company;

import java.util.ArrayList;

public class Company {

    private String companyName;
    private ArrayList<Department> departments;

    // Constructor
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Create department inside company (composition)
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Display company structure
    public void showCompanyDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("========================");

        for (Department dept : departments) {
            dept.showDepartment();
        }
    }

    // Delete company (composition cleanup)
    public void deleteCompany() {
        for (Department dept : departments) {
            dept.clearEmployees();
        }
        departments.clear();
        System.out.println("Company, departments, and employees deleted successfully.");
    }
}
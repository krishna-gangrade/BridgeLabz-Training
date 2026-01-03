package com.objectmodelling.company;

public class Main {

    public static void main(String[] args) {

        // Company object
        Company company = new Company("Tech Solutions Pvt Ltd");

        // Departments created inside company
        Department itDept = new Department("IT Department");
        Department hrDept = new Department("HR Department");

        // Employees added inside departments
        itDept.addEmployee(101, "Amit");
        itDept.addEmployee(102, "Neha");

        hrDept.addEmployee(201, "Ravi");

        // Departments added to company
        company.addDepartment(itDept);
        company.addDepartment(hrDept);

        // Display structure
        company.showCompanyDetails();

        // Deleting company (composition)
        company.deleteCompany();
    }
}
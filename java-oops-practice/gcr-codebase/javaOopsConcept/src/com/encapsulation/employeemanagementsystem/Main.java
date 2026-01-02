
package com.encapsulation.employeemanagementsystem;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[2];

        FullTimeEmployee e1 =
                new FullTimeEmployee(101, "Amit", 50000);
        e1.assignDepartment("IT");

        PartTimeEmployee e2 =
                new PartTimeEmployee(102, "Riya", 500, 40);
        e2.assignDepartment("HR");

        employees[0] = e1;
        employees[1] = e2;

        for (Employee emp : employees) {
            emp.displayDetails();

            Department dept = (Department) emp;
            System.out.println("Department  : " + dept.getDepartmentDetails());
            System.out.println("--------------------------------");
        }
    }
}

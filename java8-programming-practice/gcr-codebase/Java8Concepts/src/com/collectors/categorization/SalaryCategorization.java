package com.collectors.categorization;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SalaryCategorization {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Prashant", "IT", 75000),
                new Employee("Ananya", "HR", 50000),
                new Employee("Rahul", "IT", 85000),
                new Employee("Neha", "Finance", 65000),
                new Employee("Arjun", "HR", 55000),
                new Employee("Vikram", "Finance", 70000)
        );

        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)
                ));

        System.out.println("Average Salary by Department");
        System.out.println("-----------------------------");

        avgSalaryByDept.forEach((dept, avgSalary) ->
                System.out.printf("%-10s : %.2f%n", dept, avgSalary)
        );
    }
}

package com.methodreferences.nameuppercasing;

import java.util.ArrayList;
import java.util.List;

public class NameUppercasingApp {
	public static void main(String[] args) {
		// sample employee list
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee("Amit Kumar", "Engineering", 78000.0));
		employees.add(new Employee("Ravi Sharma", "Marketing", 60000.0));
		employees.add(new Employee("Sunita Devi", "Finance", 88000.0));
		employees.add(new Employee("Rajesh Singh", "HR", 55000.0));
		employees.add(new Employee("Pooja Verma", "Operations", 72000.0));

		System.out.println("HR Letter Preparation - Employee Names in Uppercase");
		System.out.println("--------------------------------------------------");

		// Use method reference String::toUpperCase in stream
		employees.stream().map(emp -> emp.getName()) // get name
				.map(String::toUpperCase) // method reference
				.forEach(System.out::println); // print each uppercase name

		System.out.println("--------------------------------------------------");
		System.out.println("Total employees: " + employees.size());
	}
}
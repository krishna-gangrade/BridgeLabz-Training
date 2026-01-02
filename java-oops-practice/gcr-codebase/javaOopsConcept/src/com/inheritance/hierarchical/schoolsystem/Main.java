package com.inheritance.hierarchical.schoolsystem;

public class Main {

    public static void main(String[] args) {

        Person[] people = {
            new Teacher("Anita Sharma", 35, "Mathematics"),
            new Student("Rahul Verma", 16, "Grade 10"),
            new Staff("Suresh Kumar", 42, "Administration")
        };

        for (Person p : people) {
            p.displayBasicInfo();
            p.displayRole();
            System.out.println("--------------------------------");
        }
    }
}
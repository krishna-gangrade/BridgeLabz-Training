package com.inheritance.multilevel.educationalcourse;

public class Main {

    public static void main(String[] args) {

        Course[] courses = {
            new Course("Java Basics", 6),
            new OnlineCourse("Data Structures", 8, "Coursera", true),
            new PaidOnlineCourse("Advanced Java", 10, "Udemy", true, 5000, 20)
        };

        for (Course c : courses) {
            c.displayDetails();
            System.out.println("--------------------------------");
        }
    }
}
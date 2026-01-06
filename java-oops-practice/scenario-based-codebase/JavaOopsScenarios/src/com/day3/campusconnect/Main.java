package com.day3.campusconnect;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------------- FACULTY ----------------
        Faculty f1 = new Faculty(101, "Prabhat Sharma", "prabhatsharma@tit.edu", "CSE");
        Faculty f2 = new Faculty(102, "Subham Mehta", "shubhammehta@tit.edu", "Maths");

        // ---------------- COURSES ----------------
        Course[] courses = {
                new Course("Data Structures", f1),
                new Course("Discrete Mathematics", f2),
                new Course("Operating Systems", f1)
        };

        // ---------------- SHOW FACULTY ----------------
        System.out.println("=== Faculty Details ===");
        f1.printDetails();
        f2.printDetails();

        // ---------------- STUDENT STORAGE ----------------
        Student[] students = new Student[10]; // max 10 students
        int studentCount = 0;

        System.out.print("\nEnter number of students: ");
        int totalStudents = sc.nextInt();

        // ---------------- STUDENT LOOP ----------------
        for (int s = 0; s < totalStudents; s++) {

            System.out.println("\n--- Enter details for Student " + (s + 1) + " ---");

            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            // Student created (NO grades here)
            Student student = new Student(id, name, email, 5);

            // ---------------- COURSE OPTIONS ----------------
            System.out.println("\nAvailable Courses:");
            for (int i = 0; i < courses.length; i++) {
                System.out.print((i + 1) + ". ");
                courses[i].showCourse();
            }

            // ---------------- ENROLLMENT ----------------
            System.out.print("How many courses to enroll? ");
            int courseCount = sc.nextInt();

            for (int i = 0; i < courseCount; i++) {
                System.out.print("Choose course number: ");
                int choice = sc.nextInt();
                student.enrollCourse(courses[choice - 1]);
            }

            // ---------------- FACULTY ASSIGNS GRADES ----------------
            System.out.println("\nFaculty assigning grades...");
            f1.assignGrades(student, new int[]{8, 9, 7});
            
            sc.close();
}
    }
}
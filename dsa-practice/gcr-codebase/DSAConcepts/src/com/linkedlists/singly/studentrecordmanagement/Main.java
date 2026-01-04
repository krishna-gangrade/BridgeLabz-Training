package com.linkedlists.singly.studentrecordmanagement;

import java.util.Scanner;

class  Main {

    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== Student Record Management =====");
            System.out.println("1. Add Student at Beginning");
            System.out.println("2. Add Student at End");
            System.out.println("3. Add Student at Position");
            System.out.println("4. Delete Student by Roll Number");
            System.out.println("5. Search Student by Roll Number");
            System.out.println("6. Update Student Grade");
            System.out.println("7. Display All Students");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1 -> {
                    System.out.print("Roll: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    System.out.print("Grade: ");
                    char grade = sc.next().charAt(0);

                    list.addAtBeginning(roll, name, age, grade);
                }

                case 2 -> {
                    System.out.print("Roll: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    System.out.print("Grade: ");
                    char grade = sc.next().charAt(0);

                    list.addAtEnd(roll, name, age, grade);
                }

                case 3 -> {
                    System.out.print("Position: ");
                    int pos = sc.nextInt();
                    System.out.print("Roll: ");
                    int roll = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Age: ");
                    int age = sc.nextInt();
                    System.out.print("Grade: ");
                    char grade = sc.next().charAt(0);

                    list.addAtPosition(pos, roll, name, age, grade);
                }

                case 4 -> {
                    System.out.print("Enter Roll Number to delete: ");
                    list.deleteByRollNumber(sc.nextInt());
                }

                case 5 -> {
                    System.out.print("Enter Roll Number to search: ");
                    list.searchStudent(sc.nextInt());
                }

                case 6 -> {
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    System.out.print("Enter New Grade: ");
                    char grade = sc.next().charAt(0);

                    list.updateGrade(roll, grade);
                }

                case 7 -> list.displayAll();

                case 0 -> System.out.println("Exiting program...");

                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
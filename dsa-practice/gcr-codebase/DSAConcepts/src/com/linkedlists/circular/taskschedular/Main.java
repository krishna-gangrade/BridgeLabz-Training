package com.linkedlists.circular.taskschedular;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        TaskCircularLinkedList scheduler = new TaskCircularLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Task Scheduler =====");
            System.out.println("1. Add Task at Beginning");
            System.out.println("2. Add Task at End");
            System.out.println("3. Add Task at Position");
            System.out.println("4. Remove Task by ID");
            System.out.println("5. View Current Task & Move Next");
            System.out.println("6. Display All Tasks");
            System.out.println("7. Search Task by Priority");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> addTask(sc, scheduler, 1);
                case 2 -> addTask(sc, scheduler, 2);
                case 3 -> {
                    System.out.print("Position: ");
                    int pos = sc.nextInt();
                    sc.nextLine();
                    addTask(sc, scheduler, pos);
                }

                case 4 -> {
                    System.out.print("Enter Task ID: ");
                    scheduler.removeByTaskId(sc.nextInt());
                }

                case 5 -> scheduler.viewNextTask();
                case 6 -> scheduler.displayAllTasks();

                case 7 -> {
                    System.out.print("Enter Priority: ");
                    scheduler.searchByPriority(sc.nextInt());
                }

                case 0 -> System.out.println("Exiting Task Scheduler...");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }

    private static void addTask(Scanner sc, TaskCircularLinkedList scheduler, int mode) {

        System.out.print("Task ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Task Name: ");
        String name = sc.nextLine();

        System.out.print("Priority: ");
        int priority = sc.nextInt();
        sc.nextLine();

        System.out.print("Due Date: ");
        String dueDate = sc.nextLine();

        if (mode == 1)
            scheduler.addAtBeginning(id, name, priority, dueDate);
        else if (mode == 2)
            scheduler.addAtEnd(id, name, priority, dueDate);
        else
            scheduler.addAtPosition(mode, id, name, priority, dueDate);
    }
}
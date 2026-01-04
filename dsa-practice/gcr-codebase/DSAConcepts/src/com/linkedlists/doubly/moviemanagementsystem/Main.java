package com.linkedlists.doubly.moviemanagementsystem;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        MovieDoublyLinkedList list = new MovieDoublyLinkedList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Movie Management System =====");
            System.out.println("1. Add Movie at Beginning");
            System.out.println("2. Add Movie at End");
            System.out.println("3. Add Movie at Position");
            System.out.println("4. Remove Movie by Title");
            System.out.println("5. Search Movie by Director");
            System.out.println("6. Search Movie by Rating");
            System.out.println("7. Update Movie Rating");
            System.out.println("8. Display Movies Forward");
            System.out.println("9. Display Movies Reverse");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> addMovie(sc, list, 1);
                case 2 -> addMovie(sc, list, 2);
                case 3 -> {
                    System.out.print("Position: ");
                    int pos = sc.nextInt();
                    sc.nextLine();
                    addMovie(sc, list, pos);
                }

                case 4 -> {
                    System.out.print("Enter movie title: ");
                    list.removeByTitle(sc.nextLine());
                }

                case 5 -> {
                    System.out.print("Enter director name: ");
                    list.searchByDirector(sc.nextLine());
                }

                case 6 -> {
                    System.out.print("Enter minimum rating: ");
                    list.searchByRating(sc.nextDouble());
                }

                case 7 -> {
                    System.out.print("Enter movie title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter new rating: ");
                    double rating = sc.nextDouble();
                    list.updateRating(title, rating);
                }

                case 8 -> list.displayForward();
                case 9 -> list.displayReverse();
                case 0 -> System.out.println("Exiting system...");
                default -> System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }

    private static void addMovie(Scanner sc, MovieDoublyLinkedList list, int mode) {

        System.out.print("Title: ");
        String title = sc.nextLine();
        System.out.print("Director: ");
        String director = sc.nextLine();
        System.out.print("Year: ");
        int year = sc.nextInt();
        System.out.print("Rating: ");
        double rating = sc.nextDouble();
        sc.nextLine();

        if (mode == 1)
            list.addAtBeginning(title, director, year, rating);
        else if (mode == 2)
            list.addAtEnd(title, director, year, rating);
        else
            list.addAtPosition(mode, title, director, year, rating);
    }
}
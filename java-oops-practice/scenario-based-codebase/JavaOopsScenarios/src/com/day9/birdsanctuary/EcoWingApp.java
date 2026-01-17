package com.day9.birdsanctuary;

import java.util.Scanner;

public class EcoWingApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BirdSanctuary sanctuary = new BirdSanctuary();

        while (true) {
            System.out.println("Welcome to EcoWing Bird Sanctuary");
            System.out.println("1. Add Bird");
            System.out.println("2. Display All Birds");
            System.out.println("3. Display Flying Birds");
            System.out.println("4. Display Swimming Birds");
            System.out.println("5. Display Both Flying & Swimming Birds");
            System.out.println("6. Delete Bird by ID");
            System.out.println("7. Sanctuary Report");
            System.out.println("8. Exit");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.print("Enter ID: ");
                    String id = input.nextLine();

                    System.out.print("Enter Name: ");
                    String name = input.nextLine();

                    System.out.println("Select Bird Type:");
                    System.out.println("1. Eagle");
                    System.out.println("2. Duck");
                    System.out.println("3. Penguin");
                    System.out.println("4. Seagull");
                    System.out.println("5. Kiwi");
                    System.out.println("6. Ostrich");

                    int type = input.nextInt();
                    input.nextLine();

                    Bird bird = null;

                    switch (type) {
                        case 1 -> bird = new Eagle(id, name);
                        case 2 -> bird = new Duck(id, name);
                        case 3 -> bird = new Penguin(id, name);
                        case 4 -> bird = new Seagull(id, name);
                        case 5 -> bird = new Kiwi(id, name);
                        case 6 -> bird = new Ostrich(id, name);
                        default -> System.out.println("Invalid type");
                    }

                    if (bird != null) sanctuary.addBird(bird);
                    break;
                }
                case 2 -> sanctuary.displayAllBirds();
                case 3 -> sanctuary.displayFlyingBirds();
                case 4 -> sanctuary.displaySwimmingBirds();
                case 5 -> sanctuary.displayBothFlyingAndSwimming();
                case 6 -> {
                    System.out.print("Enter Bird ID to delete: ");
                    sanctuary.removeBirdById(input.nextLine());
                }
                case 7 -> sanctuary.sanctuaryReport();
                case 8 -> {
                    System.out.println("Thank you for using EcoWing Sanctuary!");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}

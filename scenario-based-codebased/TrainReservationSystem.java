/*

Train Reservation Queue 🚆
Simulate a basic ticket booking system.
● Show menu with switch
● Allow multiple bookings using while-loop.
● Stop booking once seats reach zero (break).

*/

import java.util.Scanner;

public class TrainReservationSystem {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int capacity = 50;
        String[] names = new String[50];
        int[] ages = new int[50];
        int bookedSeats = 0;
        boolean running = true;

        while (running) {

            System.out.println("\n🚆 Train Reservation System");
            System.out.println("1. Book Ticket");
            System.out.println("2. Check Available Seats");
            System.out.println("3. Cancel Last Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    if (bookedSeats == capacity) {
                        System.out.println("No seats available. Booking closed.");
                        break; // seats reached zero condition
                    }

                    input.nextLine(); 
                    System.out.print("Enter Passenger Name: ");
                    names[bookedSeats] = input.nextLine();

                    System.out.print("Enter Passenger Age: ");
                    ages[bookedSeats] = input.nextInt();

                    bookedSeats++;
                    System.out.println("Ticket booked successfully!");
                    break;

                case 2:
                    System.out.println("Seats Available: " + (capacity - bookedSeats));
                    System.out.println("Seats Booked   : " + bookedSeats);
                    break;

                case 3:
                    if (bookedSeats == 0) {
                        System.out.println("No tickets to cancel.");
                    } else {
                        bookedSeats--;
                        System.out.println("Last ticket cancelled successfully.");
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("Thank you for using Train Reservation System.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

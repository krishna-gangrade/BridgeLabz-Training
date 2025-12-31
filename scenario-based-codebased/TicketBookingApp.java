/*/

 Movie Ticket Booking App 🎬
Ask users for movie type, seat type (gold/silver), and snacks.
● Use switch and if together.
● Loop through multiple customers.
● Clean structure and helpful variable names.

*/ 

import java.util.Scanner;

public class TicketBookingApp{
    public static void main(String args[]){

        Scanner input=new Scanner(System.in);
        boolean nextCustomer=true;

        while(nextCustomer){

            int totalAmount=0;
            String movie="";
            String seatType="";

            System.out.println("\n================================");
            System.out.println("       MOVIE BOOKING APP");
            System.out.println("================================");

            //Movies
            System.out.println("Select Movie Type:");
            System.out.println("1. Horror");
            System.out.println("2. Romance");
            System.out.println("3. Comedy");
            System.out.println("4. Action");
            System.out.print("Enter your choice: ");

            int movieChoice=input.nextInt();

            switch(movieChoice){
                case 1: movie="Horror"; break;
                case 2: movie="Romance"; break;
                case 3: movie="Comedy"; break;
                case 4: movie="Action"; break;
                default:
                    System.out.println("Invalid movie choice!");
                    continue;
            }

            //Seat Menu
            System.out.println("\nSelect Seat Type:");
            System.out.println("1. Gold   (₹360)");
            System.out.println("2. Silver (₹250)");
            System.out.print("Enter your choice: ");

            int seatChoice = input.nextInt();

            if(seatChoice==1){
                seatType="Gold";
                totalAmount += 360;
            }else if(seatChoice==2){
                seatType="Silver";
                totalAmount +=250;
            }else{
                System.out.println("Invalid seat choice!");
                continue;
            }

            //Snacks
            System.out.println("\nAdd Snacks?");
            System.out.println("1. Yes (₹150)");
            System.out.println("2. No");
            System.out.print("Enter your choice: ");

            int snackChoice=input.nextInt();
            if(snackChoice==1){
                totalAmount +=150;
            }

            //Displays the result
            System.out.println("\n================================");
            System.out.println("         BOOKING RECEIPT");
            System.out.println("================================");
            System.out.println(" Movie Name  : " +movie);
            System.out.println(" Seat Type   : " +seatType);
            System.out.println("--------------------------------");
            System.out.println(" Total Bill  : " +totalAmount);
            System.out.println("================================");
            System.out.println("    Enjoy Your Movie! ");
            System.out.println("================================");

            //Next Customer
            System.out.print("\nNext customer? (true/false): ");
            nextCustomer = input.nextBoolean();
        }

        System.out.println("\nThank you for using Movie Booking App ");
        input.close();
    }
}

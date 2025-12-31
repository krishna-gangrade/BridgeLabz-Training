/*

Rohan’s Library Reminder App 📚
Rohan wants a fine calculator:
● Input return date and due date.
● If returned late, calculate fine: ₹5/day.
● Repeat for 5 books using for-loop.

*/

import java.util.Scanner;

public class LibraryReminderApp{
    public static void main(String args[]){

        Scanner input=new Scanner(System.in);

        int finePerDay=5;
        int totalFine=0;

        System.out.println("=================================");
        System.out.println("      ROHAN'S LIBRARY APP");
        System.out.println("=================================");

        //Loop for the 5 books
        for (int book=1;book<=5;book++){

            System.out.println("\nBook "+book+":");

            System.out.print("Enter Due Date (day number): ");
            int dueDate=input.nextInt();

            System.out.print("Enter Return Date (day number): ");
            int returnDate=input.nextInt();

            if(returnDate>dueDate){
                int lateDays=returnDate-dueDate;
                int fine=lateDays*finePerDay;
                totalFine+=fine;

                System.out.println("Late by "+lateDays+" days");
                System.out.println("Fine for this book: "+fine);
            }else{
                System.out.println("Returned on time. No fine.");
            }
        }

        //Displays the result
        System.out.println("\n=================================");
        System.out.println("         FINE SUMMARY");
        System.out.println("=================================");
        System.out.println("Total Fine to Pay: "+totalFine);
        System.out.println("=================================");

        input.close();
    }
}

/*

School Bus Attendance System 🚍
Track 10 students' presence.
● Use for-each loop on names.
● Ask "Present or Absent?"
● Print total present and absent counts.

*/

//Create a class SchoolBusAttendanceSystem to have attendance of Students in School Bus
import java.util.Scanner;

public class SchoolBusAttendanceSystem {

    public static void main(String args[]) {

        //Array of 10 student names
        String[] students = {
            "Amit", "Rahul", "Raj", "Jay", "Rohan",
            "Gautam", "Arjun", "Pratham", "Mohit", "Prashant"
        };

        int presentCount = 0;
        int absentCount = 0;

        Scanner input = new Scanner(System.in);

        //for-each loop to take attendance
        for (String name : students) {
            System.out.print(name + " - Present or Absent? ");
            String status = input.nextLine();

            if (status.equalsIgnoreCase("Present")) {
                presentCount++;
            } else if (status.equalsIgnoreCase("Absent")) {
                absentCount++;
            }
        }

        // Displays the result
        System.out.println("\nAttendance Summary:");
        System.out.println("Total Present: " + presentCount);
        System.out.println("Total Absent: " + absentCount);

        input.close();
    }
}

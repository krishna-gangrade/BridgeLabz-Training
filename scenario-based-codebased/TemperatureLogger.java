/*

Temperature Logger 🌡️
Record temperatures over 7 days.
● Use array and for-loop.
● Find average and max temperature.
● Use if for comparisons. Maintain readable naming and modular code blocks.

*/


//Create a class TemperatureLogger to find the average temperature throughout the week and to show max temperature

import java.util.*;

public class TemperatureLogger {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        int[] temperature = new int[7];
        int sum = 0;
        int max = Integer.MIN_VALUE;  
		
        // Input temperatures
        for (int i = 0; i < temperature.length; i++) {

            System.out.println("Enter the temperature for day " + (i + 1) + ": ");
            temperature[i] = input.nextInt();

            sum = sum + temperature[i];

            if (temperature[i] > max) {
                max = temperature[i];
            }
        }

        // Calculate average
        double average = (double) sum / temperature.length;

        //Displays the result
        System.out.println("\nAverage Temperature: " + average);
        System.out.println("Maximum Temperature: " + max);
    }
}

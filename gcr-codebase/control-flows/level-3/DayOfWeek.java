//Create a class DayOfWeek to find the day of the week for a given date
import java.util.*;

public class DayOfWeek {
    public static void main(String args[]) {

        Scanner input= new Scanner(System.in);
		
		//Create variables m, d, y to store user input
		int m= input.nextInt();
		int d= input.nextInt();
		int y= input.nextInt();

        //Gregorian calendar formula
        int y0 = y - (14 - m) / 12;
        int x  = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        //Displays the result
        System.out.println(d0);
    }
}

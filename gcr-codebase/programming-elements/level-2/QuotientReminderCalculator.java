//Create a class QuotientReminderCalculator to calculate Quotient and Reminder
import java.util.*;

public class QuotientReminderCalculator{
	public static void main(String args[]){
		
		Scanner kb= new Scanner(System.in);
		int number1= kb.nextInt();
		int number2= kb.nextInt();
		
		int quotient= number1/number2;
		int reminder= number1%number2;
		
		System.out.println("The Quotient is "+quotient+" and Reminder is "+reminder+" of two number "+number1+" and "+number2);
	}
}

//Create a class BonusCalculator and calculate the bonus of the employee
import java.util.*;

public class BonusCalculator{
	public static void main(String args[]){
		
		Scanner kb= new Scanner(System.in);
		
		//Create variable to store user input
		int salary= kb.nextInt();
		int yearOfService= kb.nextInt();
		
		int bonus= 0;
		//if condition to check year of service is more than 5 years
		if(yearOfService>5){
			bonus= (salary*5)/100;
		}
		//Displays the result
		System.out.println("Bonus of the employee is "+bonus);
	}
}
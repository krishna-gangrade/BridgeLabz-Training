//Create a class LeapYear and to find if the year is leap year 
import java.util.*;

public class LeapYear{
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
		
		int year= input.nextInt();
		
		//LeapYear program only works for year >= 1582
		if(year>=1582){
		
			//multiple if else statements
			if(year%400==0){
				System.out.println(Year+" is a leap Year");
			}
			else if(year%100==0){
				System.out.println(Year+" is not a leap Year");
			}
			else if(year%4==0){
				System.out.println(Year+" is a leap Year");
			}
			else{
				System.out.println(Year+" is not a leap Year");
			}
			
			//Condition using logical and && and or || operators
			if((year%4==0 && year%100!=0) ||(year%400==0)){
				System.out.println(Year+" is a leap Year");
			}
			else{
				System.out.println(Year+" is not a leap Year");
			}
			
		}
		else{
			System.out.println("Leap Year calculation is valid only for year >= 1582");
		}
	}
}
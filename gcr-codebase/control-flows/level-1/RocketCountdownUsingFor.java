//Create a class RocketCountdown for countdown to 1 using for loop
import java.util.*;

public class RocketCountdownUsingFor{
	public static void main(String args[]){
		
		Scanner kb= new Scanner(System.in);
		
		int number= kb.nextInt();
		
		//For loop for countdown
		for(int i=number;i>=1;i--){
			System.out.println(number);
		}
	}
}
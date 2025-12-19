//Create a class GreatestFactor to find the greatest factor of the ficen number
import java.util.*;

public class GreatestFactor{
	public static void main(String args[]){
	
		Scanner kb= new Scanner(System.in);

		int number= kb.nextInt();
		
		int greatestFactor=1;
		
		//for loop to iterate in reverse
		for(int i=number-1;i>=1;i--){
		
			//if condition is checking divisibility
			if(number%i==0){
				greatestFactor= i;
				break;
			}
		}
		
		//Displays the resuly
		System.out.println(greatestFactor);
	}
}
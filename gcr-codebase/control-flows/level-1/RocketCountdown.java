//Create a class RocketCountdown for countdown to 1
import java.util.*;

public class RocketCountdown{
	public static void main(String args[]){
		
		Scanner kb= new Scanner(System.in);
		
		int number= kb.nextInt();
		
		//While loop for countdown
		while(number>=1){
			System.out.println(number);
			number--;
		}
	}
}
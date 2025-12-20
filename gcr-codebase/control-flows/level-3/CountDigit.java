//Create a class CountDigit to count the number of digits in a number
import java.util.*;

public class CountDigit{
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
		
		int number= input.nextInt();
		
		int count=0;
		
		//while to iterate in the loop
		while(number!=0){
			number= number/10;
			count++;
		}
		
		//Displays the result
		System.out.println(count);
	}
}
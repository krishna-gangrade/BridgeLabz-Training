// Create a class DivisiorFinder and print multiples of the given number below 100
import java.util.*;

public class DivisiorFinder{
	public static void main(String args[]){
		
		Scanner kb= new Scanner(System.in);
		
		int number= kb.nextInt();
		
		//if condition is used to check the number is positive and smaller than 100
		if(number>0 && number<100){
		
			for(int i=100;i>=1;i--){
				if(i%number==0){
					System.out.println(i);
					continue;
				}
			}
		}
		else{
			System.out.println("Please enter a positive integer less than 100");
		}
		
	}
}
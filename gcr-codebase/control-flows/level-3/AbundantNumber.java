//Create a class AbundantNumber to check if number is Abundant number or not
import java.util.*;

public class AbundantNumber{
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
		
		int number=input.nextInt();
		
		int sum= 0;
		
		//for loop to calculate the sum
		for(int i=1;i<number;i++){
			if(number%i==0){
				sum= sum+i;
			}
		}
		
		//Checks the sum is greater than number and Displays the result
		if(sum>number){
			System.out.println("Abundant Number :"+number);
		}
		else{
			System.out.println("Not an Abundant Number :"+number);
		}
	}
}
		
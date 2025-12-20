//Create a class FizzBuzzArray to print the numbers and if they are divisible by 3, 5 and both then print "Fizz" , "Buzz" and "FizzBuzz"
import java.util.*;

public class FizzBuzzArray{
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
		
		int number= input.nextInt();
		
		String [] array= new String[number+1];
		
		//To check if the number is greater than 0
		if(number>0){
		
			//To iterate over all numbers
			for(int i=0;i<=number;i++){
				
				//if number is divisible by 3, 5 and both
				if(i%3==0 &&i%5==0){
					array[i]="FizzBuzz";
				}
				else if(i%3==0){
					array[i]="Fizz";
				}
				else if(i%5==0){
					array[i]="Buzz";
				}
				else{
					array[i]=String.valueOf(i);
				}
			}
		}
		
		//Displays the result
		for(int i=1;i<=number;i++){
			System.out.println("Position "+i+" = "+array[i]);
		}
	}
}
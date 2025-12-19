//Create a class FizzBuzz and print the result
import java.util.*;

public class FizzBuzzUsingWhile{
	public static void main(String args[]){
		
		Scanner kb= new Scanner(System.in);
		
		int number= kb.nextInt();
		
		//Condition checks if the number is positive 
		if(number>0){
		
			int i=0;
			//While is used to iterate till number
			while(number>=i){
				
				//condition checks the divisibility and prints the result
				if(i%3==0 && i%5==0){
					System.out.println("FizzBuzz");
				}
				else if(i%3==0){
					System.out.println("Fizz");
				}
				else if(i%5==0){
					System.out.println("Buzz");
				}else{
					System.out.println(i);
				}
				i++;
			}
		}
	}
}
			
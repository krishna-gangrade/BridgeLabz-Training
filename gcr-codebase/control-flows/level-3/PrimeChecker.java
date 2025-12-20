//Create a class PrimeChecker and check if the given number is prime
import java.util.*;

public class PrimeChecker{
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
		
		int number= input.nextInt();
		boolean isPrime= true;
		
		//for is used to iterate till number
		for(int i=2; i<number;i++){
			if(number%i==0){
				isPrime= false;
				break;
			}
		}
		
		//Displays the result
		System.out.println("The given number "+number+" is prime ? "+isPrime);
	}
}
//Create a class CheckNumberSign to find the number status
import java.util.*;

public class CheckNumberSign{
	public static void main(String args[]){
		
		Scanner kb= new Scanner(System.in);
		
		int number= kb.nextInt();
		
		//Checks if the number is positive or negative or zero 
		if(number==0){
			System.out.println("Zero");
		}else if(number>0){
			System.out.println("Positive");
		}else{
			System.out.println("Negative");
		}
	}
}
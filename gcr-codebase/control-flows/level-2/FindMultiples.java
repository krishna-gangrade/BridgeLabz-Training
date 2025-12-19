//Create a class FindMultiples and print multiples of the given number below 100
import java.util.*;

public class FindMultiples{
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
		
		int number= input.nextInt();
		
		//if condition is used to check the number is positive and smaller than 100
		if(number>0 && number<100){
			int counter= number-1;
			
			while(counter>1){
				if(counter%number==0){
					System.out.println(number);
					continue;
				}
			}
		}
		else{
			System.out.println("Please enter a positive integer less than 100");
		}
	}
}
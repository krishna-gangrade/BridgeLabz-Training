//Create a class MultiplicationTableGenerator and print the required result
import java.util.*;

public class MultiplicationTableGenerator{
	public static void main(String args[]){
		
		Scanner kb= new Scanner(System.in);
		
		int number= kb.nextInt();
		
		//for loop to iterate and print the result
		for(int i=6;i<=9;i++){
			System.out.println(number+" * "+i+" = "+ (number*i));
		}
	}
}
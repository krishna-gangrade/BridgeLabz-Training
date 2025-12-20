//Create a class MultiplicationTableUsingArray to print the multiplication table from 6 to 9 of given number
import java.util.*;

public class MultiplicationTableUsingArray{
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		
		int number= input.nextInt();
		int [] multiplicationResult = new int[4];
		
		//for loop to insert the element in array
		for(int i=6, index=0;i<=9;i++, index++){
			multiplicationResult[index]= i*number;
		}
		
		//for loop to print the result
		for(int i=6, index=0;i<=9;i++, index++){
			System.out.println(number+" * "+i+" = "+multiplicationResult[index]);
		}
	}
}
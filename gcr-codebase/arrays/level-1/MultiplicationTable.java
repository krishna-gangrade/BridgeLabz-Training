//Create a class MultiplicationTable to print the multiplication table of the inputted number
import java.util.*;

public class MultiplicationTable{
	public static void main(String args[]){
	
		Scanner input= new Scanner(System.in);
		
		int number= input.nextInt();
		
		int [] array= new int[10];
		
		//for to store the multiplication in the array
		for(int i=1;i<=array.length;i++){
			array[i-1]= number * i;
		}
		
		//for to display the multiplication table
		for(int i=1;i<=array.length;i++){
			System.out.println(number+" * "+i+" = "+array[i-1]);
		}
	}
}
	
	
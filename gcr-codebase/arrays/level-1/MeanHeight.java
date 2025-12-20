//Create a class MeanHeight to calculate mean height of all the players
import java.util.*;

public class MeanHeight{
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		double [] height= new double[11];
		double sum=0.0;
		
		//for loop for insertion of element and sum
		for(int i=0;i<height.length;i++){
			height[i]= input.nextDouble();
			sum=sum+height[i];
		}
		
		//formula for mean
		double mean= sum/11;
		
		//Displays the result
		System.out.println("Mean height of the players : "+mean);
	}	
}
import java.util.*;

public class SquarePerimeterCalculator{
public static void main(String args[]){

    Scanner kb= new Scanner(System.in);
	
	//Create variable and assign input perimeter
	double perimeter= kb.nextDouble();
	
	//Perimeter of square = 4 * side;
	double side= perimeter/4;
	
	//Displays the result
	System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
}
}

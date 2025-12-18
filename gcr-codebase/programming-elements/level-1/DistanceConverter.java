import java.util.*;

public class DistanceConverter{
public static void main(String args[]){
    
	Scanner kb= new Scanner(System.in);
	
	//Variable is created to store users input
	double km= kb.nextDouble();
	
	//Conversion 1 miles = 1.6 km;
	double mile= km/1.6;
	
	//Displays the result
	System.out.println("The total miles is "+mile+" mile for the given "+km+" km");
}
}

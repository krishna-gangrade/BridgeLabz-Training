import java.util.*;

public class HeightConverter{
public static void main(String args[]){
    
	Scanner kb = new Scanner(System.in);
	
	// Taking height in centimeters as input
    double heightCm = kb.nextDouble();
	
	//Convert cm to inches
	double totalInch= heightCm/2.54;
	
	//Convert inch to feet, and remaining inches
	int feet= (int)(totalInch/12);
	
	double inches= totalInch%12;
	
	//Display the result
	System.out.println("Your Height in cm is " + heightCm +" while in feet is " + feet +" and inches is " + inches);
}
}
	
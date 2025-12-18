import java.util.*;

public class TriangleAreaCalculator{
public static void main(String args[]){
    Scanner kb= new Scanner(System.in);
	
	double base = kb.nextDouble();
    double height = kb.nextDouble();
	
	//Area of triangle 
    double areaInSqCm= 0.5*base*height;
	
	//Conversion cm to inch
	double areaInSqInches= areaInSqCm/6.4516;
	
	//Displays the result
	System.out.println("The area of triangle is "+areaInSqCm+" square centimeters and "+areaInSqInches+" square inches");
}
}	
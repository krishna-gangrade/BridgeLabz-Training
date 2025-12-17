import java.util.*;
import java.lang.Math;

public class VolumeOfEarth{
public static void main(String args[]){

    int radiusInKilometers= 6378;
	
	//Converting kilometers to miles
	double radiusInMiles= radiusInKilometers*0.6213;
	
	//Volume of Sphere = (4/3) * pi * r^3
	double volumeInKilometers= (4.0/3)*Math.PI* Math.pow(radiusInKilometers,3);
	double volumeInMiles= (4.0/3)*Math.PI* Math.pow(radiusInMiles,3);
	
	//Displays the result
	System.out.println("The volume of earth in cubic kilometers is "+volumeInKilometers+" and cubic miles is "+volumeInMiles);
}
}
	
	
	
	
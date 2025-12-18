import java.util.*;

public class DistanceInYardsAndMiles{
    public static void main(System.in){
    
	    Scanner kb= new Scanner(System.in);
	
	    double feet= kb.nextDouble();
	
	    double yards= feet/3;
	
	    double miles = yards/1760;
	
	    System.out.println("The total miles and yards are "+miles+" miles and "+yards+" yards for the given "+feet+" feet");
    }
}
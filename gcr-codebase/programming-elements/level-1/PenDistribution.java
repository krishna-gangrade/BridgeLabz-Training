import java.util.*;

public class PenDistribution{
public static void main(String args[]){
    
	int totalPens=14;
	int students=3;
	
    int remainingPens= totalPens%students;
	
	int pensDistributed= totalPens/students;
	
	//Display the result
	System.out.println("The Pen Per Student is "+pensDistributed+" and the remaining pen not distributed is "+remainingPens);
}
}
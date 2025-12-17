import java.util.*;

public class AverageMarks{
    public static void main(String args[]){
	
	    //Multiline Variable for math, physic and chemistry
	    int math= 94, physic= 95, chemistry= 96;
		
		//Create a variable obtainedMarks and assign the sum of the subject marks
		int obtainedMarks= math+physic+chemistry;
		
		//Create a variable totalMarks and assign 300
		double totalMarks= 300.0;
		
		//Create a variable to indicate the percent of obtained marks
		double percent= (obtainedMarks/totalMarks)*100;
		
		//Display the result in percent
		System.out.println("Sam’s average mark in PCM is "+ percent);
	}
}
    
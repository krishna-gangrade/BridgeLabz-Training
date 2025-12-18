//Creating a class MaxHandshakes to calculate maximum numbers of handshakes
import java.util.*;

public class MaxHandshakes{
    public static void main(String args[]){
	
	    Scanner kb= new Scanner(System.in);
	
	    //Creating variable numberOfStudents to store numbers of students
	    int numberOfStudents= kb.nextInt();
	
	    //Creating variable maxHandshakes to store the numbers of handshakes
	    int maxHandshakes= (numberOfStudents * (numberOfStudents - 1)) / 2;
	
		//Displays the result
	    System.out.println("The maximum number of possible handshakes among "+numberOfStudents+" student is "+maxHandshakes);
	}
}
	
	
	
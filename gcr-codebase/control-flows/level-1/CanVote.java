//Create a class CanVote and display there status
import java.util.*;

public class CanVote{
	public static void main(String args[]){
	
		Scanner kb= new Scanner(System.in);
		
        int age = kb.nextInt();
		
		//Check the condition and prints the result
        if(age>=18) {
            System.out.println("The person's age is "+age+" and can vote.");
        } else{
            System.out.println("The person's age is "+age+" and cannot vote.");
        }
    }
}

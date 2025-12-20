//Create a class VotingEligibility to take 10 student age and check if they can vote or not
import java.util.*;

public class VotingEligibility {
    public static void main(String args[]) {

        Scanner kb= new Scanner(System.in);

        // Define an array of size 10
        int[] ages= new int[10];

        // Take user input for ages
        for(int i=0; i< ages.length;i++){
            ages[i]= kb.nextInt();
        }

        //for loop to iterate over array
        for(int i=0;i<ages.length;i++){
		
			//if to check eligibility
            if(ages[i]<0){
                System.out.println("Invalid age");
            } 
            else if(ages[i]>=18){
                System.out.println("The student with the age "+ages[i]+" can vote");
            } 
            else{
                System.out.println("The student with the age "+ages[i]+" cannot vote");
            }
        }
    }
}

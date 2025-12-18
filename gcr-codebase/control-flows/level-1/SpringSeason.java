//Create a class SpringSeason and find if season is spring
import java.util.*;

public class SpringSeason{
	public static void main(String args[]){
		
		Scanner kb= new Scanner(System.in);
		
		//Create variable month and day 
		int month= kb.nextInt();
		int day= kb.nextInt();
		
		//Condition check and print the result
		if (month>=3 && month<=6){
			if((month==3 && day>=20)||(month==6 && day<=20)||(month==4 || month==5)){
                System.out.println("Its a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }
        }else{
            System.out.println("Not a Spring Season");
        }
	}
}
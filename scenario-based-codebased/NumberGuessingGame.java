/*

7. The Number Guessing Game 🎲
A game asks the player to guess a number between 1 and 100.
Core Java Scenario Based Problem Statements
● Use do-while loop.
● Give hints like "Too high" or "Too low".
● Count attempts and exit after 5 wrong tries.

*/
import java.util.Scanner;

public class NumberGuessingGame{
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
		
		int random= (int)((Math.random()*100)+1);
		int counter=0;
		int number;
		do{
			System.out.println("Enter a number :");
			number= input.nextInt();
			counter++;
			if(number>random){
				System.out.println("Too High");
			}
			else if(number<random){
				System.out.println("Too Low");
			}
			else{
				System.out.println("Congrats!!! You got the number in "+counter+" attempts");
				break;
			}
		}
		while(counter<5);
		if(number!=random){
			System.out.println("Game over...!!! You used all 5 attempts");
			System.out.println("Correct number was : "+random);
		}
	}
}


		
		 
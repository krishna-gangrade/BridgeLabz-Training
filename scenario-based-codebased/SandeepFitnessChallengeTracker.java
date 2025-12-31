/*

Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.

*/

//Create a class SandeepFitnessChallengeTracker to track pushup average in a week
import java.util.Scanner;

public class SandeepFitnessChallengeTracker{
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
		
		int [] days= new int[7];
		
		//Loop to take the number of pushups on day
		for(int i=0;i<7;i++){	
			System.out.println("Enter the number of Push-ups in day"+(i+1)+" (0 == Rest day) ");
			days[i]= input.nextInt();
		}
		
		int totalPushups=0;
		int workoutDays=0;
		
		//for-each loop to check if the inserted number is not zero
		for(int pushUps: days){
			if(pushUps==0){
				continue;
			}
			
			totalPushups+= pushUps;
			workoutDays++;
		}
		
		double average= (workoutDays>0) ? (float) totalPushups/ workoutDays:0;
		
		//Displays the result
		System.out.println("Total Push-ups  :" + totalPushups);
		System.out.println("Workout Days  :" + workoutDays);
		System.out.println("Average/Days  :" + average);
		
		System.out.println("Keep Going, Sandeep ! Consistency is the key");
		
	}
}
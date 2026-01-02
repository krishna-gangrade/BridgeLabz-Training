/*

Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements

*/

//Create a class DigitalWatchSimulation to print the time and break at 13:00 
public class DigitalWatchSimulation{
	public static void main(String args[]){
		
		System.out.println("Digital Watch Simulation");
		
		for(int hours=0;hours<23;hours++){
		
			int minutes=0;
			
			for(int i=0;i<60;i++){
			
				System.out.println(hours+" : "+i);
				
				if(hours==13 && minutes==0){
					System.out.println("Power Cut !!! Time Stopped.");
					return;
				}
				
				minutes++;
			}
		}
	}
}
				
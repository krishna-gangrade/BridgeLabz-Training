/* 

6. Parking Lot Gate System 🚗
Develop a smart parking system.
● Options: Park, Exit, Show Occupancy
● Use switch-case for the menu.
● while loop to continue until the parking lot is full or the user exits.

*/

import java.util.Scanner;

public class ParkingLotGateSystem{
	
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
		
		int capacity=5;
		
		int carsParked=0;
		
		boolean flag= true;
		
		while(flag){
			
			System.out.println("Enter number from given options :\n 1. Park Car \n 2. Exit Car \n 3. Status of Parking lot \n 4.Terminate ");
			
			int choice= input.nextInt();
			
			switch(choice){
				
				case 1:{
					if(carsParked<capacity){
						carsParked = carsParked + 1;
						System.out.println("Car Parked");
						break;
					}
					else{
						System.out.println("Parking lot full...Cannot Park here...");
						flag =false;
						break;
					}
				}
				
				case 2:{
					if(carsParked>0){
						carsParked=carsParked-1;
						System.out.println("Car exited");
						break;	
					}
					else{
						System.out.println("No cars in the Parking Lot");
						break;
					}
				}
				
				case 3:{
					System.out.println("Total capacity of the Parking Lot :"+capacity);
					System.out.println("There are "+carsParked+" cars parked in...");
					break;
				}
				
				case 4:{
					System.out.println("Thank you !!!");
					flag= false;
					break;
				}
				
				default:{
					System.out.println("Wrong Input....Try again...!!!");
					break;
				}
			}
		}
	}
}




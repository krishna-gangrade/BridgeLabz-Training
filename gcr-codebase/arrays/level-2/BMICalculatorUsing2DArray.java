//Create a class BMICalculatorForTeam to calculate BMI for the team and print the status in 2d array

import java.util.*;

public class BMICalculatorUsing2DArray{

    public static void main(String args[]){

        Scanner input=new Scanner(System.in);

        //Take number of persons
        System.out.print("Enter number of persons: ");
        int number=input.nextInt();

        //2D array to store weight, height, BMI
        double[][] personData=new double[number][3];

        //Array to store weight status
        String[] weightStatus=new String[number];

        //Input loop
        for(int i=0;i<number;i++){
            System.out.println("\nEnter details for Person "+(i+1));

            // Weight input validation
            while(true){
                System.out.print("Enter weight (kg): ");
                personData[i][0]=input.nextDouble();
                if(personData[i][0]>0)
                    break;
                System.out.println("Invalid weight! Enter a positive value.");
            }
			
            //Height input validation
            while(true){
                System.out.print("Enter height (meters): ");
                personData[i][1]=input.nextDouble();
                if(personData[i][1]>0)
                    break;
                System.out.println("Invalid height! Enter a positive value.");
            }
        }

        //Calculate BMI and weight status
        for(int i=0;i<number;i++){

            personData[i][2]=
                    personData[i][0]/(personData[i][1]*personData[i][1]);

            if(personData[i][2]<=18.4){
                weightStatus[i] = "Underweight";
            }
            else if(personData[i][2]<24.9){
                weightStatus[i]="Normal";
            } 
            else if(personData[i][2]<39.9){
                weightStatus[i]="Overweight";
            }
            else{
                weightStatus[i]="Obese";
            }
        }

        //Displays the results
        for(int i=0;i<number;i++){
            System.out.println("Person " + (i + 1));
            System.out.println("Weight : "+personData[i][0]+" kg");
            System.out.println("Height : "+personData[i][1]+" m");
            System.out.println("BMI : "+personData[i][2]);
            System.out.println("Status : "+weightStatus[i]);
            System.out.println();
        }
    }
}

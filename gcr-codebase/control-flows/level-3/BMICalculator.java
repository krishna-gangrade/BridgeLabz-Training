//Create a class BMICalculator to calculate the body mass index
import java.util.*;

public class BMICalculator{
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
		
		double weight=input.nextDouble();
		
		//height in cm
		double heightCm= input.nextDouble();
		
		//height in meter
		double heightMeter= heightCm/100; 
		
		//formula for BMI
		double bmi= weight/ (heightMeter* heightMeter);
		
		//Displays BMI
		System.out.println("BMI = "+bmi);

		//if condition to check status
		if (bmi <= 18.4) {
            System.out.println("Underweight");
        } 
        else if (bmi>= 18.5 && bmi< 24.9) {
            System.out.println("Normal");
        } 
        else if (bmi>= 25.0 && bmi< 39.9) {
            System.out.println("Overweight");
        }
		else{
			System.out.println("Obese");
		}
	}
}
//Create a class CalculatorUsingSwitch 
import java.util.*;

public class CalculatorUsingSwitch{
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
		
		double first = input.nextDouble();
		double second = input.nextDouble();
		String op = input.next();


		//Switch is used to check operator and use case accordingly
		switch (op) {
			
			//For Addition
            case "+":{
                System.out.println("Result = "+(first+ second));
                break;
			}
			
			//For Subtraction
            case "-":{
                System.out.println("Result = "+(first- second));
                break;
			}
			
			//For Multiplication
            case "*":{
                System.out.println("Result = "+(first* second));
                break;
			}
			
			//For Division
            case "/":{
                if(second!=0){
                    System.out.println("Result = "+(first/ second));
                }
				else{
                    System.out.println("Division by zero is not allowed");
                }
                break;
			}
            default:{
                System.out.println("Invalid Operator");
			}
        }
    }
}
Write a program to create a calculator using switch...case.
Hint => 
Create two double variables named first and second and a String variable named op.
Get input values for all variables.
The input for the operator can only be one of the four values: "+", "-", "*" or "/".
Run a for loop from i = 1 to i < number.
Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
If op is neither of those 4 values, print Invalid Operator.


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
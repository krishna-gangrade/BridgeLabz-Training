import java.util.*;

public class BasicCalculator{
public static void main(String args[]){
    Scanner kb= new Scanner(System.in);
	
	//Taking 2 numbers as input
	double number1= kb.nextDouble(); 
	double number2= kb.nextDouble();
	
	//Operations
	double addition = number1 + number2;
	double subtraction = number1 - number2;
	double multiplication = number1 * number2;
	double division = number1 / number2;
	
	System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+number1+" and "+number2 +" is "+addition+", "+subtraction+", "+multiplication+", and "+division);
}
}
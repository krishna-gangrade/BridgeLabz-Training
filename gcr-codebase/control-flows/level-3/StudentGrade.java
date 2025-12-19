//Create a class StudentGrade and calculate average marks, grades and remark
import java.util.*;

public class StudentGrade{
	public static void main(String args[]){
		
		Scanner input= new Scanner(System.in);
		
		double physics= input.nextDouble();
		double chemistry= input.nextDouble();
		double maths= input.nextDouble();
		
		//Average marks
		double percent= (physics+chemistry+ maths)/3;
		
		String grade;
		String remark;
		
		//Condition for grades and percent 
		if(percent>=80){
			grade="A";
			remark="Level 4, above agency-normalized standards";
		}
		else if(percent>=70 && percent<=79){
			grade="B";
			remark="Level 3, at agency-normalized standards";
		}
		else if(percent>=60 && percent<=69){
			grade="C";
			remark="Level 2, below, but approaching agency-normalized standards";
		}
		else if(percent>=50 && percent<=59){
			grade="D";
			remark="Level 1, well below agency-normalized standards";
		}
		else if(percent>=40 && percent<=49){
			grade="E";
			remark="Level 1, too agency-normalized standards";
		}else{
			grade="R";
			remark="Remedial standards";
		}
		
		//Displays the result
		System.out.println("Average marks :"+percent+"\n Grades :"+grade+"\nRemarks :"+remark);
	}
}
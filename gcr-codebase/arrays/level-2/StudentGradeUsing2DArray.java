//Create a class StudentGradeUsing2DArray to calculate percentage, grade and remark
import java.util.*;

public class StudentGradeUsing2DArray{

    public static void main(String args[]){

        Scanner input=new Scanner(System.in);

        //Take number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents=input.nextInt();

        //2D array to store marks of Physics, Chemistry, Maths
        double[][] marks=new double[numberOfStudents][3];

        //Arrays to store percentage, grade and remark
        double[] percent=new double[numberOfStudents];
        String[] grade=new String[numberOfStudents];
        String[] remark=new String[numberOfStudents];

        //Input loop
        for(int i=0i<numberOfStudents;i++){

            System.out.println("\nEnter marks for Student "+(i+1));

            System.out.print("Physics: ");
            marks[i][0]=input.nextDouble();

            System.out.print("Chemistry: ");
            marks[i][1]=input.nextDouble();

            System.out.print("Maths: ");
            marks[i][2]=input.nextDouble();

            //Validation
            if(marks[i][0]<0 || marks[i][1]<0 || marks[i][2]<0){
                System.out.println("Invalid marks! Enter positive values again.");
                i--;
                continue;
            }
        }

        //Calculate percentage, grade and remark
        for(int i=0;i<numberOfStudents;i++){

            percent[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3;

            if(percent[i]>=80){
                grade[i]="A";
                remark[i]="Level 4, above agency-normalized standards";
            }
            else if(percent[i]>=70){
                grade[i]="B";
                remark[i]="Level 3, at agency-normalized standards";
            }
            else if(percent[i]>=60){
                grade[i]="C";
                remark[i]="Level 2, below, but approaching agency-normalized standards";
            }
            else if(percent[i]>=50){
                grade[i]="D";
                remark[i]="Level 1, well below agency-normalized standards";
            }
            else if(percent[i]>=40){
                grade[i]="E";
                remark[i]="Level 1, too agency-normalized standards";
            }
            else{
                grade[i]="R";
                remark[i]="Remedial standards";
            }
        }

        //Displays the result
        for(int i=0;i<numberOfStudents;i++){
            System.out.println("Student "+(i+1));
            System.out.println("Physics  : "+marks[i][0]);
            System.out.println("Chemistry: "+marks[i][1]);
            System.out.println("Maths    : "+marks[i][2]);
            System.out.println("Average  : "+percent[i]);
            System.out.println("Grade    : "+grade[i]);
            System.out.println("Remark   : "+remark[i]);
            System.out.println();
        }
    }
}

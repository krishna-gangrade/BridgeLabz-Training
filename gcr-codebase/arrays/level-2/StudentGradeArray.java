// Create a class StudentGradeArray to calculate average marks, grades and remark for multiple students
import java.util.*;

public class StudentGradeArray{

    public static void main(String args[]){

        Scanner input=new Scanner(System.in);

        //Take number of students
        System.out.print("Enter number of students: ");
        int n=input.nextInt();

        //Arrays to store marks
        double[] physics=new double[n];
        double[] chemistry=new double[n];
        double[] maths=new double[n];

        //Arrays to store percentage, grade, and remark
        double[] percent=new double[n];
        String[] grade=new String[n];
        String[] remark=new String[n];

        //Input loop
        for(int i=0;i<n;i++){

            System.out.println("\nEnter marks for Student "+(i+1));

            System.out.print("Physics: ");
            physics[i]=input.nextDouble();

            System.out.print("Chemistry: ");
            chemistry[i]=input.nextDouble();

            System.out.print("Maths: ");
            maths[i]=input.nextDouble();

            //Validation
            if(physics[i]<0 || chemistry[i]<0 || maths[i]<0){
                System.out.println("Invalid marks! Please enter positive values again.");
                i--;
                continue;
            }
        }

        //Calculate percentage, grade, and remark
        for(int i=0;i<n;i++){

            percent[i]=(physics[i]+chemistry[i]+maths[i])/3;

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
        for(int i=0;i<n;i++){
            System.out.println("Student "+(i+1));
            System.out.println("Physics  : "+physics[i]);
            System.out.println("Chemistry: "+chemistry[i]);
            System.out.println("Maths    : "+maths[i]);
            System.out.println("Average  : "+percent[i]);
            System.out.println("Grade    : "+grade[i]);
            System.out.println("Remark   : "+remark[i]);
            System.out.println();
        }
    }
}

//Create a class ZaraEmployeeBonusCalculator to calculate the bonus of the employee and the salary after bonus
import java.util.Scanner;

public class ZaraEmployeeBonusCalculator{

    public static void main(String args[]){

        Scanner input= new Scanner(System.in);

        //Arrays for salary and years of service
        double [] salary= new double[10];
        double [] yearsOfService= new double[10];

        //Arrays for bonus and new salary
        double [] bonus= new double[10];
        double [] newSalary= new double[10];

        double totalBonus=0;
        double totalOldSalary=0;
        double totalNewSalary=0;

        //Loop for input
        for(int i=0;i<10;i++){
            System.out.println("Enter details for Employee "+(i+1));

            System.out.println("Enter Salary: ");
            double sal = input.nextDouble();

            System.out.println("Enter Years of Service: ");
            double service = input.nextDouble();

            if(sal<=0 || service<0){
                System.out.println("Invalid input! Please enter again.\n");
                i--;
                continue;
            }

            salary[i]=sal;
            yearsOfService[i]=service;
        }

        //Calculation loop
        for(int i=0;i<10;i++){

            if(yearsOfService[i]>5){
                bonus[i]= salary[i]*0.05;
            }else{
                bonus[i]= salary[i]*0.02;
            }

            newSalary[i]= salary[i]+bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        //Displays the result
        System.out.println("Total Old Salary  : "+totalOldSalary);
        System.out.println("Total Bonus Paid  : "+totalBonus);
        System.out.println("Total New Salary  : "+totalNewSalary);
    }
}

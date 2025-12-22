//Created class to calculate employee bonus

import java.util.*;

public class EmployeeBonusCalculator{

    //salary and years of service
    public static double[][] generateEmployeeData(){
        double[][] data=new double[10][2];

        for(int i=0;i<10;i++){
            data[i][0]=(int)(Math.random()*90000)+10000; //salary
            data[i][1]=(int)(Math.random()*10)+1;       //years
        }
        return data;
    }

    //new salary and bonus
    public static double[][] calculateBonus(double[][] data){
        double[][] result=new double[10][2];

        for(int i=0;i<10;i++){
            double salary=data[i][0];
            double years=data[i][1];
            double bonus;

            if(years>5)
                bonus=salary*0.05;
            else
                bonus=salary*0.02;

            result[i][0]=salary+bonus;
            result[i][1]=bonus;
        }
        return result;
    }

    //display totals
    public static void displayTotals(double[][] oldData,double[][] newData){
        double oldSum=0,newSum=0,bonusSum=0;

        for(int i=0;i<10;i++){
            oldSum+=oldData[i][0];
            newSum+=newData[i][0];
            bonusSum+=newData[i][1];
        }

        System.out.println("OldSalary  NewSalary  Bonus");
        System.out.println(oldSum+"  "+newSum+"  "+bonusSum);
    }

    public static void main(String[] args) {

        double[][] oldData = generateEmployeeData();
        double[][] newData = calculateBonus(oldData);

        displayTotals(oldData,newData);
    }
}

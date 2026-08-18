package Day_13.HackerRank_based_codebase.EmployeeSalarySystem;

public class Main {
    public static void main(String[] args) {

        SalaryCalculator calculator = new SalaryCalculator();

        double salary1 = calculator.calculateSalary(30000);
        double salary2 = calculator.calculateSalary(30000, 5000);
        double salary3 = calculator.calculateSalary(30000, 5000, 2000);

        System.out.println("Salary with basic only: " +salary1);
        System.out.println("Salary with basic + bonus: " +salary2);
        System.out.println("Salary with basic + bonus - deduction: " +salary3);
    }

}

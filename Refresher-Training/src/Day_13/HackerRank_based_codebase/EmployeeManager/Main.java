package Day_13.HackerRank_based_codebase.EmployeeManager;

public class Main {
    public static void main(String[] args) {

        Employee employee =new Employee("Rahul", 40000);

        System.out.println("Employee Details:");
        employee.getDetails();

        System.out.println();

        Manager manager =new Manager("Aman", 70000, 8);

        System.out.println("Manager Details:");
        manager.getDetails();
    }
}

package Day_13.HackerRank_based_codebase.EmployeeManager;

public class Employee {
    String name;
    double salary;

    Employee(String name, double salary){
        this.name =name;
        this.salary =salary;
    }

    void getDetails(){
        System.out.println("Name: " +name);
        System.out.println("Salary: " +salary);
    }
}

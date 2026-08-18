package Day_13.HackerRank_based_codebase.EmployeeManager;

public class Manager extends Employee{
    int teamSize;

    Manager(String name, double salary, int teamSize){
        super(name, salary);
        this.teamSize =teamSize;
    }

    @Override
    void getDetails(){
        super.getDetails();
        System.out.println("Team Size: " +teamSize);
    }
}

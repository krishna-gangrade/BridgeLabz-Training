package Day_12.HackerRank_based_codebase.EmployeeIdGenerator;

class Employee {

    private static int nextId= 1001;
    private final int employeeId;

    private String name;

    public Employee(String name){
        this.name= name;
        this.employeeId= nextId;
        nextId++;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        Employee e1= new Employee("Krishna");
        Employee e2= new Employee("Pratham");

        Employee e3= new Employee("Deepanshu");
        Employee e4= new Employee("Shivam");

        System.out.println(e1.getName()+ " => "+ e1.getEmployeeId());
        System.out.println(e2.getName()+ " => "+ e2.getEmployeeId());
        System.out.println(e3.getName()+ " => "+ e3.getEmployeeId());
        System.out.println(e4.getName()+ " => "+ e4.getEmployeeId());

    }
}

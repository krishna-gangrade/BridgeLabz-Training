package Day_12.HackerRank_based_codebase.CopyConstructor;

public class Student {

    String name;
    Address address;

    public Student(String name, Address address){
        this.name= name;
        this.address= address;
    }

    public Student (Student other){
        this.name= other.name;
        this.address= new Address(other.address);
    }
    
}

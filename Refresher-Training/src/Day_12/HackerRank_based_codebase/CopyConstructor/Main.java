package Day_12.HackerRank_based_codebase.CopyConstructor;

public class Main {

    public static void main(String[] args) {
        Student originalStudent= new Student("Krishna", new Address("MG Road","Khandwa", 450001));
        Student copiedStudent = new Student(originalStudent);

        System.out.println("Original city before change : "+originalStudent.address.city);
        System.out.println("Copied city before change : "+copiedStudent.address.city);

        copiedStudent.address.city= "Indore";

        System.out.println("Copied city after change : "+copiedStudent.address.city);
        System.out.println("Original city after change : "+originalStudent.address.city);
    }
}

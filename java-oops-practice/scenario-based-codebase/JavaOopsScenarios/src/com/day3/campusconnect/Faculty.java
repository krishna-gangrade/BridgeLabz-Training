package com.day3.campusconnect;

class Faculty extends Person {

    private String department;

    public Faculty(int id, String name, String email, String department) {
        super(id, name, email);
        this.department = department;
    }

    // Faculty assigns grades
    public void assignGrades(Student student, int[] grades) {
        student.setGrades(grades);
    }

    @Override
    public void printDetails() {
        System.out.println("\nFaculty ID : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Email      : " + email);
        System.out.println("Department : " + department);
    }
}
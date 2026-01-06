package com.day3.campusconnect;

class Course {

    private String courseName;
    private Faculty faculty;
    private Student[] students = new Student[10];
    private int studentCount = 0;

    public Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
    }

    public String getCourseName() {
        return courseName;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void addStudent(Student student) {
        students[studentCount++] = student;
    }

    public void removeStudent(Student student) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i] == student) {
                for (int j = i; j < studentCount - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[--studentCount] = null;
                break;
            }
        }
    }

    public void showCourse() {
        System.out.println(courseName + " (Faculty: " + faculty.name + ")");
    }
}
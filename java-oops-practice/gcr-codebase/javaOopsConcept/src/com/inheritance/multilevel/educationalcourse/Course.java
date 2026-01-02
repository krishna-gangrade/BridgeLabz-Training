package com.inheritance.multilevel.educationalcourse;

class Course {

    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayDetails() {
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " weeks");
    }
}
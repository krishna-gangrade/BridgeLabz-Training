package com.day1.universitycourseenrollmentsystem;

class Course {

    private String courseCode;
    private String courseName;

    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public String getCourseInfo() {
        return courseCode + " - " + courseName;
    }
}
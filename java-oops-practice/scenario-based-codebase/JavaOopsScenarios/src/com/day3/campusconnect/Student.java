
package com.day3.campusconnect;

class Student extends Person implements ICourseActions {

    private int[] grades; // private, assigned by faculty
    private Course[] enrolledCourses;
    private int courseCount = 0;

    public Student(int id, String name, String email, int maxCourses) {
        super(id, name, email);
        this.enrolledCourses = new Course[maxCourses];
    }

    // Only faculty should call this
    void setGrades(int[] grades) {
        this.grades = grades;
    }

    public double calculateGPA() {
        if (grades == null) return 0.0;

        int sum = 0;
        for (int g : grades) sum += g;
        return (double) sum / grades.length;
    }

    @Override
    public void enrollCourse(Course course) {
        enrolledCourses[courseCount++] = course;
        course.addStudent(this);
    }

    @Override
    public void dropCourse(Course course) {
        for (int i = 0; i < courseCount; i++) {
            if (enrolledCourses[i] == course) {
                for (int j = i; j < courseCount - 1; j++) {
                    enrolledCourses[j] = enrolledCourses[j + 1];
                }
                enrolledCourses[--courseCount] = null;
                course.removeStudent(this);
                break;
            }
        }
    }

    @Override
    public void printDetails() {
        System.out.println("\nStudent ID : " + id);
        System.out.println("Name       : " + name);
        System.out.println("Email      : " + email);
        System.out.println("GPA        : " + calculateGPA());
        System.out.println("Courses:");
        for (int i = 0; i < courseCount; i++) {
            System.out.println(" - " + enrolledCourses[i].getCourseName());
        }
    }
}

package com.constructors.level1;

public class Course {
	
	// Instance variables
    String courseName;
    int duration;      // duration in months
    double fee;

    // Class variable (shared among all objects)
    static String instituteName = "Tech Learning Hub";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    public void displayCourseDetails() {
        System.out.println("Institute Name : " + instituteName);
        System.out.println("Course Name    : " + courseName);
        System.out.println("Duration       : " + duration + " months");
        System.out.println("Fee            : ₹" + fee);
    }
    
    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Course c1 = new Course("Java Full Stack", 6, 45000);
        Course c2 = new Course("Data Science", 8, 60000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name for all courses
        Course.updateInstituteName("Global Tech Academy");

        c1.displayCourseDetails();
        c2.displayCourseDetails();

	}

}

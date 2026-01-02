package com.inheritance.multilevel.educationalcourse;

class PaidOnlineCourse extends OnlineCourse {

    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform,
                     boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Course Fee  : ₹" + fee);
        System.out.println("Discount    : " + discount + "%");
    }
}
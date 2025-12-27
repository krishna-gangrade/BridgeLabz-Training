package com.constructors.level1;

//Superclass
public class Student {

 // Access modifiers
 public int rollNumber;      // public
 protected String name;      // protected
 private double cgpa;        // private

 // Constructor
 public Student(int rollNumber, String name, double cgpa) {
     this.rollNumber = rollNumber;
     this.name = name;
     this.cgpa = cgpa;
 }

 // Public method to access CGPA
 public double getCGPA() {
     return cgpa;
 }

 // Public method to modify CGPA
 public void setCGPA(double cgpa) {
     this.cgpa = cgpa;
 }
}
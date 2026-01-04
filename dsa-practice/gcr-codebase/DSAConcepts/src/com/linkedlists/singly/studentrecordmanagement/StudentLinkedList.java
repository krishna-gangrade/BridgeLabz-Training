package com.linkedlists.singly.studentrecordmanagement;

class StudentLinkedList {

    private StudentNode head;

    // Add at beginning
    public void addAtBeginning(int roll, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    // Add at end
    public void addAtEnd(int roll, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Add at specific position (1-based index)
    public void addAtPosition(int position, int roll, String name, int age, char grade) {
        if (position <= 1) {
            addAtBeginning(roll, name, age, grade);
            return;
        }

        StudentNode newNode = new StudentNode(roll, name, age, grade);
        StudentNode temp = head;

        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid position!");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete by roll number
    public void deleteByRollNumber(int roll) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.rollNumber == roll) {
            head = head.next;
            System.out.println("Student deleted successfully.");
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != roll) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student not found!");
        } else {
            temp.next = temp.next.next;
            System.out.println("Student deleted successfully.");
        }
    }

    // Search by roll number
    public void searchStudent(int roll) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNumber == roll) {
                System.out.println("Student Found:");
                displayStudent(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found!");
    }

    // Update grade
    public void updateGrade(int roll, char newGrade) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.rollNumber == roll) {
                temp.grade = newGrade;
                System.out.println("Grade updated successfully.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student not found!");
    }

    // Display all students
    public void displayAll() {
        if (head == null) {
            System.out.println("No student records available.");
            return;
        }

        StudentNode temp = head;
        System.out.println("\n--- Student Records ---");
        while (temp != null) {
            displayStudent(temp);
            temp = temp.next;
        }
    }

 // Method to display one student
    private void displayStudent(StudentNode node) {
        System.out.println("Roll No : " + node.rollNumber);
        System.out.println("Name    : " + node.name);
        System.out.println("Age     : " + node.age);
        System.out.println("Grade   : " + node.grade);
        System.out.println("----------------------");
    }
}
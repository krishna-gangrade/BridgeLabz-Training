/*  3. EduResults – Rank Sheet Generator (Merge Sort)
Story: An educational board compiles marks of thousands of students from different districts.
Each district submits a sorted list of students by score. The main server needs to merge and
sort all these lists into a final state-wise rank list. Merge Sort ensures efficiency and maintains
stability for duplicate scores.
Concepts Involved:
● Merge Sort
● Merging sorted sublists
● Large datasets with stable sorting   */



package com.day7.eduresults;

import java.util.ArrayList;
import java.util.List;

public class EduResultsApp {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Prashant", 95, "Garhwa"));
        students.add(new Student(2, "Ankit", 88, "Garhwa"));
        students.add(new Student(3, "Ansh", 75, "Garhwa"));

        students.add(new Student(4, "Priyansh", 96, "Bokaro"));
        students.add(new Student(5, "Sunil", 88, "Bokaro"));
        students.add(new Student(6, "Satish", 70, "Bokaro"));

        students.add(new Student(7, "Rahul", 92, "Ranchi"));
        students.add(new Student(8, "Ankush", 74, "Ranchi"));

        RankService service = new RankService();
        List<Student> rankList = service.generateRankList(students);

        System.out.println("STATE-WISE RANK LIST");
        System.out.println("--------------------");

        int rank = 1;
        System.out.printf(
        	    "%-6s | %-6s | %-15s | %-6s | %-10s%n",
        	    "Rank", "Roll", "Name", "Marks", "District"
        	);
        	System.out.println("-------------------------------------------------------");

        for (Student s : rankList) {
            System.out.println("Rank " + rank++ + " : " + s);
        }
    }
}
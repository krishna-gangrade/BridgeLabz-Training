package com.collectors.student;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentResultGrouping {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Prashant", "A"),
                new Student("Ananya", "B"),
                new Student("Vikram", "A"),
                new Student("Neha", "C"),
                new Student("Rahul", "B"),
                new Student("Arjun", "A")
        );

        Map<String, List<String>> studentsByGrade = students.stream()
                .collect(Collectors.groupingBy(
                        Student::getGradeLevel,
                        Collectors.mapping(Student::getName, Collectors.toList())
                ));

        System.out.println("Students Grouped by Grade Level");
        System.out.println("--------------------------------");

        studentsByGrade.forEach((grade, names) ->
                System.out.println("Grade " + grade + " : " + names)
        );
    }
}

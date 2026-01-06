package com.day4.edumentor;

import java.util.*;

public class EduMentorMain {
	public static void main(String[] args) {

		Learner learner = new Learner(1, "Prashant Kumar Sharma", "prashant@titbhopal.edu.in", "short");
		Instructor instructor = new Instructor(101, "Satish Dungdung", "satish@titbhopal.edu.in", "Java Programming");

		List<String> questions = Arrays.asList("Does Java support OOP?", "Interface supports multiple inheritance?");
		List<String> answers = Arrays.asList("yes", "yes");

		Quiz quiz = new Quiz(questions, answers);

		List<String> userAnswers = Arrays.asList("yes", "yes");
		quiz.evaluate(userAnswers);

		learner.printDetails();
		System.out.println("Quiz Percentage: " + quiz.calculatePercentage());
		learner.generateCertificate();

		System.out.println();
		instructor.printDetails();
	}
}
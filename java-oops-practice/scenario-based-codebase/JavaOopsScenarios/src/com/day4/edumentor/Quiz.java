package com.day4.edumentor;

import java.util.*;

public class Quiz {

	private List<String> questions; // internal question bank
	private final List<String> answers; // cannot be modified
	private int score;

// Constructor for variable difficulty
	Quiz(List<String> questions, List<String> answers) {
		this.questions = new ArrayList<>(questions);
		this.answers = Collections.unmodifiableList(new ArrayList<>(answers));
	}

// Scoring logic using operators
	void evaluate(List<String> userAnswers) {
		score = 0;
		for (int i = 0; i < answers.size(); i++) {
			if (answers.get(i).equalsIgnoreCase(userAnswers.get(i))) {
				score++;
			}
		}
	}

	double calculatePercentage() {
		return (score * 100.0) / questions.size();
	}
}
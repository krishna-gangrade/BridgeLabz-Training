package com.day4.fittrack;

public class CardioWorkout extends Workout{
	CardioWorkout(int duration) {
		super("Cardio", duration);
	}
	
	@Override
	double calculateCalories(double weight) {
		double calories = duration * weight * 0.08;
		setCaloriesBurned(calories);
		return calories;
	}
}
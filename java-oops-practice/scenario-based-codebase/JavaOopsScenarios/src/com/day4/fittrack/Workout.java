package com.day4.fittrack;

import java.util.*;

public abstract class Workout implements ITrackable{
	protected String type;
	protected int duration;
	protected double caloriesBurned;
	
	protected List<String> logs = new ArrayList<>();
	
	Workout(String type, int duration) {
		this.type = type;
		this.duration = duration;
	}
	
	abstract double calculateCalories(double weight);
	
	@Override
	public void startWorkout() {
		logs.add(type + " workout started");
	}
	
	@Override
	public void stopWorkout() {
		logs.add(type + " workout stopped");
	}
	
	protected void setCaloriesBurned(double calories) {
		this.caloriesBurned = calories;
	}
	
	public double getCaloriesBurned() {
		return caloriesBurned;
	}
}
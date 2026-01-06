package com.day4.petpal;

import java.util.Random;

public abstract class Pet implements IInteractable{
	protected String name;
	protected String type;
	protected int age;
	
	private int hunger;
	private int energy;
	private int mood;

	Pet(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
		
		Random random = new Random();
		this.hunger = random.nextInt(50) + 30;
		this.energy = random.nextInt(50) + 30;
		this.mood = random.nextInt(50) + 30;
	}
	
	protected void increaseEnergy(int value) {
		energy = Math.min(energy + value, 100);
	}
	
	protected void decreaseEnergy(int value) {
		energy = Math.max(energy - value, 0);
	}
	
	protected void increaseHunger(int value) {
		hunger = Math.min(hunger + value, 100);
	}
	
	protected void decreaseHunger(int value) {
		hunger = Math.max(hunger - value, 0);
	}
	
	protected void increaseMood(int value) {
		mood = Math.min(mood + value, 100);
	}
	
	protected void decreaseMood(int value) {
		mood = Math.max(mood + value, 0);
	}
	
	
	public void showStatus() {
		System.out.println(name + " [" + type + "]");
		System.out.println("Hunger: " + hunger);
		System.out.println("Energy: " + energy);
		System.out.println("Mood: " + mood);
		System.out.println();
	}
	
	public abstract void makeSound();
	
}
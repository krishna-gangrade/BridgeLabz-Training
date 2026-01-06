package com.day4.petpal;

public class Bird extends Pet {
	
	public Bird(String name, int age) {
		super(name, "Dog", age);
	}
	
	@Override
	public void feed() {
		decreaseHunger(10);
		increaseMood(10);
		System.out.println(name + " pecked some seeds");
	}
	
	@Override
	public void play() {
		decreaseEnergy(5);
		increaseMood(20);
		System.out.println(name + " flew around");
	}
	
	@Override
	public void sleep() {
		increaseEnergy(20);
		System.out.println(name + " slept on perch");
	}
	
	@Override
	public void makeSound() {
		System.out.println(name + " says: Chirp Chirp!");
	}
}
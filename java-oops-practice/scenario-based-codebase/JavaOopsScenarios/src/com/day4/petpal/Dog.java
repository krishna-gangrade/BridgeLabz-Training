package com.day4.petpal;

public class Dog extends Pet {
	
	public Dog(String name, int age) {
		super(name, "Dog", age);
	}
	
	@Override
	public void feed() {
		decreaseHunger(20);
		increaseMood(10);
		System.out.println(name + " enjoyed the food");
	}
	
	@Override
	public void play() {
		decreaseEnergy(15);
		increaseMood(20);
		increaseHunger(10);
		System.out.println(name + " is playing");
	}
	
	@Override
	public void sleep() {
		increaseEnergy(25);
		System.out.println(name + " is sleeping");
	}
	
	@Override
	public void makeSound() {
		System.out.println(name + " says: Woof Woof!");
	}
}
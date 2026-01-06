package com.day4.petpal;

public class Cat extends Pet {
	
	public Cat(String name, int age) {
		super(name, "Cat", age);
	}
	
	@Override
	public void feed() {
		decreaseHunger(15);
		increaseMood(5);
		System.out.println(name + " ate fish");
	}
	
	@Override
	public void play() {
		decreaseEnergy(10);
		increaseMood(15);
		System.out.println(name + " chased a mice");
	}
	
	@Override
	public void sleep() {
		increaseEnergy(30);
		System.out.println(name + " is sleeping");
	}
	
	@Override
	public void makeSound() {
		System.out.println(name + " says: Meow!");
	}
}
package com.day4.petpal;

public class PetPalMain {
	public static void main (String[] args) {
		
		Pet pet1 = new Dog("Thor", 3);
		Pet pet2  =new Cat("Leo", 2);
		Pet pet3 = new Bird("Coco", 1);
		
		Pet[] pets  = {pet1, pet2, pet3};
		
		for(Pet pet : pets) {
			pet.makeSound();
			pet.feed();
			pet.play();
			pet.sleep();
			pet.showStatus();
		}
	}
}
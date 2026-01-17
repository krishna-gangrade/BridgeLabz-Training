package com.day9.birdsanctuary;

class Penguin extends Bird implements Swimmable {

	public Penguin(String id, String name) {
        super(id, name, "Penguin");
	}
	
    @Override
	public void swim() {
	        System.out.println(getName() + " is swimming fast.");
	}
}

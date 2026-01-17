package com.day9.birdsanctuary;

class Seagull extends Bird implements Flyable, Swimmable {

    public Seagull(String id, String name) {
        super(id, name, "Seagull");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying near the sea.");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming in water.");
    }
}

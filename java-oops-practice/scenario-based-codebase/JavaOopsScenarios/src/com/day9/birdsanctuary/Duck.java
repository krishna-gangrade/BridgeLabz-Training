package com.day9.birdsanctuary;

class Duck extends Bird implements Swimmable {

    public Duck(String id, String name) {
        super(id, name, "Duck");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming.");
    }
}

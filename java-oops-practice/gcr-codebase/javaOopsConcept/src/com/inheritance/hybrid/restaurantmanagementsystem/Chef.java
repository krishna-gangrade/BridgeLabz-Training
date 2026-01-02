package com.inheritance.hybrid.restaurantmanagementsystem;

class Chef extends Person implements Worker {

    Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Duties : Preparing meals and managing kitchen operations");
    }
}
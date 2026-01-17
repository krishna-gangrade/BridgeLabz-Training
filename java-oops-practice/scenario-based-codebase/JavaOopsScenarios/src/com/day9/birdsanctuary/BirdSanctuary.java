package com.day9.birdsanctuary;

import java.util.*;

class BirdSanctuary {

    private List<Bird> birds = new ArrayList<>();

    public void addBird(Bird bird) {
        birds.add(bird);
        System.out.println("Bird added successfully.");
    }

    public void displayAllBirds() {
        if (birds.isEmpty()) {
            System.out.println("No birds in sanctuary.");
            return;
        }

        for (Bird bird : birds) {
            bird.displayInfo();

            if (bird instanceof Flyable) {
                System.out.println("  Ability: Fly");
            }
            if (bird instanceof Swimmable) {
                System.out.println("  Ability: Swim");
            }
            if (!(bird instanceof Flyable) && !(bird instanceof Swimmable)) {
                System.out.println("  Ability: None");
            }
        }
    }

    public void displayFlyingBirds() {
        for (Bird bird : birds) {
            if (bird instanceof Flyable) {
                bird.displayInfo();
                ((Flyable) bird).fly();
            }
        }
    }

    public void displaySwimmingBirds() {
        for (Bird bird : birds) {
            if (bird instanceof Swimmable) {
                bird.displayInfo();
                ((Swimmable) bird).swim();
            }
        }
    }

    public void displayBothFlyingAndSwimming() {
        for (Bird bird : birds) {
            if (bird instanceof Flyable && bird instanceof Swimmable) {
                bird.displayInfo();
            }
        }
    }

    public void removeBirdById(String id) {
        Iterator<Bird> iterator = birds.iterator();

        while (iterator.hasNext()) {
            Bird bird = iterator.next();
            if (bird.getId().equals(id)) {
                iterator.remove();
                System.out.println("Bird removed successfully.");
                return;
            }
        }
        System.out.println("Bird not found.");
    }

    public void sanctuaryReport() {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for (Bird bird : birds) {
            boolean canFly = bird instanceof Flyable;
            boolean canSwim = bird instanceof Swimmable;

            if (canFly && canSwim) both++;
            else if (canFly) fly++;
            else if (canSwim) swim++;
            else neither++;
        }

        System.out.println("---- Sanctuary Report ----");
        System.out.println("Flyable Only: " + fly);
        System.out.println("Swimmable Only: " + swim);
        System.out.println("Both Fly & Swim: " + both);
        System.out.println("Neither: " + neither);
    }
}

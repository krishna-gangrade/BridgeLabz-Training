/*   5. FitnessTracker – Daily Step Count Ranking (Bubble Sort)
Story: A fitness app tracks steps taken by each user in a small group (less than 20 people). At
the end of the day, it displays rankings. Since the list is small and frequently shuffled due to
last-minute step syncing, a simple Bubble Sort runs quickly to generate the leaderboard.
Concepts Involved:
● Bubble Sort
● Frequent updates
● Real-time re-sorting   */



package com.day7.fitnesstracker;

public class FitnessTrackerApp {

    public static void main(String[] args) {

        UserActivity[] users = {
            new UserActivity(1, "Amit", 8500),
            new UserActivity(2, "Neha", 12000),
            new UserActivity(3, "Rahul", 9800),
            new UserActivity(4, "Sneha", 15000),
            new UserActivity(5, "Arjun", 11000)
        };

        System.out.println("Daily Steps (Before Ranking)");
        display(users);

        StepBubbleSort.sortBySteps(users);

        System.out.println("\nDaily Step Count Leaderboard ");
        display(users);
    }

    private static void display(UserActivity[] users) {
        int rank = 1;
        for (UserActivity user : users) {
            System.out.println("Rank " + rank + " -> " + user);
            rank++;
        }
    }
}
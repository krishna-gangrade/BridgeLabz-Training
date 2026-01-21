package com.day7.fitnesstracker;

public class StepBubbleSort {

    public static void sortBySteps(UserActivity[] users) {

        int n = users.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (users[j].getDailySteps() < users[j + 1].getDailySteps()) {
                    swap(users, j, j + 1);
                    swapped = true;
                }
            }

            // Optimization: stop if already sorted
            if (!swapped) {
                break;
            }
        }
    }

    private static void swap(UserActivity[] users, int i, int j) {
        UserActivity temp = users[i];
        users[i] = users[j];
        users[j] = temp;
    }
}
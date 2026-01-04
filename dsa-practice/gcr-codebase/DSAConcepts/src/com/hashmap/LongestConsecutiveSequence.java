package com.hashmap;

// Longest Consecutive Sequence in an Array
import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSequence {

    // Method to find the length of the longest consecutive sequence
    public static int findLongestConsecutiveSequence(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Add all elements to the set
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;

        // Traverse the array
        for (int num : nums) {

            // Check if this number is the start of a sequence
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Find result
        int result = findLongestConsecutiveSequence(nums);

        // Output
        System.out.println("\n--- Result ---");
        System.out.println("Length of the longest consecutive sequence: " + result);

        sc.close();
    }
}
package com.hashmap;

// Check for a Pair with Given Sum in an Array
import java.util.HashSet;
import java.util.Scanner;

public class PairWithGivenSum {

    // Method to check if a pair with the given sum exists
    public static boolean hasPairWithSum(int[] arr, int targetSum) {

        HashSet<Integer> seen = new HashSet<>();

        for (int num : arr) {

            // Check if complement exists
            if (seen.contains(targetSum - num)) {
                return true;
            }

            // Store current number
            seen.add(num);
        }

        return false;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input target sum
        System.out.print("Enter target sum to check: ");
        int targetSum = sc.nextInt();

        // Check result
        boolean result = hasPairWithSum(arr, targetSum);

        // Output
        System.out.println("\n--- Result ---");
        if (result) {
            System.out.println("A pair with sum " + targetSum + " EXISTS in the array.");
        } else {
            System.out.println("No pair with sum " + targetSum + " exists in the array.");
        }

        sc.close();
    }
}
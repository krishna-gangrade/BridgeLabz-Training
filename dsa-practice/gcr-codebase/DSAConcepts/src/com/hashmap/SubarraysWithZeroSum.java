
package com.hashmap;

// Find All Subarrays with Zero Sum in Java
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SubarraysWithZeroSum {

    // Method to find all subarrays with zero sum
    public static List<int[]> findZeroSumSubarrays(int[] arr) {

        List<int[]> result = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        int cumulativeSum = 0;

        // Base case: sum 0 at index -1
        map.put(0, new ArrayList<>());
        map.get(0).add(-1);

        for (int i = 0; i < arr.length; i++) {

            cumulativeSum += arr[i];

            if (map.containsKey(cumulativeSum)) {
                for (int startIndex : map.get(cumulativeSum)) {
                    result.add(new int[]{startIndex + 1, i});
                }
            }

            map.putIfAbsent(cumulativeSum, new ArrayList<>());
            map.get(cumulativeSum).add(i);
        }

        return result;
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

        // Find subarrays
        List<int[]> subarrays = findZeroSumSubarrays(arr);

        // Output
        System.out.println("\n--- Subarrays with Zero Sum ---");
        if (subarrays.isEmpty()) {
            System.out.println("No subarrays with zero sum found.");
        } else {
            for (int[] subarray : subarrays) {
                System.out.println("Start Index: " + subarray[0] +
                                   ", End Index: " + subarray[1]);
            }
        }

        sc.close();
    }
}

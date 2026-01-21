
/*  7. FoodFest – Sorting Stalls by Customer Footfall (Merge Sort)
Story: At a multi-day food festival, organizers track footfall at every stall each day. They collect
daily logs from all zones (already sorted by count), and use Merge Sort to combine zone-wise
data into a master list for performance evaluation.
Concepts Involved:
● Merge Sort
● Combining multiple sorted datasets
● Stability in data with equal values   */


package com.day8.foodfest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FoodFestApp {

    public static void main(String[] args) {

        Map<String, List<FoodStall>> zoneMap = new HashMap<>();

        zoneMap.put("Zone A", new ArrayList<>());
        zoneMap.put("Zone B", new ArrayList<>());
        zoneMap.put("Zone C", new ArrayList<>());

        // Zone A stalls
        zoneMap.get("Zone A").add(new FoodStall("Spice Hub", "Indian", "Zone A", 120));
        zoneMap.get("Zone A").add(new FoodStall("Burger Town", "American", "Zone A", 200));

        // Zone B stalls
        zoneMap.get("Zone B").add(new FoodStall("Sushi Zen", "Japanese", "Zone B", 150));
        zoneMap.get("Zone B").add(new FoodStall("Taco Fiesta", "Mexican", "Zone B", 200));

        // Zone C stalls
        zoneMap.get("Zone C").add(new FoodStall("Pasta Point", "Italian", "Zone C", 180));

        // Combine all zones into master list
        List<FoodStall> masterList = new ArrayList<>();
        for (List<FoodStall> stalls : zoneMap.values()) {
            masterList.addAll(stalls);
        }

        // Merge Sort master list by footfall
        masterList = FoodFestSorter.mergeSort(masterList);

        // Display zone-wise
        System.out.println("========= FoodFest – Zone-wise Stall Listings =========");

        for (String zone : zoneMap.keySet()) {
            System.out.println("\n|--> " + zone + "\n");
            System.out.printf(
                "%-20s %-15s %-10s %-8s%n",
                "Stall Name", "Cuisine", "Zone", "Footfall"
            );
            System.out.println("----------------------------------------------------");

            for (FoodStall stall : zoneMap.get(zone)) {
                System.out.println(stall);
            }
        }

        // Display master analytics view
        System.out.println("\n========= FoodFest – Master Footfall Report =========");
        System.out.printf(
            "%-20s %-15s %-10s %-8s%n",
            "Stall Name", "Cuisine", "Zone", "Footfall"
        );
        System.out.println("----------------------------------------------------");

        for (FoodStall stall : masterList) {
            System.out.println(stall);
        }
    }
}

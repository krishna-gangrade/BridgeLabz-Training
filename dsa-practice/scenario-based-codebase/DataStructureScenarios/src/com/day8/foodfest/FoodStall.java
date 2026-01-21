package com.day8.foodfest;

public class FoodStall {

    private String stallName;
    private String cuisine;
    private String zone;
    private int footfall;

    public FoodStall(String stallName, String cuisine, String zone, int footfall) {
        this.stallName = stallName;
        this.cuisine = cuisine;
        this.zone = zone;
        this.footfall = footfall;
    }

    public int getFootfall() {
        return footfall;
    }

    @Override
    public String toString() {
        return String.format(
            "%-20s %-15s %-10s %-8d",
            stallName,
            cuisine,
            zone,
            footfall
        );
    }

}
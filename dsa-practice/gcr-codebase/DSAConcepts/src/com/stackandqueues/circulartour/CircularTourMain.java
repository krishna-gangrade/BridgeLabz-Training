package com.stackandqueues.circulartour;

class CircularTourMain {

	public static void main(String[] args) {

        int[] petrol   = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int start = CircularTour.findStartingPump(petrol, distance);

        if (start == -1)
            System.out.println("No possible circular tour");
        else
            System.out.println("Start from petrol pump index: " + start);
    }
}
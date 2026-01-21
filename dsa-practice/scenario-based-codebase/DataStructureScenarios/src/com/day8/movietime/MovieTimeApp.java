
/*  6. MovieTime – Theater Show Listings (Insertion Sort)
Story: A movie theater allows users to sort upcoming showtimes. Since shows are added
throughout the day and the existing list is almost sorted, the app uses Insertion Sort to insert
each new show in the correct time slot.
Concepts Involved:
● Insertion Sort
● Real-time insertion
● Time-based ordering  */

package com.day8.movietime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MovieTimeApp {

    public static void main(String[] args) {

        Map<String, ArrayList<MovieShow>> screenMap = new HashMap<>();

        screenMap.put("Screen 1", new ArrayList<>());
        screenMap.put("Screen 2", new ArrayList<>());
        screenMap.put("IMAX", new ArrayList<>());

        // Screen 1 shows
        screenMap.get("Screen 1").add(
            new MovieShow("Inception", "Christopher Nolan",
                "Sci-Fi", 8.8, 148, "10:30"));

        screenMap.get("Screen 1").add(
            new MovieShow("Interstellar", "Christopher Nolan",
                "Sci-Fi/Drama", 8.7, 169, "16:00"));

        // Screen 2 shows
        screenMap.get("Screen 2").add(
            new MovieShow("3 Idiots", "Rajkumar Hirani",
                "Comedy/Drama", 8.4, 170, "13:45"));

        screenMap.get("Screen 2").add(
            new MovieShow("Dangal", "Nitesh Tiwari",
                "Sports/Drama", 8.3, 161, "18:00"));

        // IMAX shows
        screenMap.get("IMAX").add(
            new MovieShow("Baahubali", "S. S. Rajamouli",
                "Action/Fantasy", 8.0, 159, "21:15"));

        // Sort each screen’s shows
        for (ArrayList<MovieShow> shows : screenMap.values()) {
            MovieTimeSorter.insertionSortByTime(shows);
        }

        // Display screen-wise listings
        System.out.println("========= MovieTime – Screen-wise Show Listings =========");

        for (String screen : screenMap.keySet()) {

            System.out.println("\n|>> " + screen);
            System.out.printf(
                "%-6s %-22s %-15s %-22s %-6s %-8s%n",
                "Time", "Movie Name", "Genre", "Director", "Rating", "Duration"
            );
            System.out.println("-------------------------------------------------------------------------------------");

            for (MovieShow show : screenMap.get(screen)) {
                System.out.println(show);
            }
        }
    }
}

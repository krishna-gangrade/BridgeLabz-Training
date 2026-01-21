
package com.day8.movietime;

import java.util.ArrayList;

public class MovieTimeSorter {

    public static void insertionSortByTime(ArrayList<MovieShow> shows) {

        for (int i = 1; i < shows.size(); i++) {
            MovieShow key = shows.get(i);
            int j = i - 1;

            while (j >= 0 &&
                   shows.get(j).getShowTime()
                       .compareTo(key.getShowTime()) > 0) {

                shows.set(j + 1, shows.get(j));
                j--;
            }
            shows.set(j + 1, key);
        }
    }
}

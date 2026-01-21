
package com.day8.movietime;

public class MovieShow {

    private String movieName;
    private String director;
    private String genre;
    private double rating;
    private int duration;      // minutes
    private String showTime;   // HH:mm

    public MovieShow(String movieName, String director, String genre,
                     double rating, int duration, String showTime) {
        this.movieName = movieName;
        this.director = director;
        this.genre = genre;
        this.rating = rating;
        this.duration = duration;
        this.showTime = showTime;
    }

    public String getShowTime() {
        return showTime;
    }

    @Override
    public String toString() {
        return String.format(
            "%-6s %-22s %-15s %-22s %-6.1f %-8d",
            showTime,
            movieName,
            genre,
            director,
            rating,
            duration
        );
    }
}

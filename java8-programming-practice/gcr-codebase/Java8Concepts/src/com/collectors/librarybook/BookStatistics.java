package com.collectors.librarybook;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookStatistics {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Clean Code", "Programming", 464),
                new Book("Effective Java", "Programming", 416),
                new Book("The Hobbit", "Fiction", 310),
                new Book("Harry Potter", "Fiction", 550),
                new Book("Atomic Habits", "Self-Help", 320),
                new Book("Deep Work", "Self-Help", 304)
        );

        Map<String, IntSummaryStatistics> bookStatsByGenre = books.stream()
                .collect(Collectors.groupingBy(
                        Book::getGenre,
                        Collectors.summarizingInt(Book::getPages)
                ));

        System.out.println("Library Book Statistics (Per Genre)");
        System.out.println("-----------------------------------");

        bookStatsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("Total Pages   : " + stats.getSum());
            System.out.println("Average Pages : " + stats.getAverage());
            System.out.println("Max Pages     : " + stats.getMax());
            System.out.println();
        });
    }
}

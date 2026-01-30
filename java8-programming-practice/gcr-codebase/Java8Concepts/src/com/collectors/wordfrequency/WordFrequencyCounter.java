package com.collectors.wordfrequency;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String paragraph = "Java streams make Java powerful and streams make code clean";

        Map<String, Integer> wordFrequency = Arrays.stream(paragraph.toLowerCase().split("\\s+"))
                .collect(Collectors.toMap(
                        word -> word,
                        word -> 1,
                        Integer::sum
                ));

        System.out.println("Word Frequency Count");
        System.out.println("--------------------");

        wordFrequency.forEach((word, count) ->
                System.out.println(word + " : " + count)
        );
    }
}

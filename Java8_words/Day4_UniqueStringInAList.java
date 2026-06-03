package com.List.words;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Day4_UniqueStringInAList {

    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "apple", "banana", "grape", "apple");

        // Count occurrence of each string
        Map<String, Long> countMap = list.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        System.out.println("Count Map : " + countMap);

        // Find unique strings (occurrence = 1)
        List<String> uniqueStrings = countMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Unique Strings : " + uniqueStrings);
    }
}
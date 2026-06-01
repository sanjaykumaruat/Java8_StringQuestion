package com.List.words;


import java.util.*;
import java.util.stream.Collectors;

public class Day3_UniqueStringUsingFrequency {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "def", "ghi", "abc", "jkl", "mno", "def");

        Set<String> uniqueStrings = list.stream()
                                        .filter(e -> Collections.frequency(list, e) == 1) // Keep only unique elements
                                        .collect(Collectors.toSet());

        System.out.println("Unique strings: " + uniqueStrings);
    }
}

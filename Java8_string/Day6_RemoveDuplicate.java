package com.string;
import java.util.stream.Collectors;

public class Day6_RemoveDuplicate {

    public static void main(String[] args) {
        String str = "sanjaykumarn";

        // Remove duplicate characters using Java 8
        String output = str.chars()
                           .distinct()
                           .mapToObj(c -> String.valueOf((char) c))
                           .collect(Collectors.joining());

        System.out.println("Original String: " + str);
        System.out.println("After Removing Duplicates: " + output);
    }
}
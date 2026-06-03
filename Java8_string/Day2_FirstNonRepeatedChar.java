package com.string;

public class Day2_FirstNonRepeatedChar {

    public static void main(String[] args) {
        String str = "abaccddee";
        Character firstNonRepeatedChar = str.chars()
            .mapToObj(c -> (char) c)
            .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
            .findFirst()
            .orElse(null);
        System.out.println("The first non-repeated character is " + firstNonRepeatedChar);
    }
}
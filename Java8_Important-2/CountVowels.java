package com.employee;

public class CountVowels {

    public static void main(String[] args) {

        String str = "sanjaykumar";
        long count = str.toLowerCase()
                        .chars()
                        .filter(ch -> "aeiou".indexOf(ch) != -1)
                        .count();

        System.out.println("Number of vowels = " + count);
    }
}
package com.string;

public class Day7_ReverseString {

    public static void main(String[] args) {

        String str = "sanjaykumar";

        String reversed =
                new StringBuilder(str)
                        .reverse()
                        .toString();

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversed);
    }
}
package com.words;

public class ReverseWordsInAString {

    public static String reverseWords(String s) {

        String[] words = s.trim().split("\\s+");
        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {

        String input = "sanjay is good";

        String output = reverseWords(input);

        System.out.println("Input: " + input);
        System.out.println("Reversed Words: " + output);
    }
}

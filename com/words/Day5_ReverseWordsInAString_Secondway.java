package com.words;

public class Day5_ReverseWordsInAString_Secondway {
    public static String reverseWords(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        
        // Reverse the order of words manually
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }
        
        // Trim and return the result
        return reversed.toString().trim();
    }

    public static void main(String[] args) {
        String sentence = "hello world";
        System.out.println("Original: " + sentence);
        System.out.println("Reversed: " + reverseWords(sentence));
    }
}

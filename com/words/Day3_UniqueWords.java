package com.words;

import java.util.HashMap;
import java.util.Map;

public class Day3_UniqueWords {
    public static void main(String[] args) {
        String[] words = {"apple", "banana", "grape", "apple", "orange", "banana"};

        findUniqueWords(words);
    }

    static void findUniqueWords(String[] words) {
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Non-Duplicate Words:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
            }
        }
    }
}

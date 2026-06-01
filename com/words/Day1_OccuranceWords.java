package com.words;

import java.util.HashMap;
import java.util.Map;

public class Day1_OccuranceWords {
	public static void main(String[] args) {
		String[] words = { "apple", "banana", "grape", "apple", "orange", "banana" };

		findDuplicateWords(words);
	}

	static void findDuplicateWords(String[] words) {
		Map<String, Integer> wordCount = new HashMap<>();

		for (String word : words) {
			wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
		}

		System.out.println("Duplicate Words:");
		for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
			// if (entry.getValue() > 1) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}

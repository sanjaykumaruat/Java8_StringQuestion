package com.words;

public class Day7_ReverseEachCharacterInAString {
	public static String reverseWords(String str) {
		String[] words = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String word : words)
			sb.append(new StringBuilder(word).reverse()).append(" ");
		return sb.toString().trim();
	}

	public static void main(String[] args) {
		System.out.println(reverseWords("hello world")); // Output: "olleh dlrow"
	}
}

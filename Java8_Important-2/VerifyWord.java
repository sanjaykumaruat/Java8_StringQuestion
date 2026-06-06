package com.employee;

import java.util.Arrays;
import java.util.List;

public class VerifyWord {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("dog", "cat");

		System.out.println(verifyMethod(words, "dafefwfe"));
		System.out.println(verifyMethod(words, "dsog"));
		System.out.println(verifyMethod(words, "bbb"));
	}

	public static String verifyMethod(List<String> words, String input) {

		for (String word : words) {

			boolean found = true;

			for (char ch : word.toCharArray()) {
				if (!input.contains(String.valueOf(ch))) {
					found = false;
					break;
				}
			}

			if (found) {
				return word;
			}
		}

		return "No match found";
	}
}
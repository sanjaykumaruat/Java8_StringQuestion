package com.words;

public class Day8_LongestCommonPrefix {
	public static String longestCommonPrefix(String[] strs) {
		if (strs.length == 0)
			return "";
		String prefix = strs[0];
		for (String str : strs) {
			while (!str.startsWith(prefix))
				prefix = prefix.substring(0, prefix.length() - 1);
			if (prefix.isEmpty())
				return "";
		}
		return prefix;
	}

	public static void main(String[] args) {
		String[] words = { "flower", "flow", "flight" };
		System.out.println(longestCommonPrefix(words)); // Output: "fl"
	}
}

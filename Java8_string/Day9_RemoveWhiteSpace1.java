package com.string;

public class Day9_RemoveWhiteSpace1 {

	public static void main(String[] args) {
		String str = "object orient programing";
		str = str.replaceAll("\\s", "");
		System.out.println("String after removing white space: " + str);

		// String str = "object orient programing";
		str = str.replaceAll("o", "#");
		System.out.println("String after replacing o with #: " + str);

	}

}

package com.string;

import java.util.Map;
import java.util.stream.Collectors;

public class Day7_ReverseCharacter {

	public static void main(String[] args) {
		String str = "Hello World";

		// Reverse the string
		String reversed = new StringBuilder(str).reverse().toString();
		System.out.println("Reversed string: " + reversed);

		
	}

}

package com.List.words;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Day5_DuplicateEachCharacterInList2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("apple", "banana", "apple");
       
		// get all character from the list
		List<Character> chars = list.stream()
				.flatMapToInt(CharSequence::chars)
				.mapToObj(ch -> (char) ch)
				.collect(Collectors.toList());

		System.out.println(chars);
		// output [a, p, p, l, e, b, a, n, a, n, a, a, p, p, l, e]

		// get the duplicate characters

		List<Character> duplicates = chars.stream()
				.filter(ch -> chars.indexOf(ch) != chars.lastIndexOf(ch))
				.distinct()
				.collect(Collectors.toList());

		 System.out.println(duplicates);
		 // output [a, p, l, e, n]
	}

}

package com.List.words;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Day6_RemoveCharacterFromString {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("abc", "abcc", "cba");

		// remove the character a from each string in the list and sort the list
		List<String> result = list.stream().map(s -> s.replaceFirst("a", "")).sorted(Comparator.naturalOrder())
				.collect(Collectors.toList());
		
		System.out.println(result);
		result.forEach(System.out::println);
	}

}
 //output : [bc, bcc, cb]
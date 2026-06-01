package com.List.words;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Day2_DuplicateStringInList {

	public static void main(String[] args) {
		
		
		List<String> list = Arrays.asList("apple", "banana", "grape", "apple");

		Map<String, Long> result = list.stream()
		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Map<String, Long> duplicates = result.entrySet().stream()
		        .filter(entry -> entry.getValue() > 1)
		        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		System.out.println(duplicates.keySet());

	}

}

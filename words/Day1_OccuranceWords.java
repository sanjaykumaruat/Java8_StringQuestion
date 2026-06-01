package com.List.words;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Day1_OccuranceWords {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple", "date");

		Map<String, Long> counts = list.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		for (Map.Entry<String, Long> entry : counts.entrySet()) {
			System.out.println("Element: " + entry.getKey() + ", Count: " + entry.getValue());
		}

	}

}

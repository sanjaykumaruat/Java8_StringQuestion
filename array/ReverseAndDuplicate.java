package com.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseAndDuplicate {

	public static void main(String[] args) {
		  Integer[] arr = {0, 1, 4, 8, 10, 10, 1};

	        List<Integer> sortedList = Arrays.stream(arr)
	                .sorted()
	                .collect(Collectors.toList());

	        System.out.println("Sorted array: " + sortedList);

	        List<Integer> duplicates = Arrays.stream(arr)
	                .collect(Collectors.groupingBy(Integer::intValue))
	                .entrySet()
	                .stream()
	                .filter(e -> e.getValue().size() > 1)
	                .map(e -> e.getKey())
	                .collect(Collectors.toList());

	        System.out.println("Duplicate digits: " + duplicates);

	}

}

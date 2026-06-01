package com.miscellaneous;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListExample {

	public static void main(String[] args) {
		 List<String> inputList = Arrays.asList("4", "two", "five", "1");
	        List<String> sortedList = inputList.stream()
	                                            .sorted()
	                                            .collect(Collectors.toList());
	        System.out.println("Sorted list: " + sortedList);

	}

}

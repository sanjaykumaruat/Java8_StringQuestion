package com.miscellaneous;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStrings {

	public static void main(String[] args) {
		  List<String> inputList = Arrays.asList("a", "bx", "$!", "M", "@k", "R", "T", "Y");
	        List<String> sortedList = inputList.stream()
	                .sorted()
	                .collect(Collectors.toList());
	        System.out.println("Sorted List: " + sortedList);

	}

}

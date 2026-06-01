package com.miscellaneous;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Reverse {
	 public static void main(String[] args) {

	        List<String> list = Arrays.asList("4", "two", "five", "1");

	        List<String> sortedList = list.stream()
	                .filter(str -> str.matches("\\d+"))
	                .sorted((str1, str2) -> Integer.parseInt(str1) - Integer.parseInt(str2))
	                .collect(Collectors.toList());

	        System.out.println("Original List: " + list);
	        System.out.println("Sorted List: " + sortedList);
	

	 }	
}
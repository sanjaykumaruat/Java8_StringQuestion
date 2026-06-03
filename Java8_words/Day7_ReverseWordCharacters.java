package com.List.words;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day7_ReverseWordCharacters {

	public static void main(String[] args) {
		  List<String> list = Arrays.asList("apple", "banana");

	        List<String> reversedList = new ArrayList<>();
	        for (String str : list) {
	            StringBuilder reversedStr = new StringBuilder(str).reverse();
	            reversedList.add(reversedStr.toString());
	        }

	        System.out.println(reversedList);
	}

}

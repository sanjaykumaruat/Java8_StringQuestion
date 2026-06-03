package com.List.words;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Day8_CommonToList4 {

	public static void main(String[] args) {
		
		List<String> list1= Arrays.asList("AA", "BB", "CC");
		List<String> list2= Arrays.asList("DD", "EE", "AA");
		
		//find the commam element between two string
		
		List<String> common= list1.stream().filter(list2 :: contains).collect(Collectors.toList());
        System.out.println(common);
	}

}

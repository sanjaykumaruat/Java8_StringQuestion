package com.array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OccuranceArray {

	public static void main(String[] args) {

	// list of array it has data 10 m, 20 ,10,30,40,50,40,60,70,50	
	List<Integer> list= Arrays.asList(10,20,30,40,50,40,60,70,50);
	
	Map<Integer, Long> result= list.stream()
			                       .collect(Collectors.groupingBy(c -> c , Collectors.counting()));
	
	System.out.println(result);
		 
	}
}

package com.array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 4, 6, 2,50, 60);
		List<Integer> result=list.stream()
				                 .sorted()
				                 .collect(Collectors.toList());
		//.limit(2).skip(1)
		
		

		//list.forEach(System.out::println);
		System.out.println(result);

	}

}

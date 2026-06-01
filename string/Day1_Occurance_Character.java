package com.string;

//import java.util.Map;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//
//public class Day1_Occurance_Character {
//	public static void main(String[] args) {
//		//String input ="23456*!756723@23489"
//				 
//	  // output =[23456,567,234]
//	}
//}
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Day1_Occurance_Character {

	public static void main(String[] args) {

		String str = "sanjaykumarn";

		// Count occurrence of each character
		Map<Character, Long> counts = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// Print character occurrences
		for (Map.Entry<Character, Long> entry : counts.entrySet()) {

			System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
		}
	}
}
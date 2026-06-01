package com.string;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Day3_UniqueCharacter {

	public static void main(String[] args) {
		
		String str="sanjaykumarn";
		Map<Character, Long> charCountMap = str.chars()
				                             .mapToObj(c->(char) c)
				                             .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(charCountMap);// out -{a=2, s=1, y=1, j=1, n=1}

		
		 List<Character> duplicate = charCountMap.entrySet()
				                      .stream().filter(entry -> entry.getValue()==1)
				                      .map(Map.Entry :: getKey)
				                      .collect(Collectors.toList());
		 System.out.println("duplicate" + duplicate);
	}

}

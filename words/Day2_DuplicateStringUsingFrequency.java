package com.List.words;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Day2_DuplicateStringUsingFrequency {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc", "def", "abc");
		Set<String> duplicate = list.stream().filter(e -> Collections.frequency(list, e) > 1)
				.collect(Collectors.toSet());

		//System.out.println(duplicate);
		duplicate.forEach(System.out::println);
	}

}
//output- [abc]
//abc
package com.employee;

import java.util.stream.Stream;

public class StreamPuzzle {

	public static void main(String[] args) {

		Stream<String> stream = Stream.of("alpha", "beta", "gamma", "delta").filter(s -> {
			System.out.println("Filtering: " + s);
			return s.length() > 4;
		});

		System.out.println("Stream defined.");

		stream.forEach(s -> System.out.println("Final Output: " + s));
	}
}
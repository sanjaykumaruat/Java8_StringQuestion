package com.miscellaneous;

import java.util.stream.Collectors;

public class RemovewhiteSpace {

	public static void main(String[] args) {
		
		String str=" Hello!  World ";
		String nospace= str.chars()
				           .filter(c -> !Character.isWhitespace(c)).mapToObj(c -> String.valueOf((char)c))
				           .collect( Collectors.joining());
		System.out.println(nospace);

	}

}

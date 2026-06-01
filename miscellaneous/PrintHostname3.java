package com.miscellaneous;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PrintHostname3 {

	public static void main(String[] args) {
		
		//String url= "www.google.com";
		String url= "sanjay";
		
		//split the url parts using the dot as a delimiter
		String[] parts= url.split("");
		
		//filter the parts
		String filtered= Arrays.stream(parts)
				               .filter(part -> part.contains("google"))
				               .collect(Collectors.joining());
		System.out.println(filtered);
		

	}

}

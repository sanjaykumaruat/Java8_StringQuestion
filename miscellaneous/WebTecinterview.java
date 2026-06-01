package com.miscellaneous;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WebTecinterview {
public static void main(String[] args) {

		        List<String> input = Arrays.asList("4", "two", "five", "1");

		        List<String> output = input.stream()
		                                   .sorted()
		                                   .collect(Collectors.toList());

		        System.out.println(output);
		    }
		}

//[1, 4, five, two]

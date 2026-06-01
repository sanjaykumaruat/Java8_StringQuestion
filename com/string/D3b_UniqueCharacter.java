package com.string;

import java.util.HashMap;
import java.util.Map;

public class D3b_UniqueCharacter {
	    public static void findNonDuplicateCharacters(String str) {
	        Map<Character, Integer> charCountMap = new HashMap<>();

	        // Count occurrences of each character
	        for (char ch : str.toCharArray()) {
	            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
	        }

	        // Print characters that appear only once (non-duplicate)
	        System.out.println("Non-Duplicate (Unique) Characters:");
	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            if (entry.getValue() == 1) {
	                System.out.println(entry.getKey());
	            }
	        }
	    }

	    public static void main(String[] args) {
	        String input = "programming";
	        System.out.println("Input String: " + input);
	        findNonDuplicateCharacters(input);
	    }
	}

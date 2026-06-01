package com.string;

import java.util.HashMap;
import java.util.Map;

public class D3a_DuplicateCharacter{
   // public static void findDuplicateCharacters(String str) {
	 public static void main(String[] args) {
    	  String str = "programming";
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print characters that appear more than once
        System.out.println("Duplicate Characters:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
	 }
}

   
 

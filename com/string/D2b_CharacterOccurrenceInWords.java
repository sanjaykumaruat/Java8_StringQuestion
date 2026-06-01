package com.string;

import java.util.HashMap;
import java.util.Map;

public class D2b_CharacterOccurrenceInWords {
 public static void main(String[] args) {
     String str = "hello world";

     // Create a HashMap to store character counts
     Map<Character, Integer> charCountMap = new HashMap<>();

     // Convert string to lowercase and iterate
     for (char ch : str.toLowerCase().toCharArray()) {
         if (ch != ' ') { // Ignore spaces
             charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
         }
     }

     // Display results
     System.out.println("Character occurrences in \"" + str + "\":");
     for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
         System.out.println(entry.getKey() + " : " + entry.getValue());
     }
 }
}

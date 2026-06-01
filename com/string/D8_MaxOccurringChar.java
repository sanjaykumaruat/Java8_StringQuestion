package com.string;

import java.util.HashMap;
import java.util.Map;

public class D8_MaxOccurringChar {
    public static char getMaxOccurringChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char maxChar = s.charAt(0);
        int maxCount = 0;

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.get(c) > maxCount) {
                maxCount = map.get(c);
                maxChar = c;
            }
        }
        return maxChar;
    }

    public static void main(String[] args) {
        System.out.println(getMaxOccurringChar("programming")); // Output: 'a'
    }
}

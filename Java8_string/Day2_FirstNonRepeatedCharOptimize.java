package com.string;
// LinkedHashMap is important in this questions
import java.util.LinkedHashMap;
import java.util.Map;

public class Day2_FirstNonRepeatedCharOptimize {

    public static void main(String[] args) {

        String str = "aaccddeeb";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First non-repeated character: " + entry.getKey());
                break;
            }
        }
    }
}

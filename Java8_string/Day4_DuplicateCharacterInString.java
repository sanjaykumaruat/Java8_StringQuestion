package com.string;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Day4_DuplicateCharacterInString {

    public static void main(String[] args) {

        String str = "sanjaykumarn";

        // Count occurrence of each character
        Map<Character, Long> charCountMap = str.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        System.out.println("Character Count Map: " + charCountMap);

        // Find duplicate characters
        List<Character> duplicateCharacters = charCountMap.entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println("Duplicate Characters: " + duplicateCharacters);
    }
}
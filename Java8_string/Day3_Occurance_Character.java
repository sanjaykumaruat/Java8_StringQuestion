package com.string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Day3_Occurance_Character {

    public static void main(String[] args) {

        String str = "sanjaykumarn";

        Map<Character, Long> charCountMap = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting()));

        charCountMap.forEach((ch, count) ->
                System.out.println("Character: " + ch + ", Count: " + count));
    }
}
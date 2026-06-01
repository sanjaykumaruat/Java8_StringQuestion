package com.string;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter {

    public static void main(String[] args) {

        String str = "abaccddee";

        Set<Character> seen = new HashSet<>();

        Character firstRepeated = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !seen.add(c)) // add() returns false if already present
                .findFirst()
                .orElse(null);

        System.out.println("First repeated character: " + firstRepeated);
    }
}

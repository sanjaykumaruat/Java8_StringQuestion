package com.string;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedCharacter2 {

    public static void main(String[] args) {

        String str = "abaccddee";
        Set<Character> set = new HashSet<>();

        for (char c : str.toCharArray()) {
            if (!set.add(c)) {
                System.out.println("First repeated character: " + c);
                break;
            }
        }
    }
}

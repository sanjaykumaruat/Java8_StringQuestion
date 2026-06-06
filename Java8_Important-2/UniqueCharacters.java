package com.employee;

import java.util.Set;
import java.util.stream.Collectors;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "sanjaykumar";

        Set<Character> uniqueChars = str.chars()
                                        .mapToObj(c -> (char) c)
                                        .collect(Collectors.toSet());

        boolean allUnique = str.length() == uniqueChars.size();

        System.out.println("All characters unique? " + allUnique);
    }
}
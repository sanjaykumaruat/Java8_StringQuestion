package com.employee;

import java.util.Set;
import java.util.stream.Collectors;

public class CommonCharacterInTwoString {

    public static void main(String[] args) {

        String str1 = "developer";
        String str2 = "programmer";

        Set<Character> result = str1.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> str2.indexOf(ch) != -1)
                .collect(Collectors.toSet());

        System.out.println("Common Characters: " + result);
    }
}

package com.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateArray {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 1, 5);

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = list.stream()
                .filter(n -> !seen.add(n))
                .collect(Collectors.toSet());

        System.out.println("Duplicate elements: " + duplicates); // Output: [1, 2]
    }
}

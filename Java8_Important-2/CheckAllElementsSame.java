package com.employee;

import java.util.Arrays;

public class CheckAllElementsSame {

    public static void main(String[] args) {

        int[] arr = {5, 5, 5, 5, 5};

        boolean allSame = Arrays.stream(arr)
                                .distinct()
                                .count() == 1;

        System.out.println("All elements same? " + allSame);
    }
}
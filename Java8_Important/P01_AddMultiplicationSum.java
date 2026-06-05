

import java.util.*;

public class P01_AddMultiplicationSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 16, 25, 36);

        int result = numbers.stream()
                            .map(n -> n + 3)    // Step 1: Add 3
                            .map(n -> n * 4)    // Step 2: Multiply by 4
                            .mapToInt(Integer::intValue)
                            .sum();             // Step 3: Sum

        System.out.println("Final Result: " + result);
    }
}

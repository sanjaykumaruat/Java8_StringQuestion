

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNumbers {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        // Sum of even numbers using Java 8 Stream
        int sum = numbers.stream()
                         .filter(num -> num % 2 == 0)
                         .mapToInt(Integer::intValue)
                         .sum();

        System.out.println("Sum of Even Numbers: " + sum);
    }
}
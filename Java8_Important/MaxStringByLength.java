

import java.util.*;

public class MaxStringByLength {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("sanjay", "kuma");

        String maxByLength = names.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("No value");

        System.out.println("Max by length: " + maxByLength);
    }
}

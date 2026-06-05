import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class P02_LongestWordFromString {

    public static void main(String[] args) {

        String str = "good morning";

        // Find longest word
        Optional<String> max = Stream.of(str.split(" "))
                .max(Comparator.comparingInt(String::length));

        // Print result
        max.ifPresent(System.out::println);
    }
}


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindStringStartsWithA {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple", "date");

		// Find strings starting with letter 'a'
		List<String> result = list.stream().filter(str -> str.startsWith("a")).collect(Collectors.toList());

		System.out.println(result);
	}
}
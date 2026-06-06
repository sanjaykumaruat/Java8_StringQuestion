
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P04_Sort_Null {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2, 7, 5, null, 3, 1);

		List<Integer> result = list.stream().filter(num -> num != null).sorted().collect(Collectors.toList());

		result.forEach(System.out::println);
	}
}
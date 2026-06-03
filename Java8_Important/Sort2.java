

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sort2 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("1", "2", "a", "b", "#", "&", "$");
		String result = list.stream().filter(ch -> ch.matches("[a-zA-Z0-9]")).collect(Collectors.joining());
		System.out.println(result);
	}
}
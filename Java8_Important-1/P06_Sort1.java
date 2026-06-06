


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class P06_Sort1 {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("1", "2", "a", "b", "#", "&", "$");

        String result = list.stream()
                .filter(ch -> !ch.equals("#")
                        && !ch.equals("&")
                        && !ch.equals("$"))
                .collect(Collectors.joining());

        System.out.println(result);
    }
}
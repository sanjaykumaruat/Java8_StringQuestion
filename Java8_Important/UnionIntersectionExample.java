
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UnionIntersectionExample {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(1, 2);

        // Union (combine and remove duplicates)
        List<Integer> union = Stream.concat(list1.stream(), list2.stream())
                                    .distinct()
                                    .collect(Collectors.toList());

        // Intersection (common elements)
        List<Integer> intersection = list1.stream()
                                          .filter(list2::contains)
                                          .collect(Collectors.toList());
        
        // Difference (elements in list1 but not in list2)
        List<Integer> difference = list1.stream()
                                        .filter(e -> !list2.contains(e))
                                        .collect(Collectors.toList());

       
        System.out.println("Union: " + union);           // [1, 2, 3, 4]
        System.out.println("Intersection: " + intersection); // [1, 2]
        System.out.println("Difference: " + difference); //[3, 4]
    }
}

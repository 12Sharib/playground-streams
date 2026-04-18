package advance;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Q16_FindDuplicateElements {

    /*
     * Problem:
     * Given a list of integers, find all duplicate elements using Java Streams.
     *
     * Input:
     * [1, 2, 2, 3, 3, 4, 5, 5]
     *
     * Output:
     * [2, 3, 5]
     */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 5);

        System.out.println(
                list
                        .stream()
                        .collect(
                                Collectors
                                        .groupingBy(
                                                Function.identity(),
                                                Collectors.counting()
                                        )
                        )
                        .entrySet()
                        .stream()
                        .filter(e -> e.getValue() > 1)
                        .map(Map.Entry::getKey)
                        .toList()
        );

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = list.stream()
                .filter(n -> !seen.add(n))
                .collect(Collectors.toSet());

        System.out.println(duplicates);
        
    }
}
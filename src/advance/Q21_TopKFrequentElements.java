package advance;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Q21_TopKFrequentElements {

    /*
     * Problem:
     * Given a list of integers, find the top K frequent elements using Java Streams.
     *
     * Input:
     * [1, 1, 1, 2, 2, 3], K = 2
     *
     * Output:
     * [1, 2]
     */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 1, 2, 2, 3);
        int k = 2;

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
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .limit(k)
                        .map(Map.Entry::getKey)
                .collect(Collectors.toList())
        );
        
    }
}
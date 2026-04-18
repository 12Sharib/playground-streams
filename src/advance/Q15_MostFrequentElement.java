package advance;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Q15_MostFrequentElement {

    /*
     * Problem:
     * Given a list of integers, find the element that appears most frequently.
     *
     * Input:
     * [1, 2, 2, 3, 3, 3, 4]
     *
     * Output:
     * 3
     */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3, 4);

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
                        .max(Map.Entry.comparingByValue())
                        .map(Map.Entry::getKey)
                        .orElse(null)
        );
        
    }
}
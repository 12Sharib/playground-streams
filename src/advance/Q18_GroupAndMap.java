package advance;

import java.util.*;
import java.util.stream.*;

public class Q18_GroupAndMap {

    /*
     * Problem:
     * Given a list of strings, group them by their first character,
     * and store only their lengths in the result.
     *
     * Input:
     * ["apple", "banana", "avocado", "blueberry", "cherry"]
     *
     * Output:
     * {
     *   a=[5, 7],
     *   b=[6, 9],
     *   c=[6]
     * }
     */

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "avocado", "blueberry", "cherry");

        System.out.println(
                list
                        .stream()
                        .collect(
                                Collectors
                                        .groupingBy(
                                                s->s.charAt(0),
                                                Collectors
                                                        .mapping(
                                                                String::length,
                                                                Collectors.toList()
                                                        )
                                        )
                        )
        );
        
    }
}
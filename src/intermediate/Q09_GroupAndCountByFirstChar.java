package intermediate;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Q09_GroupAndCountByFirstChar {

    /*
     * Problem:
     * Given a list of strings, group them by their first character
     * and count how many strings belong to each group.
     *
     * Input:
     * ["apple", "banana", "avocado", "blueberry", "cherry"]
     *
     * Output:
     * {
     *   a=2,
     *   b=2,
     *   c=1
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
                                                Collectors.counting()
                                        )
                        )
        );
        
    }
}
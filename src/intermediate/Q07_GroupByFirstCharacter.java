package intermediate;

import java.util.*;
import java.util.stream.*;

public class Q07_GroupByFirstCharacter {

    /*
     * Problem:
     * Given a list of strings, group them by their first character using Java Streams.
     *
     * Input:
     * ["apple", "banana", "avocado", "blueberry", "cherry"]
     *
     * Output:
     * {
     *   a=[apple, avocado],
     *   b=[banana, blueberry],
     *   c=[cherry]
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
                                                s->s.charAt(0)
                                        )
                        )
        );

        // If I need to preserve order
        System.out.println(
                String.valueOf(list
                        .stream()
                        .collect(
                                Collectors
                                        .groupingBy(
                                                s->s.charAt(0),
                                                LinkedHashMap::new,
                                                Collectors.toList()
                                        )
                        ))
        );

        
    }
}
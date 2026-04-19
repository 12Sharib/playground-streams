package advance;

import java.util.*;
import java.util.stream.*;

public class Q19_GroupAndMaxLength {

    /*
     * Problem:
     * Given a list of strings, group them by their first character,
     * and find the maximum length string in each group.
     *
     * Input:
     * ["apple", "banana", "avocado", "blueberry", "cherry"]
     *
     * Output:
     * {
     *   a=avocado,
     *   b=blueberry,
     *   c=cherry
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
                                                        .collectingAndThen(
                                                                Collectors.maxBy(Comparator.comparing(String::length)),
                                                                opt->opt.orElse(null)
                                                        )
                                        )
                        )
        );
        
    }
}
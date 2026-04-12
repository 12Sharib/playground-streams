package intermediate;

import java.util.*;
import java.util.stream.*;

public class Q05_SortByLength {

    /*
     * Problem:
     * Given a list of strings, sort them by their length in ascending order using Java Streams.
     *
     * Input:
     * ["apple", "kiwi", "banana", "fig"]
     *
     * Output:
     * ["fig", "kiwi", "apple", "banana"]
     */

    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "kiwi", "banana", "fig");

        // Your solution here
        System.out.println(
                list
                        .stream()
                        .sorted(Comparator.comparing(String::length))
                        .toList()
        );

        System.out.println(
                list
                        .stream()
                        .sorted((a,b) -> a.length()-b.length())
                        .toList()
        );
        
    }
}
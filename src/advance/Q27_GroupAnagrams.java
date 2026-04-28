package advance;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Q27_GroupAnagrams {

    /*
     * Problem:
     * Given a list of strings, group the anagrams together using Java Streams.
     *
     * Input:
     * ["eat", "tea", "tan", "ate", "nat", "bat"]
     *
     * Output:
     * [
     *   [eat, tea, ate],
     *   [tan, nat],
     *   [bat]
     * ]
     */

    public static void main(String[] args) {
        List<String> list = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");

        System.out.println(
                list
                        .stream()
                        .collect(
                                Collectors
                                        .groupingBy(
                                                x-> x.chars()
                                                        .sorted()
                                                        .mapToObj(c -> String.valueOf((char) c))
                                                        .collect(Collectors.joining())

                                        )
                        )
        );
        
    }
}
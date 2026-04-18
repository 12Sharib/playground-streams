package advance;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Q17_LongestString {

    /*
     * Problem:
     * Given a list of strings, find the longest string using Java Streams.
     *
     * Input:
     * ["java", "springboot", "microservices", "api"]
     *
     * Output:
     * "microservices"
     */

    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "springboot", "microservices", "api");

        System.out.println(
                list
                        .stream()
                        .collect(
                                Collectors
                                        .toMap(
                                                Function.identity(),
                                                String::length
                                        )
                        )
                        .entrySet()
                        .stream()
                        .max(Map.Entry.comparingByValue())
                        .map(Map.Entry::getKey)
                        .orElse("")
        );
        System.out.println(
                list
                        .stream()
                        .max(Comparator.comparing(String::length))
                        .orElse("")
        );
    }
}
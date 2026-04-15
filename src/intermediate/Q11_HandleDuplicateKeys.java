package intermediate;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Q11_HandleDuplicateKeys {

    /*
     * Problem:
     * Given a list of strings, convert it into a Map where:
     * key = string
     * value = length of string
     *
     * If duplicate keys are present, keep the first occurrence.
     *
     * Input:
     * ["java", "api", "java", "stream"]
     *
     * Output:
     * {java=4, api=3, stream=6}
     */

    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "api", "java", "stream");

        System.out.println(
                list
                        .stream()
                        .collect(
                                Collectors
                                        .toMap(
                                                Function.identity(),
                                                String::length,
                                                (existing, replacement) -> existing
                                        )
                        )
        );
    }
}
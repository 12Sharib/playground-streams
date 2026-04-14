package intermediate;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Q10_ConvertListToMap {

    /*
     * Problem:
     * Given a list of strings, convert it into a Map where:
     * key = string
     * value = length of string
     *
     * Input:
     * ["java", "stream", "api"]
     *
     * Output:
     * {java=4, stream=6, api=3}
     */

    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "stream", "api");

        System.out.println(
                list
                        .stream()
                        .collect(
                                Collectors
                                        .toMap(
                                                s->s,
                                                String::length
                                        )
                        )
        );

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
        );
        
    }
}
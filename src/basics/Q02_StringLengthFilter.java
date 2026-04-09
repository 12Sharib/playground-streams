package basics;

import java.util.*;
import java.util.stream.*;

public class Q02_StringLengthFilter {

    /*
     * Problem:
     * Given a list of strings, filter strings with length greater than 3
     * and convert them to uppercase using Java Streams.
     *
     * Input:
     * ["java", "is", "fun", "streams", "api"]
     *
     * Output:
     * ["JAVA", "STREAMS"]
     */

    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "is", "fun", "streams", "api");

        List<String> result =
                        list
                            .stream()
                            .filter(n->n.length()>3)
                            .map(String::toUpperCase)
                            .toList();

        System.out.println(result);

        
    }
}
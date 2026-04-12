package intermediate;

import java.util.*;
import java.util.stream.*;

public class Q06_FindMaxLengthString {

    /*
     * Problem:
     * Given a list of strings, find the string with maximum length using Java Streams.
     *
     * Input:
     * ["java", "springboot", "api", "microservices"]
     *
     * Output:
     * "microservices"
     */

    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "springboot", "api", "microservices");

        // Your solution here
        System.out.println(
                list
                        .stream()
                        .max(
                                Comparator.comparingInt(String::length)

                        ).orElse(null)
        );
        
    }
}
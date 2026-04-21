package advance;

import java.util.*;
import java.util.stream.*;

public class Q22_JoinStringsByDelimiter {

    /*
     * Problem:
     * Given a list of strings, join them with a comma delimiter using Java Streams.
     *
     * Input:
     * ["java", "stream", "api"]
     *
     * Output:
     * "java,stream,api"
     */

    public static void main(String[] args) {
        List<String> list = Arrays.asList("java", "stream", "api");

        System.out.println(
                list
                        .stream()
                        .collect(
                                Collectors.joining(", ")
                        )
        );
        
    }
}
package advance;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Q25_FindFirstDuplicate {

    /*
     * Problem:
     * Given a list of integers, find the first duplicate element using Java Streams.
     *
     * Input:
     * [1, 2, 3, 2, 4, 5, 3]
     *
     * Output:
     * 2
     */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 5, 3);

        Set<Integer> set = new HashSet<>();

        System.out.println(
                list
                        .stream()
                        .filter(x -> !set.add(x))
                        .findFirst()
                        .orElse(null)
        );
        
    }
}
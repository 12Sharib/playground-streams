package advance;

import java.util.*;
import java.util.stream.*;

public class Q14_FindSecondHighest {

    /*
     * Problem:
     * Given a list of integers, find the second highest number using Java Streams.
     *
     * Input:
     * [10, 20, 30, 40, 50]
     *
     * Output:
     * 40
     */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        System.out.println(
                list
                        .stream()
                        .sorted(Collections.reverseOrder())
                        .skip(1)
                        .findFirst()
                        .orElse(null)
        );
        // If duplicate values
        System.out.println(
                list
                        .stream()
                        .distinct()
                        .sorted(
                                Collections.reverseOrder()
                        )
                        .skip(1)
                        .findFirst()
                        .orElse(null)
        );
        
    }
}
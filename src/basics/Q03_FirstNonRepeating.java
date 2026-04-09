package basics;

import java.util.*;
import java.util.stream.*;

public class Q03_FirstNonRepeating {

    /*
     * Problem:
     * Given a list of integers, find the first non-repeating element using Java Streams.
     *
     * Input:
     * [4, 5, 1, 2, 0, 4, 5, 2]
     *
     * Output:
     * 1
     */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4, 5, 1, 2, 0, 4, 5, 2);

        System.out.println(
                list
                        .stream()
                        .filter(n-> Collections.frequency(list, n) == 1)
                        .findFirst()
                        .orElse(null)
        );
        
    }
}
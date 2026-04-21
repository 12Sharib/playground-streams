package advance;

import java.util.*;
import java.util.stream.*;

public class Q24_RemoveDuplicatesPreserveOrder {

    /*
     * Problem:
     * Given a list of integers, remove duplicates while preserving insertion order.
     *
     * Input:
     * [2, 2, 3, 1, 4]
     *
     * Output:
     * [1, 2, 3, 4]
     */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 1, 4);

        System.out.println(
                list
                        .stream()
                        .distinct()
                        .toList()

        );
        
    }
}
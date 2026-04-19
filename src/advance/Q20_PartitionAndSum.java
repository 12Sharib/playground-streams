package advance;

import java.util.*;
import java.util.stream.*;

public class Q20_PartitionAndSum {

    /*
     * Problem:
     * Given a list of integers, partition them into even and odd numbers,
     * and calculate the sum of each group.
     *
     * Input:
     * [1, 2, 3, 4, 5, 6]
     *
     * Output:
     * {
     *   false=9,   // odd sum
     *   true=12    // even sum
     * }
     */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println(
                list
                        .stream()
                        .collect(
                                Collectors
                                        .partitioningBy(
                                                n->n%2==0,
                                                Collectors.summingInt(n->n)
                                        )
                        )
        );
        
    }
}
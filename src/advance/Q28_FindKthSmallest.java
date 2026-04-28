package advance;

import java.util.*;
import java.util.stream.*;

public class Q28_FindKthSmallest {

    /*
     * Problem:
     * Given a list of integers, find the Kth smallest element using Java Streams.
     *
     * Input:
     * [7, 10, 4, 3, 20, 15], K = 3
     *
     * Output:
     * 7
     */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(7, 10, 4, 3, 20, 15);
        int k = 3;

        System.out.println(
                list
                        .stream()
                        .sorted()
                        .skip(k-1)
                        .findFirst()
                        .orElse(null)
        );
        
    }
}
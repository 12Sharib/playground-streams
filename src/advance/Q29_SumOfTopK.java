package advance;

import java.util.*;
import java.util.stream.*;

public class Q29_SumOfTopK {

    /*
     * Problem:
     * Given a list of integers, find the sum of top K largest elements using Java Streams.
     *
     * Input:
     * [5, 1, 9, 3, 14, 2], K = 3
     *
     * Output:
     * 28   // (14 + 9 + 5)
     */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 1, 9, 3, 14, 2);
        int k = 3;

        System.out.println(
                list
                        .stream()
                        .sorted(Comparator.reverseOrder())
                        .limit(k)
                        .mapToInt(Integer::intValue)
                        .sum()
        );
        
    }
}
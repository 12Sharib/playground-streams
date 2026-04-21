package advance;

import java.util.*;
import java.util.stream.*;

public class Q23_CustomCollectorExample {

    /*
     * Problem:
     * Given a list of integers, create a comma-separated string of squares of even numbers.
     *
     * Input:
     * [1, 2, 3, 4, 5]
     *
     * Output:
     * "4,16"
     */

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(
                list
                        .stream()
                        .filter(
                                n -> n%2 ==0
                        )
                        .map(n -> n*n)
                        .map(String::valueOf)
                        .collect(
                                Collectors.joining(", ")
                        )
        );
        
    }
}
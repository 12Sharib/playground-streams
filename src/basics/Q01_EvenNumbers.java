package basics;

import java.util.*;
import java.util.stream.Collectors;

public class Q01_EvenNumbers {

    /*
     * Problem:
     * Given a list of integers, filter out even numbers using Java Streams.
     *
     * Input:
     * [1, 2, 3, 4, 5, 6]
     *
     * Output:
     * [2, 4, 6]
     */
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        System.out.println(list
                .stream()
                .filter(n->n%2==0)
                .toList());
    }
}
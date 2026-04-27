package advance;

import java.util.*;
import java.util.stream.*;

public class Q26_CheckAnagram {

    /*
     * Problem:
     * Given two strings, check if they are anagrams using Java Streams.
     *
     * Input:
     * "listen", "silent"
     *
     * Output:
     * true
     */

    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        System.out.println(
                s1
                        .chars()
                        .boxed()
                        .collect(Collectors.toList())
                        .equals(
                                s2.chars()
                                        .boxed()
                                        .collect(
                                                Collectors.toList()
                                        )
                        )
        );
        boolean result = s1.length() == s2.length() &&
                s1.chars().sorted().boxed().collect(Collectors.toList())
                        .equals(
                                s2.chars().sorted().boxed().collect(Collectors.toList())
                        );

        System.out.println(result);

        Map<Character, Long> map1 = s1.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        Map<Character, Long> map2 = s2.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        System.out.println(map1.equals(map2));
        
    }
}
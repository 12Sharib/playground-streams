package intermediate;

import java.util.*;
import java.util.stream.*;

public class Q12_SortMapByValue {

    /*
     * Problem:
     * Given a map of String -> Integer, sort the map by values in ascending order.
     *
     * Input:
     * {a=3, b=1, c=2}
     *
     * Output:
     * {b=1, c=2, a=3}
     */

    public static void main(String[] args) {
        Map<String, Integer> map = Map.of("a", 3, "b", 1, "c", 2);

        System.out.println(
                map.
                        entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue())
                        .toList()
        );

        System.out.println(
                map
                        .entrySet()
                        .stream()
                        .sorted(
                                (x, y) -> x.getValue().compareTo(y.getValue())
                        ).toList()
        );

        System.out.println(
                String.valueOf(map
                        .entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByValue())
                        .collect(
                                Collectors
                                        .toMap(
                                                Map.Entry::getKey,
                                                Map.Entry::getValue,
                                                (e1,e2) -> e1,
                                                LinkedHashMap::new
                                        )
                        ))
        );
    }
}
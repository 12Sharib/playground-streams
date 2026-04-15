package intermediate;

import java.util.*;
import java.util.stream.*;

public class Q13_FlattenList {

    /*
     * Problem:
     * Given a list of lists, flatten it into a single list using Java Streams.
     *
     * Input:
     * [[1, 2], [3, 4], [5]]
     *
     * Output:
     * [1, 2, 3, 4, 5]
     */

    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5)
        );

        System.out.println(
                list
                        .stream()
                        .flatMap(
                                List::stream
                        ).collect(Collectors.toList())
        );
        
    }
}
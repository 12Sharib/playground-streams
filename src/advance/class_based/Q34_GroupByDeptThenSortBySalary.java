package advance.class_based;

import advance.class_based.model.Employee;

import java.util.*;
import java.util.stream.*;

public class Q34_GroupByDeptThenSortBySalary {

    /*
     * Problem:
     * Given a list of employees, group them by department,
     * and within each department sort employees by salary in descending order.
     *
     * Input:
     * Same employee list
     *
     * Output:
     * {
     *   IT=[C, A],
     *   HR=[D, B]
     * }
     */

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(
                new Employee("A", "IT", 5000),
                new Employee("B", "HR", 4000),
                new Employee("C", "IT", 7000),
                new Employee("D", "HR", 6000)
        );

        System.out.println(
                list
                        .stream()
                        .collect(
                            Collectors
                                    .groupingBy(Employee::getDepartment,
                                            Collectors.collectingAndThen(
                                                    Collectors.toList(),
                                                    l ->
                                                            l.stream()
                                                                    .sorted(Comparator.comparing(Employee::getSalary).reversed())
                                                                    .map(Employee::getName)
                                                                    .toList()
                                            )
                                    )

                        )
        );
    }
}
package advance.class_based;

import advance.class_based.model.Employee;

import java.util.*;
import java.util.stream.*;

public class Q32_GroupNamesByDept {

    /*
     * Problem:
     * Given a list of employees, group employee names by department.
     *
     * Input:
     * Same employee list
     *
     * Output:
     * {
     *   IT=[A, C],
     *   HR=[B, D]
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
                                        .groupingBy(
                                                Employee::getDepartment,
                                                Collectors.mapping(Employee::getName, Collectors.toList())
                                        )
                        )
        );
        
    }
}
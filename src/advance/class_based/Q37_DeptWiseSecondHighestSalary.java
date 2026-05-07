package advance.class_based;

import advance.class_based.model.Employee;

import java.util.*;
import java.util.stream.*;

public class Q37_DeptWiseSecondHighestSalary {

    /*
     * Problem:
     * Given a list of employees, find the second highest salary in each department.
     *
     * Input:
     * Same employee list
     *
     * Output:
     * {
     *   IT=5000,
     *   HR=4000
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
                                                Collectors
                                                        .collectingAndThen(
                                                                Collectors.toList(),
                                                                l -> l.stream()
                                                                        .sorted(Comparator.comparingInt(Employee::getSalary).reversed())
                                                                        .skip(1)
                                                                        .findFirst()
                                                                        .map(Employee::getSalary)
                                                                        .orElse(null)

                                                        )
                                        )
                        )
        );
        
    }
}
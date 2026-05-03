package advance.class_based;

import advance.class_based.model.Employee;

import java.util.*;
import java.util.stream.*;

public class Q33_GroupSalaryStatsByDept {

    /*
     * Problem:
     * Given a list of employees, group them by department
     * and calculate summary statistics (count, sum, min, max, average salary).
     *
     * Input:
     * Same employee list
     *
     * Output:
     * {
     *   IT=IntSummaryStatistics{count=2, sum=12000, min=5000, average=6000.0, max=7000},
     *   HR=IntSummaryStatistics{count=2, sum=10000, min=4000, average=5000.0, max=6000}
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
                                                        .summarizingInt(Employee::getSalary)
                                        )
                        )
        );
        
    }
}
package advance.class_based;

import advance.class_based.model.Employee;

import java.util.*;
import java.util.stream.*;

public class Q35_MultiLevelGrouping {

    /*
     * Problem:
     * Given a list of employees, group them first by department,
     * then within each department group by salary range:
     * - "LOW" (<5000)
     * - "MEDIUM" (5000–7000)
     * - "HIGH" (>7000)
     *
     * Input:
     * Same employee list
     *
     * Output:
     * {
     *   IT={
     *     MEDIUM=[A, C]
     *   },
     *   HR={
     *     LOW=[B],
     *     MEDIUM=[D]
     *   }
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
                                                Collectors
                                                        .groupingBy(
                                                                e ->{
                                                                    if(e.getSalary() > 7000){
                                                                        return "HIGH";
                                                                    }else if(e.getSalary() < 5000){
                                                                        return "LOW";
                                                                    }else {
                                                                        return "MEDIUM";
                                                                    }
                                                                },
                                                                Collectors.mapping(
                                                                        Employee::getName,
                                                                        Collectors.toList()
                                                                )
                                                        ))
                        )
        );
        
    }
}
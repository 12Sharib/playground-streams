package advance.class_based;

import advance.class_based.model.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Q31_EmployeeAvgSalaryByDept {

    /*
     * Problem:
     * Given a list of employees, find the average salary of each department.
     *
     * Input:
     * Same as previous
     *
     * Output:
     * {
     *   IT=6000.0,
     *   HR=5000.0
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
                                                        .averagingInt(Employee::getSalary)
                                        )
                        )
        );
        
    }
}
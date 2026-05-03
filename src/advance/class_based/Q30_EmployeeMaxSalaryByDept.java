package advance.class_based;

import java.util.*;
import java.util.stream.*;
import advance.class_based.*;
import advance.class_based.model.Employee;

public class Q30_EmployeeMaxSalaryByDept {

    /*
     * Problem:
     * Given a list of employees, find the employee with the highest salary in each department.
     *
     * Input:
     * [
     *   ("A", "IT", 5000),
     *   ("B", "HR", 4000),
     *   ("C", "IT", 7000),
     *   ("D", "HR", 6000)
     * ]
     *
     * Output:
     * {
     *   IT=C,
     *   HR=D
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
                                                                Collectors
                                                                        .maxBy(
                                                                                Comparator.comparing(
                                                                                        Employee::getSalary
                                                                                )
                                                                        ),
                                                                emp -> emp.map(Employee::getName)
                                                                        .orElse(null)
                                                        )
                                        )
                        )
        );
        
    }
}
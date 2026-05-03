package advance.class_based;

import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() { return name; }
    public String getDepartment() { return department; }
    public int getSalary() { return salary; }
}

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
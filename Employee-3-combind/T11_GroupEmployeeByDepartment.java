package com.java8.coding;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class T11_GroupEmployeeByDepartment {

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(101, "Alice", 30, "Female", "HR", 2012, 25000.0));
        empList.add(new Employee(102, "Bob", 35, "Male", "IT", 2010, 50000.0));
        empList.add(new Employee(103, "Charlie", 28, "Male", "Finance", 2015, 30000.0));
        empList.add(new Employee(104, "Diana", 26, "Female", "IT", 2018, 45000.0));
        empList.add(new Employee(105, "Eve", 32, "Female", "Finance", 2013, 30000.0));

        Map<String, List<Employee>> groupedByDept = empList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println("Results: " + groupedByDept);

        groupedByDept.forEach((dept, employees) -> {
            System.out.println(dept + " -> " + employees);
        });
    }
}

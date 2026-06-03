package com.java8.coding;

import java.util.*;
import java.util.stream.*;

public class T17_CountByDepartment {
    public static void main(String[] args) {

    	List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, "Alice", 30, "Female", "HR", 2012, 25000.0));
        empList.add(new Employee(102, "Bob", 35, "Male", "IT", 2010, 50000.0));
        empList.add(new Employee(103, "Charlie", 28, "Male", "Finance", 2015, 30000.0));
        empList.add(new Employee(104, "Diana", 26, "Female", "IT", 2018, 45000.0));
        empList.add(new Employee(105, "Eve", 32, "Female", "Finance", 2013, 30000.0));
        
       

        Map<String, Long> countByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(countByDept);
    }
}

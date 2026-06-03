package com.java8.coding;

import java.util.*;
import java.util.stream.*;

public class T31_OldestEmployee {
    public static void main(String[] args) {


  	  List<Employee> empList = new ArrayList<>();
        
        empList.add(new Employee(101, "Alice", 30, "Female", "HR", 2012, 25000.0));
        empList.add(new Employee(102, "Bob", 35, "Male", "IT", 2010, 50000.0));
        empList.add(new Employee(103, "Charlie", 28, "Male", "Finance", 2015, 30000.0));
        empList.add(new Employee(104, "Diana", 26, "Female", "IT", 2018, 45000.0));
        empList.add(new Employee(105, "Eve", 32, "Female", "Finance", 2013, 30000.0));
        

        Employee oldestEmployee = empList.stream()
                .max(Comparator.comparingInt(Employee::getAge))
                .orElse(null);

        System.out.println("Oldest Employee:");
        System.out.println(oldestEmployee);
    }
}

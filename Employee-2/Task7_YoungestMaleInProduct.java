package com.java15question;

import java.util.*;
import java.util.stream.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Task7_YoungestMaleInProduct {

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(101, "Alice", 30, "Female", "HR", 2012, 25000.0));
        empList.add(new Employee(102, "Bob", 35, "Male", "IT", 2010, 50000.0));
        empList.add(new Employee(103, "Charlie", 28, "Male", "Product Development", 2015, 30000.0));
        empList.add(new Employee(104, "Diana", 26, "Female", "IT", 2018, 45000.0));
        empList.add(new Employee(105, "Eve", 32, "Female", "Finance", 2013, 30000.0));
        empList.add(new Employee(106, "Frank", 24, "Male", "Product Development", 2017, 15000.0));
        empList.add(new Employee(107, "Alice", 27, "Female", "HR", 2016, 25000.0));

        Optional<Employee> youngest = empList.stream()
                .filter(e -> e.getGender().equalsIgnoreCase("Male"))
                .filter(e -> e.getDepartment().equalsIgnoreCase("Product Development"))
                .min(Comparator.comparingInt(Employee::getAge));

        youngest.ifPresent(System.out::println);
    }
}
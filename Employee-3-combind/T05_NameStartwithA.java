package com.java8.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class T05_NameStartwithA {

	public static void main(String[] args) {
		//Task 9: Print employee names whose names start with a given letter, e.g. 'A'
		List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(101, "Alice", 30, "Female", "HR", 2012, 25000.0));
        empList.add(new Employee(102, "Bob", 35, "Male", "IT", 2010, 50000.0));
        empList.add(new Employee(103, "Charlie", 28, "Male", "Product Development", 2015, 30000.0));
        empList.add(new Employee(104, "Diana", 26, "Female", "IT", 2018, 45000.0));
        empList.add(new Employee(105, "Eve", 32, "Female", "Finance", 2013, 30000.0));
		

		List<String> namesWithA = empList.stream()
			    .map(Employee::getName)
			    .filter(name -> name.startsWith("A"))
			    .collect(Collectors.toList());
		System.out.println(namesWithA);
		
		
	}

}

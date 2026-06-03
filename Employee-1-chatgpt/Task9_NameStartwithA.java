package com.java8.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task9_NameStartwithA {

	public static void main(String[] args) {
		//Task 9: Print employee names whose names start with a given letter, e.g. 'A'
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Alice", "HR", 55000),
			    new Employee(102, "Bob", "IT", 70000),
			    new Employee(103, "Charlie", "IT", 80000),
			    new Employee(104, "David", "Finance", 60000),
			    new Employee(105, "Eve", "HR", 60000)
			);
		

		List<String> namesWithA = employees.stream()
			    .map(Employee::getName)
			    .filter(name -> name.startsWith("A"))
			    .collect(Collectors.toList());
		System.out.println(namesWithA);
		
		
	}

}

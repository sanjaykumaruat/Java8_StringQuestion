package com.java8.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task15_IncrementSalaryBy10Percent {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Alice", "HR", 55000),
			    new Employee(102, "Bob", "IT", 70000),
			    new Employee(103, "Charlie", "IT", 80000),
			    new Employee(104, "Anil", "Finance", 20000),
			    new Employee(104, "David", "Finance", 60000),
			    new Employee(105, "Eve", "HR", 60000)
			);
		
		
		List<Employee> result=employees.stream()
				                    .map( e -> new Employee(e.getId() , e.getName(),e.getDepartment(),e.getSalary() *1.10 ))
				                    .collect(Collectors.toList());
		
		result.forEach(System.out::println);
	}

}

package com.java8.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
////Task 1: Get names of all employees in IT department.
public class Task1_AllEmployee_In_IT {
	
	public static void main(String[] args) {
		
		List<Employee> empList = Arrays.asList(
			    new Employee(101, "Alice", "HR", 55000),
			    new Employee(102, "Bob", "IT", 70000),
			    new Employee(103, "Charlie", "IT", 80000),
			    new Employee(104, "David", "Finance", 60000),
			    new Employee(105, "Eve", "HR", 65000)
			);
		
			
			List<String> result = empList.stream().filter(e -> e.getDepartment().equalsIgnoreCase("IT"))
					.map(Employee::getName).collect(Collectors.toList());

			System.out.println("all employee in IT department are :" + result);
		
		
		
	}
}

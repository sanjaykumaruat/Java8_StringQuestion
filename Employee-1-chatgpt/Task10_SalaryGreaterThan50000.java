package com.java8.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task10_SalaryGreaterThan50000 {

	public static void main(String[] args) {
		
		//Task 10: Check if any employee has salary > 50000
		
		
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Alice", "HR", 55000),
			    new Employee(102, "Bob", "IT", 70000),
			    new Employee(103, "Charlie", "IT", 80000),
			    new Employee(104, "David", "Finance", 60000),
			    new Employee(105, "Eve", "HR", 60000)
			);
		
		  Boolean result= employees.stream().anyMatch( e -> e.getSalary() > 5000);
		  System.out.println(" resullt :" + result);
		
		
		
	}

}

package com.java8.employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task8_DuplicateSalary {

	public static void main(String[] args) {
		//Task 8: Find duplicate salaries
		
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Alice", "HR", 55000),
			    new Employee(102, "Bob", "IT", 70000),
			    new Employee(103, "Charlie", "IT", 80000),
			    new Employee(104, "David", "Finance", 60000),
			    new Employee(105, "Eve", "HR", 60000)
			);
		
		 Map<Double, Long> result= employees.stream().collect(Collectors.groupingBy(Employee::getSalary , Collectors.counting()));
		 
		 
		 System.out.println(result);
		 Map<Double, Long> duplicateSalaries = result.entrySet()
			        .stream()
			        .filter(entry -> entry.getValue() > 1)
			        .collect(Collectors.toMap(
			                Map.Entry::getKey,
			                Map.Entry::getValue));

			System.out.println("Duplicate Salaries: " + duplicateSalaries);
		

	}

}

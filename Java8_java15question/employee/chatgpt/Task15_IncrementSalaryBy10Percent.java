package com.employee.chatgpt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task15_IncrementSalaryBy10Percent {
//9. Increase salary by 10% for all employees
	
public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Alice", "HR", 55000),
			    new Employee(102, "Bob", "IT", 70000),
			    new Employee(103, "Charlie", "IT", 80000),
			    new Employee(104, "David", "Finance", 60000),
			    new Employee(105, "Eve", "HR", 60000)
			);
		List<Employee> updated = employees.stream()
			    .map(e -> new Employee(e.getId(), e.getName(), e.getDepartment(), e.getSalary() * 1.10))
			    .collect(Collectors.toList());

			updated.forEach(System.out::println);

}
}

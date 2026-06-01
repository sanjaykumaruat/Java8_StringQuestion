package com.employee.chatgpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//Find duplicate employee names (if any)

public class Task18_DuplicateEmployeeNames {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Alice", "HR", 55000),
			    new Employee(102, "Bob", "IT", 70000),
			    new Employee(103, "Eve", "IT", 80000),
			    new Employee(104, "David", "Finance", 60000),
			    new Employee(105, "Eve", "HR", 60000)
			);
		Map<String, Long> nameCount = employees.stream()
			    .collect(Collectors.groupingBy(Employee::getName, Collectors.counting()));

			nameCount.entrySet().stream()
			    .filter(entry -> entry.getValue() > 1)
			    .forEach(entry -> System.out.println("Duplicate name: " + entry.getKey()));

		
}
}

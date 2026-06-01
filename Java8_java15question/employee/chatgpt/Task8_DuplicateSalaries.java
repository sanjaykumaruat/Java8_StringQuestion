package com.employee.chatgpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//2. Find duplicate salaries

public class Task8_DuplicateSalaries {
public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Alice", "HR", 55000),
			    new Employee(102, "Bob", "IT", 70000),
			    new Employee(103, "Charlie", "IT", 80000),
			    new Employee(104, "David", "Finance", 60000),
			    new Employee(105, "Eve", "HR", 60000)
			);
		Map<Double, Long> salaryFrequency = employees.stream()
			    .collect(Collectors.groupingBy(Employee::getSalary, Collectors.counting()));

			salaryFrequency.entrySet().stream()
			    .filter(e -> e.getValue() > 1)
			    .forEach(e -> System.out.println("Salary: " + e.getKey() + ", Count: " + e.getValue()));

		
}
}

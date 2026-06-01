package com.employee.chatgpt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//ask 6: Sort employees by salary descending
public class Task6_SortBySalaryDescending {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(101, "Alice", "HR", 55000),
				new Employee(102, "Bob", "IT", 70000), new Employee(103, "Charlie", "IT", 80000),
				new Employee(104, "David", "Finance", 60000), new Employee(105, "Eve", "HR", 65000));
		
		List<Employee> sortedBySalaryDesc = employees.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());

		sortedBySalaryDesc.forEach(System.out::println);

	}
}

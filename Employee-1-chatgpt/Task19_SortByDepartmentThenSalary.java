package com.java8.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
//Sort employees by department and then by salary (ascending).
public class Task19_SortByDepartmentThenSalary {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Alice", "HR", 55000),
			    new Employee(102, "Bob", "IT", 70000),
			    new Employee(103, "Eve", "IT", 80000),
			    new Employee(104, "David", "Finance", 60000),
			    new Employee(105, "Eve", "HR", 60000)
			);
		
		List<Employee> result= employees.stream()
				                 .sorted(Comparator.comparing(Employee::getDepartment).thenComparing(Employee::getSalary))
		                         .collect(Collectors.toList());
		
		result.forEach(System.out::println);
		

	}

}

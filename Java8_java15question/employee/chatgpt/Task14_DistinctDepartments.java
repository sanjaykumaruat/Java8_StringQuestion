package com.employee.chatgpt;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
//8. Find distinct departments

public class Task14_DistinctDepartments {
public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Alice", "HR", 55000),
			    new Employee(102, "Bob", "IT", 70000),
			    new Employee(103, "Charlie", "IT", 80000),
			    new Employee(104, "David", "Finance", 60000),
			    new Employee(105, "Eve", "HR", 60000)
			);
		
		List<String> departments = employees.stream()
			    .map(Employee::getDepartment)
			    .distinct()
			    .collect(Collectors.toList());

			System.out.println("Departments: " + departments);

}
}

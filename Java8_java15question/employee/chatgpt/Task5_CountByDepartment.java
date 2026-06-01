package com.employee.chatgpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//Task 5: Count number of employees in each department
public class Task5_CountByDepartment {
public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Alice", "HR", 55000),
			    new Employee(102, "Bob", "IT", 70000),
			    new Employee(103, "Charlie", "IT", 80000),
			    new Employee(104, "David", "Finance", 60000),
			    new Employee(105, "Eve", "HR", 65000)
			);
		
		
		Map<String, Long> countByDept = employees.stream()
			    .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));

		System.out.println("Employee Count by Department: " + countByDept);

}
}
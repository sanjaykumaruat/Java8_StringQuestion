package com.employee.chatgpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
// Group employees by department
public class Task3_GroupByDepartment {
public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Alice", "HR", 55000),
			    new Employee(102, "Bob", "IT", 70000),
			    new Employee(103, "Charlie", "IT", 80000),
			    new Employee(104, "David", "Finance", 60000),
			    new Employee(105, "Eve", "HR", 65000)
			);
		
	
	
	Map<String, List<Employee>> groupedByDept = employees.stream()
		    .collect(Collectors.groupingBy(Employee::getDepartment));

		groupedByDept.forEach((dept, empList) -> {
		    System.out.println(dept + " -> " + empList);
		});

}
}

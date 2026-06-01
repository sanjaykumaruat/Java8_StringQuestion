package com.employee.chatgpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
//10. Convert List<Employee> to Map<Id, Name>

public class Task16_ConvertToMapIdName {
public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Alice", "HR", 55000),
			    new Employee(102, "Bob", "IT", 70000),
			    new Employee(103, "Charlie", "IT", 80000),
			    new Employee(104, "David", "Finance", 60000),
			    new Employee(105, "Eve", "HR", 60000)
			);
		Map<Integer, String> idNameMap = employees.stream()
			    .collect(Collectors.toMap(Employee::getId, Employee::getName));

			System.out.println("ID -> Name Map: " + idNameMap);

		
}
}

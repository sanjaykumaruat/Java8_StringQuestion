package com.java8.employee;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task5_employees_in_each_department {

	public static void main(String[] args) {
		// Count number of employees in each department

		List<Employee> empList1 = Arrays.asList(new Employee(101, "Alice", "HR", 55000),
				new Employee(102, "Bob", "IT", 70000), new Employee(103, "Charlie", "IT", 80000),
				new Employee(104, "David", "Finance", 60000), new Employee(105, "Eve", "HR", 65000));
  
		Map<String, Long> result= empList1.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		
		System.out.println(result);
		result.forEach((dept, count) -> {System.out.println(dept + " ->  "+ count);}
				
				
				
				);

	}

}

//IT:2
//HR: 2
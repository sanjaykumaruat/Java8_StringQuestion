package com.java8.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task7_SecondHeighestSalary {
  // Task 7: Find the second highest salary employee
	public static void main(String[] args) {
		
		
		List<Employee> empList1 = Arrays.asList(new Employee(101, "Alice", "HR", 55000),
				new Employee(102, "Bob", "IT", 70000), new Employee(103, "Charlie", "IT", 80000),
				new Employee(104, "David", "Finance", 60000), new Employee(105, "Eve", "HR", 65000));

		
		Employee salary= empList1.stream()
				                  .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
				                  .skip(2)
				                  .findFirst()
				                  .orElse(null);
		
		System.out.println(salary);
	}

}

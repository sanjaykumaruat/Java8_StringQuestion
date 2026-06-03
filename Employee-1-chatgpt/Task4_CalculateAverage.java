package com.java8.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task4_CalculateAverage {

	public static void main(String[] args) {
		// Task 4: Calculate average salary of all employees

		List<Employee> empList1 = Arrays.asList(new Employee(101, "Alice", "HR", 55000),
				new Employee(102, "Bob", "IT", 70000), new Employee(103, "Charlie", "IT", 80000),
				new Employee(104, "David", "Finance", 60000), new Employee(105, "Eve", "HR", 65000));

		Double averageSalary = empList1.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		System.out.println("average salary : " + averageSalary);

	}

}

package com.java8.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class T24_SalaryGreaterThan50000 {

	public static void main(String[] args) {

		// Task 10: Check if any employee has salary > 50000

		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(101, "Alice", 30, "Female", "HR", 2012, 25000.0));
		empList.add(new Employee(102, "Bob", 35, "Male", "IT", 2010, 50000.0));
		empList.add(new Employee(103, "Charlie", 28, "Male", "Finance", 2015, 30000.0));
		empList.add(new Employee(104, "Diana", 26, "Female", "IT", 2018, 45000.0));
		empList.add(new Employee(105, "Eve", 32, "Female", "Finance", 2013, 30000.0));

		Boolean result = empList.stream().anyMatch(e -> e.getSalary() > 5000);
		System.out.println(" resullt :" + result);

	}

}

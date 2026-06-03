package com.java8.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task2_HeighestSalary {

	public static void main(String[] args) {
		List<Employee> empList = Arrays.asList(
			    new Employee(101, "Alice", "HR", 55000),
			    new Employee(102, "Bob", "IT", 70000),
			    new Employee(103, "Charlie", "IT", 80000),
			    new Employee(104, "David", "Finance", 60000),
			    new Employee(105, "Eve", "HR", 65000)
			);
		
		
		Employee secSalary= empList.stream().max(Comparator.comparingDouble(Employee::getSalary)).orElse(null);
		
		System.out.println("second salary" +  secSalary);
		

	}

}

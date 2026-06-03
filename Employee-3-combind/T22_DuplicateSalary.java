package com.java8.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class T22_DuplicateSalary {

	public static void main(String[] args) {
		//Task 8: Find duplicate salaries
		
		 List<Employee> empList = new ArrayList<>();

	        empList.add(new Employee(101, "Alice", 30, "Female", "HR", 2012, 25000.0));
	        empList.add(new Employee(102, "Bob", 35, "Male", "IT", 2010, 50000.0));
	        empList.add(new Employee(103, "Charlie", 28, "Male", "Product Development", 2015, 30000.0));
	        empList.add(new Employee(104, "Diana", 26, "Female", "IT", 2018, 45000.0));
	        empList.add(new Employee(105, "Eve", 32, "Female", "Finance", 2013, 30000.0));
		
		 Map<Double, Long> result= empList.stream().collect(Collectors.groupingBy(Employee::getSalary , Collectors.counting()));
		 
		 
		 System.out.println(result);
		 Map<Double, Long> duplicateSalaries = result.entrySet()
			        .stream()
			        .filter(entry -> entry.getValue() > 1)
			        .collect(Collectors.toMap(
			                Map.Entry::getKey,
			                Map.Entry::getValue));

			System.out.println("Duplicate Salaries: " + duplicateSalaries);
		

	}

}

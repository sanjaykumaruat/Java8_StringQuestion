package com.java8.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
////Task 1: Get names of all employees in IT department.
public class T01_AllEmployee_In_IT {
	
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(101, "Alice", 30, "Female", "HR", 2012, 25000.0));
        empList.add(new Employee(102, "Bob", 35, "Male", "IT", 2010, 50000.0));
        empList.add(new Employee(103, "Charlie", 28, "Male", "Finance", 2015, 30000.0));
        empList.add(new Employee(104, "Diana", 26, "Female", "IT", 2018, 45000.0));
       
			List<String> result = empList.stream().filter(e -> e.getDepartment().equalsIgnoreCase("IT"))
					.map(Employee::getName).collect(Collectors.toList());

			System.out.println("all employee in IT department are :" + result);
		
		
		
	}
}

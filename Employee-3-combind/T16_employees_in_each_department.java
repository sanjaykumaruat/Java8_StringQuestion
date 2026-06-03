package com.java8.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class T16_employees_in_each_department {

	public static void main(String[] args) {
		// Count number of employees in each department

		List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(101, "Alice", 30, "Female", "HR", 2012, 25000.0));
        empList.add(new Employee(102, "Bob", 35, "Male", "IT", 2010, 50000.0));
        empList.add(new Employee(103, "Charlie", 28, "Male", "Finance", 2015, 30000.0));
        empList.add(new Employee(104, "Diana", 26, "Female", "IT", 2018, 45000.0));
        empList.add(new Employee(105, "Eve", 32, "Female", "Finance", 2013, 30000.0));
  
		Map<String, Long> result= empList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		
		System.out.println(result);
		result.forEach((dept, count) -> {System.out.println(dept + " ->  "+ count);}
				
				
				
				);

	}

}

//IT:2
//HR: 2
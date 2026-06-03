package com.java8.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class T08_MinSalaryInFinance {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee(101, "Alice", 30, "Female", "HR", 2012, 25000.0));
		empList.add(new Employee(102, "Bob", 35, "Male", "IT", 2010, 50000.0));
		empList.add(new Employee(103, "Charlie", 28, "Male", "Finance", 2015, 30000.0));
		empList.add(new Employee(104, "Diana", 26, "Female", "IT", 2018, 45000.0));
		empList.add(new Employee(105, "Eve", 32, "Female", "Finance", 2013, 30000.0));
		
		       Employee minSalary= empList.stream()
				           .filter( e-> e.getDepartment().equalsIgnoreCase("Finance"))
				           .min(Comparator.comparingDouble(Employee::getSalary))
				           .orElse(null);              
		
		        System.out.println(minSalary);
		        
		        Employee maxSalary= empList.stream()
				           .filter( e-> e.getDepartment().equalsIgnoreCase("Finance"))
				           .max(Comparator.comparingDouble(Employee::getSalary))
				           .orElse(null);              
		
		        System.out.println(maxSalary);

	}

}

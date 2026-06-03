package com.java8.coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


//Task 6: Sort employees by salary descending
public class T19_Sort_employees {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(101, "Alice", 30, "Female", "HR", 2012, 25000.0));
        empList.add(new Employee(102, "Bob", 35, "Male", "IT", 2010, 50000.0));
        empList.add(new Employee(103, "Charlie", 28, "Male", "Product Development", 2015, 30000.0));
        empList.add(new Employee(104, "Diana", 26, "Female", "IT", 2018, 45000.0));
        empList.add(new Employee(105, "Eve", 32, "Female", "Finance", 2013, 30000.0));

		
		  List<Employee>  result=  empList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
		 // System.out.println(result);

		   result.forEach(System.out::println);
		   
		   
		  List<Employee> listDescending = empList.stream()
	                .sorted(Comparator.comparing(Employee::getSalary).reversed())
	                .toList();
	        System.out.println(listDescending);
		 
		
	}

}
	//output: 80000, 70000,
package com.java8.employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


//Task 6: Sort employees by salary descending
public class Tesk6_Sor_employees {

	public static void main(String[] args) {

		List<Employee> empList1 = Arrays.asList(new Employee(101, "Alice", "HR", 55000),
				new Employee(102, "Bob", "IT", 70000), new Employee(103, "Charlie", "IT", 80000),
				new Employee(104, "David", "Finance", 60000), new Employee(105, "Eve", "HR", 65000));

		
		  List<Employee>  result=  empList1.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).collect(Collectors.toList());
		 // System.out.println(result);

		   result.forEach(System.out::println);
		   
		   
		  List<Employee> listDescending = empList1.stream()
	                .sorted(Comparator.comparing(Employee::getSalary).reversed())
	                .toList();
	        System.out.println(listDescending);
		 
		
	}

}
	//output: 80000, 70000,
package com.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeStreamExample {

	public static void main(String[] args) {

		List<Employee1> employees = Arrays.asList(

				new Employee1(101, "Sanjay", "Product", "Bangalore"),
				new Employee1(102, "Rahul", "Support", "Hyderabad"),
				new Employee1(103, "Neha", "Product", "Bangalore"),
				new Employee1(104, "Amit", "Testing", "Pune"));

		// Filter employees who work in Product Team
		// and located in Bangalore

		List<Employee1> result = employees.stream().filter(
				emp -> emp.getTeam().equalsIgnoreCase("Product") && emp.getLocation().equalsIgnoreCase("Bangalore"))
				.collect(Collectors.toList());

		// Print Result
		result.forEach(System.out::println);
	}
}

package com.employee.chatgpt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//1. Find the second highest salary employee
public class Task7_SecondHighestSalaryEmployee {
	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Alice", "HR", 55000),
			    new Employee(102, "Bob", "IT", 70000),
			    new Employee(103, "Charlie", "IT", 80000),
			    new Employee(104, "David", "Finance", 60000),
			    new Employee(105, "Eve", "HR", 65000)
			);
	
		Employee secondHighest = employees.stream()
			    .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
			    .skip(1)
			    .findFirst()
			    .orElse(null);

			System.out.println("Second Highest Salary: " + secondHighest);


}
}

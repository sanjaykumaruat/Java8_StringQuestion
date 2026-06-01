package com.employee.chatgpt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//Task 2: Find employee with highest salary
public class Task2_HighestSalaryEmployee {
	public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Alice", "HR", 55000),
			    new Employee(102, "Bob", "IT", 70000),
			    new Employee(103, "Charlie", "IT", 80000),
			    new Employee(104, "David", "Finance", 60000),
			    new Employee(105, "Eve", "HR", 65000)
			);
		
		Employee highestPaid = employees.stream()
			    .max(Comparator.comparingDouble(Employee::getSalary))
			    .orElse(null);

			System.out.println("Highest Paid Employee: " + highestPaid);
	
}
}

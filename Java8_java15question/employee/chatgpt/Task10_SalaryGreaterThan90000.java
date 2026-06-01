package com.employee.chatgpt;

import java.util.Arrays;
import java.util.List;

public class Task10_SalaryGreaterThan90000 {

//4. Check if any employee has salary > 90000
public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Alice", "HR", 55000),
			    new Employee(102, "Bob", "IT", 70000),
			    new Employee(103, "Charlie", "IT", 80000),
			    new Employee(104, "David", "Finance", 60000),
			    new Employee(105, "Eve", "HR", 60000)
			);
		boolean hasHighEarner = employees.stream()
			    .anyMatch(e -> e.getSalary() > 90000);

			System.out.println("Any employee with salary > 90000? " + hasHighEarner);

}
}

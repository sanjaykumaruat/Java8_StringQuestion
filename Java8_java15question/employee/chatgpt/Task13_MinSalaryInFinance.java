package com.employee.chatgpt;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
//7. Find employee with minimum salary in Finance department

public class Task13_MinSalaryInFinance {
public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Alice", "HR", 55000),
			    new Employee(102, "Bob", "IT", 70000),
			    new Employee(103, "Charlie", "IT", 80000),
			    new Employee(104, "David", "Finance", 60000),
			    new Employee(105, "Eve", "HR", 60000)
			);
		
		Employee minInFinance = employees.stream()
			    .filter(e -> e.getDepartment().equalsIgnoreCase("Finance"))
			    .min(Comparator.comparingDouble(Employee::getSalary))
			    .orElse(null);

			System.out.println("Min Salary in Finance: " + minInFinance);

}
}

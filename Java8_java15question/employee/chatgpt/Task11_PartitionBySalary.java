package com.employee.chatgpt;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task11_PartitionBySalary {
//5. Partition employees based on salary > 65000
	
public static void main(String[] args) {
		
		List<Employee> employees = Arrays.asList(
			    new Employee(101, "Alice", "HR", 55000),
			    new Employee(102, "Bob", "IT", 70000),
			    new Employee(103, "Charlie", "IT", 80000),
			    new Employee(104, "David", "Finance", 60000),
			    new Employee(105, "Eve", "HR", 60000)
			);
		
		
		Map<Boolean, List<Employee>> partitioned = employees.stream()
			    .collect(Collectors.partitioningBy(e -> e.getSalary() > 65000));

			System.out.println("Salary > 65000: " + partitioned.get(true));
			System.out.println("Salary <= 65000: " + partitioned.get(false));

}
}

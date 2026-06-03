package com.java8.employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task17_NameWithMoreThanOneVowel {
	public static void main(String[] args) {
	List<Employee> employees = Arrays.asList(
		    new Employee(101, "Alice", "HR", 55000),
		    new Employee(102, "Bob", "IT", 70000),
		    new Employee(103, "Charlie", "IT", 80000),
		    new Employee(104, "David", "Finance", 60000),
		    new Employee(105, "Eve", "HR", 60000)
		);
	
	List<Employee> withMoreThan1Vowel = employees.stream()
		    .filter(e -> {
		        long count = e.getName().toLowerCase().chars()
		            .filter(ch -> "aeiou".indexOf(ch) >= 0)
		            .count();
		        return count > 1;
		    })
		    .collect(Collectors.toList());

		System.out.println("Employees with >1 vowel in name: " + withMoreThan1Vowel);

}
}

package com.employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Java8Program {

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		
		empList.add(new Employee(101,"siva",101,"active",2000));
		empList.add(new Employee(102,"reddy",101,"active",5000));
		empList.add(new Employee(103,"raju",102,"inactive",6000));
		empList.add(new Employee(104,"shivam",102,"inactive",4000));
		empList.add(new Employee(105,"bob",103,"active",3500));
		empList.add(new Employee(106,"alice",103,"inactive",3500));
		empList.add(new Employee(107,"shinu",104,"active",3500));
		
		
       //Q1 - print employee details based on department
		Map<Integer, List<Employee>> empListBasedOnDepartment= empList.stream().collect(Collectors.groupingBy(Employee :: getDepID, Collectors.toList()));
		
		//iterate value
		empListBasedOnDepartment.entrySet().forEach(entry -> {
			System.out.println(entry.getKey() + "----" + entry.getValue());
			
		});
		System.out.println("---------------------------");
		
		//Q2 - print employee count working in each department
		Map<Integer, Long> empcountDept = empList.stream().collect(Collectors.groupingBy(Employee::getDepID, Collectors.counting()));
		//iterate value
		empcountDept.entrySet().forEach(entry -> {
		System.out.println(entry.getKey() + "----" + entry.getValue());
		});
	
		//Q3- active and inactive employee in given collection
		
		long activeEmployee= empList.stream().filter(e-> "active".equals(e.getStatus())).count();
		long inactiveEmployee= empList.stream().filter(e-> "inactive".equals(e.getStatus())).count();
		System.out.println("active employee count is" +" "  + activeEmployee);
		System.out.println("active employee count is" + " " + inactiveEmployee);
		
		//Q4- print max-min employee salaryfrom the given collections
		Optional<Employee> emp1= empList.stream().max(Comparator.comparing(Employee:: getSalary));
		Optional<Employee> emp2= empList.stream().min(Comparator.comparing(Employee:: getSalary));
		System.out.println(emp1);
		System.out.println(emp2);
		
		
		//Q5 WAP to print the max salary of an employee from each department.
		Map<Integer, Optional<Employee>> topsalaryEmpDeptwise = empList.stream().collect(Collectors.groupingBy(Employee:: getDepID, Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));
		//iterate value
		topsalaryEmpDeptwise.entrySet().forEach(entry -> {
				System.out.println(entry.getKey() + "----" + entry.getValue());
		});
			
		
	}
}

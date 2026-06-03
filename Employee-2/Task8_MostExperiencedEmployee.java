package com.java15question;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task8_MostExperiencedEmployee {

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();

        empList.add(new Employee(111, "Jiya Brain", 32, "Female", "HR", 2011, 25000.0));
        empList.add(new Employee(122, "Paul Nikushi", 25, "Male", "Sales and Marketing", 2015, 13500.0));
        empList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        empList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        empList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        empList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account and Finance", 2010, 27000.0));

        Employee senior = empList.stream()
                .min(Comparator.comparingInt(Employee::getYearofjoining))
                .orElse(null);

        System.out.println("Most Experienced Employee:");
        System.out.println(senior);
    }
}
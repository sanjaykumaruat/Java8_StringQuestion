package com.java15question;

import java.util.*;
import java.util.stream.*;

public class Task8_MostExperiencedEmployee {
    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(111, "Jiya brain", 32, "Female","HR", 2011, 25000.0));
        empList.add(new Employee(122, "Paul Nikushi", 25, "Male","Sales and Marketing", 2015, 13500.0));
        empList.add(new Employee(133, "Martin Theron", 29, "Male","Infractructure", 2012, 18000.0));
        empList.add(new Employee(144, "Murali Gowda", 28, "Male","Product Development", 2014, 32500.0));
        empList.add(new Employee(155, "Nima Roy", 27, "Female","HR", 2013, 22700.0));
        empList.add(new Employee(166, "Iqbal Hussain", 43, "Male","Security And Transport", 2016, 10500.0));
        empList.add(new Employee(177, "Manu Sharma", 35, "Male","Account and Finance", 2010, 27000.0));
        empList.add(new Employee(188, "Wang Liu", 31, "Male","Product development", 2015, 34500.0));
        empList.add(new Employee(199, "Aneliazoe", 24, "Female","Sales and Marketing", 2016, 11500.0));
        empList.add(new Employee(200, "Jaden dow", 38, "Male","Security and Transport", 2015, 11000.0));
        empList.add(new Employee(211, "Jasna kaur", 37, "Female","Infractructure", 2011, 25000.0));
        empList.add(new Employee(222, "Nitin joshi", 25, "Male","Product Development", 2016, 28200.0));
        empList.add(new Employee(233, "Jyothi reddy", 27, "Female","Account and Finance", 2013, 21300.0));
        empList.add(new Employee(244, "Nicolous Dane", 24, "Male","Sales and Marketing", 2017, 10700.0));
        empList.add(new Employee(255, "Ali baig", 23, "Male","Infractructure", 2018, 12700.0));
        empList.add(new Employee(266, "Sanvi Pandey", 26, "Female","Product development", 2015, 28900.0));
        empList.add(new Employee(277, "Anuj chettiar", 31, "Male","Product development", 2011, 25000.0));

        Employee senior = empList.stream().min(Comparator.comparingInt(Employee::getYearofjoining)).get();
        System.out.println(senior);
    }
}

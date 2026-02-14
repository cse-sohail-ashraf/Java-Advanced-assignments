/**
 * 
 */
package com.capgemini.advance1.caseStudy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 */
public class EmployeeUtility {
	public static void create() {
		List<Employee> employeeList = Arrays.asList(
				new Employee(101,"sohail","IT","Dveloper",90000,2),
				new Employee(102, "Amit", "IT", "Senior Developer", 120000, 5),
			    new Employee(103, "Neha", "QA", "Test Engineer", 70000, 3),
			    new Employee(104, "Rahul", "HR", "HR Executive", 60000, 4),
			    new Employee(105, "Priya", "Finance", "Accountant", 80000, 6),
			    new Employee(106, "Ankit", "IT", "Tech Lead", 140000, 8),
			    new Employee(107, "Kiran", "Support", "Support Engineer", 55000, 2),
			    new Employee(108, "Meena", "Marketing", "Marketing Manager", 95000, 7)
		);
		
		Double averageSalary = employeeList.stream()
				.mapToDouble(Employee::getSalary)
				.average()
				.orElse(0.0);
		System.out.println("Average Salary Of All Employees: " + averageSalary);
		
		int highestSalary = employeeList.stream().mapToInt(Employee::getSalary).max().orElse(0);
		System.out.println("Maximum Salary: " + highestSalary);
		
		List<Employee> above80KSalaryList = employeeList.stream()
				.filter(e -> e.getSalary() > 80000)
				.collect(Collectors.toList());
		above80KSalaryList.forEach(System.out::println);;
		
		Map<String,Long> noOfEmpInDept = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		noOfEmpInDept.forEach((key,val) -> {
			System.out.println(key + ": " + val);
		});
		
		List<Employee> employeeItList = employeeList.stream()
				.filter(e -> e.getDepartment().equals("IT"))
				.filter(e -> e.getYearsOfExperience() > 5)
				.collect(Collectors.toList());
		System.out.println(employeeItList);
		
		
	}
}
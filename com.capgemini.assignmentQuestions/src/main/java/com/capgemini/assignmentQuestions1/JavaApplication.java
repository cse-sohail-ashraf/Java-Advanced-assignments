/**
 * 
 */
package com.capgemini.assignmentQuestions1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 
 */
public class JavaApplication {
	public static void execution() {
		List<Person> people = Arrays.asList(
			new Student(101,"sohail","CSE",2),
			new Student(102, "Aamir", "ECE", 3),
		    new Student(103, "Riya", "IT", 1),
		    new Student(104, "Neha", "CSE", 4),
		    new Student(106, "Priya", "EEE", 3),
		    new Student(107, "Arjun", "CIVIL", 1),
		    new Student(108, "Kiran", "CSE", 2),
		    new Student(109, "Anjali", "IT", 4),
		    new Faculty(201, "Dr. Sharma", "Physics", 10),
            new Faculty(202, "Dr. Mehta", "CSE", 12),
            new Faculty(203, "Dr. Rao", "Maths", 8),
            new Student(105, "Rahul", "Physics", 2),
            new Faculty(204, "Dr. Singh", "IT", 15)
		);
				
	
		List<String> namesList = people.stream().sorted(Comparator.comparing(Person::getName))
		.map(Person::getName).collect(Collectors.toList());
		System.out.println(namesList);
		
		Map<String,Long> deptCountMap = people.stream()
				.collect(Collectors.groupingBy(Person::getDepartment,Collectors.counting()));
		deptCountMap.forEach((key,val) -> {
			System.out.println(key + " " + val);
		});
		Map.Entry<String,Long> maxDept = deptCountMap.entrySet().stream()
				.max(Map.Entry.comparingByValue()).get();
		System.out.println(maxDept.getKey() + "-> " + maxDept.getValue());
		
		boolean checkFaculty = people.stream().filter(p -> p instanceof Faculty).anyMatch(p -> p.getDepartment().equalsIgnoreCase("Physics"));
		System.out.println(checkFaculty);
		
		people.stream().map(Person::getDepartment).distinct().forEach(System.out::println);
		people.stream()
	      .sorted(Comparator.comparingInt(Person::getYearsOfAssociation).reversed())
	      .limit(3)
	      .forEach(p ->
	          System.out.println(p.getName() + " -> " + p.getYearsOfAssociation())
	      );
		
		Map<Boolean,Long> partitionedCount = people.stream()
				.collect(Collectors.partitioningBy(
						p -> p instanceof Student,
						Collectors.counting()));
		System.out.println("Students: " + partitionedCount.get(true));
		System.out.println("Faculty: " + partitionedCount.get(false));

	}
}

package com.ip.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectorsClassExample {

	public static void main(String[] args) {
		/*
		 * Examples of using the predefined collectors to perform common mutable reduction tasks:
		 * 
		 *1. Accumulate names into a List
		  List<String> list = people.stream().map(Person::getName).collect(Collectors.toList());
		 * 
		 * 
		 * 2. Accumulate name to a TreeSet
		 * Set<String> set = people.stream().map(Person::getName).collect(Collectors.toCollection(TreeSet::new));
		 * 
		 * 
		 * 3. Convert elements to Strings and concatenate them, separated by commas
		 * String joined = things.stream().map(Object::toString).collect(Collectors.joining(",");
		 * 
		 * 
		 * 4. Compute sum of salaries of employee
		 * int total = employees.stream().collect(Collectors.summingInt(Employee::getSalary)));
		 * 
		 * 5. Group employees by department
		 * Map<Department,List<Employee>> byDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		 * 
		 * 6. Compute sum of salaries by department
		 * Map<Department, Integer> totalByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
		 * Collectors.summingInt(Employee::getSalary)));
		 * 
		 * 8. Partition students into passing or failing
		 * Map<Boolean,List<Student>> passingFailing = students.stream().collect(Collectors.partitioningBy(s ->s.getGrade() 
		 * >= PASS_THRESHOLD));
		 * 
		 * 
		 * 
		 */
		
	}
}

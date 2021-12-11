package com.ip.java8;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionExample_Testclass_1 {

	public static void main(String[] args) {
		 List < String > courses = Arrays.asList("C", "C++", "Core Java", "J2EE", "Spring", "Hibernate", "Python");

		 System.out.println("JDK 8 streaming example lambda expression");
		 courses.stream().forEach(course -> printCourse(course));
		 
		 System.out.println("JDK 8 streaming example method reference");
		 courses.stream().forEach(LambdaExpressionExample_Testclass_1::printCourse);
		 
		 System.out.println("JDK 8 for each with lambda");
		 courses.forEach(course -> printCourse(course));
		 
		 System.out.println("JDK 8 for each with method reference");
		 courses.forEach(LambdaExpressionExample_Testclass_1::printCourse);
		 
	}
	
	private static void printCourse(String Cname) {
		System.out.println("Course name: "+ Cname);
	}
}

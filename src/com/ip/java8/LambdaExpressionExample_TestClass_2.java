package com.ip.java8;

import java.util.HashMap;
import java.util.Map;

public class LambdaExpressionExample_TestClass_2 {

	public static void main(String[] args) {
		 Map < Integer, String > coursesMap = new HashMap < Integer, String > ();
	        coursesMap.put(1, "C");
	        coursesMap.put(2, "C++");
	        coursesMap.put(3, "Java");
	        coursesMap.put(4, "J2EE");
	        coursesMap.put(5, "Python");
	        coursesMap.put(6, "Scala");
	     
	        System.out.println("using k,v:");
	     coursesMap.forEach((k,v)->printCourse(k, v));
	     
	     System.out.println("using method Reference ");
	     coursesMap.forEach(LambdaExpressionExample_TestClass_2::printCourse);
	}
	
	private static void printCourse(Integer num,String val) {
		System.out.println("course no: "+num+" course name: "+val);
	}
}

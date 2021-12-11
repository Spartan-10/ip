package com.ip.java8;

@FunctionalInterface
interface addition {

	int add(int a,int b);
	
	//FunctionalInterface  can have any number of default, static methods
	
	default void m1() {
		System.out.println("default m1");
	}
	
	static void m2() {
		System.out.println("static m2");
	}
	
	//FunctionalInterface can also declare methods of object class. If we override java.Lang.Object class's method as an abstract method,
	//which does not count as an abstract method by Functional Interface.
	
	@Override
	boolean equals(Object obj);
}

public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		addition t = (a,b)->a+b;
		
		System.out.println(t.add(5, 10));
	}
}

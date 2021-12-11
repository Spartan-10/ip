package com.ip.java8;

import java.util.function.Predicate;

public class PredicateInteraceExample {

	public static void main(String[] args) {
		Predicate<Integer> isLessThan = i -> (i<=20);
		
		System.out.println(isLessThan.test(10));
		System.out.println(isLessThan.test(40));
		
	}
}

package com.ip.java8;

// WAP to multiply 2 no's using Functional interface
public class MultiplyNums {

	public static void main(String[] args) {
		
		MultiplyInterface total = (a,b)->a*b;
		
		System.out.println(total.multiply(6, 7));
	}
}

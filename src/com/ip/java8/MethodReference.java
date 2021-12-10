package com.ip.java8;


interface Measure{
	public int length(String string);
}


public class MethodReference {

	public static void main(String[] args) {
		
		Measure m = String::length;
		System.out.println(m.length("abc"));
	}
}

package com.ip.java8;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		
//		StringJoiner joiner = new StringJoiner(".");
		
		StringJoiner joiner = new StringJoiner(".", "prefix-", "-suffix");
		
		for(String s : "Hello to interviwer".split(" ")) {
			joiner.add(s);
		}
		System.out.println(joiner);
	}
}

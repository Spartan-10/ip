package com.ip.ArraysQuestions;

import java.util.Arrays;
import java.util.Comparator;

//Find two numbers with a maximum sum formed by digits of an array
public class TestClass_10 {

	public static void main(String[] args) {
		Integer[] input = { 4, 6, 2, 7, 9, 8 };
		 
        findMaximum(input);
	}

	private static void findMaximum(Integer[] input) {
		
		Arrays.sort(input, Comparator.reverseOrder());
		
		int x=0;
		for (int i = 0; i < input.length; i=i+2) {
			x=x*10+input[i];
		}
		
		int y=0;
		for (int i = 1; i < input.length; i=i+2) {
			y=y*10+input[i];
		}
		
		System.out.println("The two numbers are "+x+" and "+y);
	}
}

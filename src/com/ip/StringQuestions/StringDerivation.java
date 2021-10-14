package com.ip.StringQuestions;

//Check if a given string can be derived from another string by circularly rotating it.
//The rotation can be in a clockwise or anti-clockwise rotation.
public class StringDerivation {

	public static void main(String[] args) {
		String X="ABCD";
		String Y="DABC";
		
		if(check(X,Y)) {
			System.out.println("Given String can be derived from each other");
		}else {
			System.out.println("Given String cannot be dervied from each other");
		}
	}

	private static boolean check(String x, String y) {
		if(x.length() != y.length()) {
			return false;
		}
		
		for(int i=0;i<x.length();i++) {
			x=x.substring(1)+x.charAt(0);
			
			if(x.compareTo(y)==0) {
				return true;
			}
		}
		return false;
	}
}

package com.ip.StringQuestions;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String[] args) {
		String str = "String Reverse";
		System.out.println(printReverseString(str));
	}

	private static String printReverseString(String str) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(char c : str.toCharArray()) {
			stack.push(c);
		}
		String res = "";
		while(!stack.empty()) {
			res+=stack.pop();
		}
		
		return res;
	}
}

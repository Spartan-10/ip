package com.ip.StringQuestions;

import java.util.Stack;

public class BalanceExpression {

	public static void main(String[] args) {

		String exp = "{()}[{}]";

		if (balExp(exp)) {
			System.out.println("The Expression is Balanced");
		} else {
			System.out.println("The Expression is Not Balanced");
		}
	}

	private static boolean balExp(String exp) {
		if (exp.length() % 2 == 1)
			return false;

		Stack<Character> stack = new Stack<Character>();

		for (char c : exp.toCharArray()) {
			if (c == '{' || c == '(' || c == '[') {
				stack.push(c);
			} else {
				if (stack.empty()) {
					return false;
				}

				char top = stack.pop();

				if ((top == '{' && c != '}') || (top == '(' && c != ')') || (top == '[' && c != ']')) {
					return false;
				}
			}
		}
		return stack.empty();
	}
}

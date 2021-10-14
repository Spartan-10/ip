package com.ip.StringQuestions;

import java.util.Stack;

public class EvalPostFixExpression {
	
	public static void main(String[] args) {
		String exp = "138x+";
        System.out.println(evalPostfix(exp));
	}

	private static int evalPostfix(String exp) {
		
		Stack<Integer> stack = new Stack<>();
		
		for(char c : exp.toCharArray()) {
			if (Character.isDigit(c)) {
				stack.push(c-'0');
			}
			else {
				int x = stack.pop();
				int y = stack.pop();
				
				if(c == '+') {
					stack.push(y+x);
				}else if ( c == '-') {
					stack.push(y-x);
				}else if (c == 'x') {
					stack.push(y*x);
				}else if (c == '/') {
					stack.push(y/x);
				}
			}
		}
		
		return stack.pop();
	}

}

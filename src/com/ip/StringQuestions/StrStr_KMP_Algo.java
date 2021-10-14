package com.ip.StringQuestions;

public class StrStr_KMP_Algo {

	public static void main(String[] args) {
		String X = "Techie Delight - Ace the Technical Interviews";
		String Y = "AAe";

		System.out.println("The index of the first occurance of Y in X is: "+ strstr(X, Y));
	}

	private static int strstr(String X, String Y) {

		if(Y==null || Y.length()==0) {
			return 0;
		}
		
		if(X == null || Y.length() > X.length()) {
			return -1;
		}
		
		char[] chars = Y.toCharArray();
		
		int[] next = new int[Y.length()+1];
		
		for(int i=1;i<Y.length();i++) {
			int j = next[i+1];
			while(j>0 && chars[j]!=chars[i]) {
				j=next[j];
			}
			
			if(j>0 || chars[j]==chars[i]) {
				next[i+1]=j+1;
			}
		}
		
		for(int i=0,j=0;i<X.length();i++) {
			if(j<Y.length() && X.charAt(i)== Y.charAt(j)) {
				if(++j == Y.length()) {
					return (i-j+1);
				}
			}
			else if(j>0) {
				j=next[j];
				i--;
			}
		}
		
		return -1;
	}
}

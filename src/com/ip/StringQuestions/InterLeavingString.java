package com.ip.StringQuestions;

import java.util.HashSet;
import java.util.Set;


// Find all InterLeaving of given strings that can be formed from all the characters of the first
// and second string where the order of is preserved 
public class InterLeavingString {
	
	public static void main(String[] args) {
		String X = "ABC";
		String Y = "ACB";
		
		Set<String> resultString = new HashSet<String>();
		
		findInterLeavings("",X,Y,resultString);
		
		System.out.println(resultString);
		
	}

	private static void findInterLeavings(String currentString, String x, String y, Set<String> resultString) {
		
		if(x.length() == 0 && y.length() == 0 ) {
			resultString.add(currentString);
			return;
		}
		
		if(x.length() > 0) {
			findInterLeavings(currentString+x.charAt(0), x.substring(1), y, resultString);
		}
		
		if(y.length() > 0) {
			findInterLeavings(currentString+y.charAt(0), x, y.substring(1), resultString);
		}
		
	}

}

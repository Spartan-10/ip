package com.ip.StringQuestions;

import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("techie delight", "tech", "techie",
                "technology", "technical");
		
		System.out.println("The Longest Common Prefix is = "+LCS(words));
	}

	private static String LCS(List<String> words) {
		
		int inputListSize = words.size();
		if( inputListSize == 0) {
			return "";
		}
		
		if(inputListSize == 1) {
			return words.get(inputListSize-1);
		}
		
		Arrays.sort(words.toArray());
		
		int minLength = Math.min(words.get(0).length(), words.get(inputListSize-1).length());
		
		int i=0;
		while(i<minLength && words.get(0).charAt(i)==words.get(inputListSize-1).charAt(i))
			i++;
		
		String prefix = words.get(0).substring(0,i);
		return prefix;
	}
}

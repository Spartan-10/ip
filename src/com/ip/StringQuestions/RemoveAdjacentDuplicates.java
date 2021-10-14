package com.ip.StringQuestions;

// Given a String Remove adjacent duplicates characters from it. In Other words,
// Remove all consecutive same characters except one
public class RemoveAdjacentDuplicates {

	public static void main(String[] args) {

		String s = "AAABBCDDD";

		System.out.println(removeDup(s.toCharArray()));
	}

	private static String removeDup(char[] charArray) {

		char previousChar = '\0';
		int k = 0;

		for (char ch : charArray) {

			if (previousChar != ch) {
				charArray[k++] = ch;
				previousChar = ch;
			}
		}

		return new String(charArray).substring(0, k);
	}
}

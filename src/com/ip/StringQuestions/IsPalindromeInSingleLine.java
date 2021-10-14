package com.ip.StringQuestions;

//determine given string is palindrome or not
//Interview question --> write Recursive code in Single line
public class IsPalindromeInSingleLine {

	public static void main(String[] args) {
		String str = "XYBYBYX";

		if (isPalindrome(str, 0, str.length() - 1)) {
			System.out.print("Palindrome");
		} else {
			System.out.print("Not Palindrome");
		}
	}

	private static boolean isPalindrome(String str, int low, int high) {

		return (low >= high) || (str.charAt(low) == str.charAt(high) && isPalindrome(str, low + 1, high - 1));
	}
}

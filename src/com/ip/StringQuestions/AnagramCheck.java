package com.ip.StringQuestions;

import java.util.HashMap;
import java.util.Map;

//determine-if-two-strings-are-anagram-or-not
//String X and Y are anagrams if by rearranging the letters of X, we can get Y using all the Original letters of X exactly once.
public class AnagramCheck {

	public static void main(String[] args) {
		String X = "tommarvoloriddle"; // Tom Marvolo Riddle
		String Y = "iamlordvoldemort"; // I am Lord Voldemort

		if (isAnagram(X, Y)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not an Anagram");
		}
	}

	private static boolean isAnagram(String x, String y) {
		if (x.length() != y.length()) {
			return false;
		}

		Map<Character, Integer> freqX = new HashMap<Character, Integer>();
		for (char c : x.toCharArray()) {
			freqX.put(c, freqX.getOrDefault(c, 0) + 1);
		}

		Map<Character, Integer> freqY = new HashMap<Character, Integer>();
		for (char c : y.toCharArray()) {
			freqY.put(c, freqY.getOrDefault(c, 0) + 1);
		}

		return freqX.equals(freqY);
	}
}

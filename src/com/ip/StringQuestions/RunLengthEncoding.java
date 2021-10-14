package com.ip.StringQuestions;

// Run Length Encoding Data Compression Algo 
// ABCD —> 1A1B1C1D
// PTR --> Output Size will be double the input size in the worst case so the algorithm can't run in-place e.g ABCD —> 1A1B1C1D
public class RunLengthEncoding {

	public static void main(String[] args) {

		String inputString = "ABBCCCD";

		System.out.println(encode(inputString));
	}

	private static String encode(String inputString) {

		String outputString = "";
		int count = 0;

		for (int i = 0; i < inputString.length(); i++) {
			count = 1;
			while (i + 1 < inputString.length() && inputString.charAt(i) == inputString.charAt(i + 1)) {
				count++;
				i++;
			}
			outputString += String.valueOf(count) + inputString.charAt(i);
		}

		return outputString;
	}
}

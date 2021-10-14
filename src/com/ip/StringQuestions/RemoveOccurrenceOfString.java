package com.ip.StringQuestions;


// Given a String, in-place remove all occurrence of AB and C from it.
public class RemoveOccurrenceOfString {

	public static void main(String[] args) {
		
//		String str = "ABCACBCAABB";
		String str = "CBAABCAB";
		
		str = removeOccurrence(str);
		
		System.out.printf("The string after removal of 'AB' and 'C' is '%s'", str);
		
	}

	private static String removeOccurrence(String str) {
		char [] chars = str.toCharArray();
		
		int i=0,k=0;
		
		while(i<str.length()) {
			if(chars[i] == 'B' && (k>0 && chars[k-1]=='A') ) {
				--k;
				++i;
			}else if(chars[i] == 'C') {
				++i;
			}else {
				chars[k++] = chars[i++];
			}
		}
		
		return new String(chars).substring(0,k);
	}
}

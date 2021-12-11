package com.ip.ArraysQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindlargestSubsequenceformedbyconsecutiveintegers {

	public static void main(String[] args) {
		int[] A = { 2, 0, 6, 1, 5, 3, 7 };

		System.out.println("The length of the maximum consecutive subsequence is " + findMaxLenSubseq(A));
	}

	private static int findMaxLenSubseq(int[] a) {

		Set<Integer> set = IntStream.of(a).boxed().collect(Collectors.toSet());
		List<Integer> result = new ArrayList<Integer>();
		
		int maxLen = 0;

		for (int e : a) {
			List<Integer> list = new ArrayList<Integer>();
			if (!set.contains(e - 1)) {
				int len = 1;
				list.add(e);

				while (set.contains(e + len)) {
					list.add(e + len);
					len++;
				}

				if (len > maxLen) {
					maxLen = Math.max(maxLen, len);
					result.addAll(list);
				}

			}
		}
		System.out.println(result);

		return maxLen;
	}
}

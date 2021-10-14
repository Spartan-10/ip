package com.ip.ArraysQuestions;

import java.util.HashMap;
import java.util.Map;

public class TestClass_1 {

	public static void main(String[] args) {
		int[] A = { 8, 7, 2, 5, 3, 1 };
        int sum = 10;
 
        findPair(A, sum);
	}

	private static void findPair(int[] a, int sum) {
		
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int i=0;i<a.length;i++) {
			if(map.containsKey(sum-a[i])) {
				System.out.println("Sum found at "+map.get(sum-a[i])+" and "+i);
				return;
			}
			map.put(a[i], i);
		}
		
		System.out.println("Pair Not Found");
	}
}

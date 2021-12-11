package com.ip.ArraysQuestions;

import java.util.HashSet;

/*
 * The idea is to consider every subarray and keep track of the largest subarray found so far, formed by consecutive integers. 
 * For a subarray to contain consecutive integers,
 * 1. The difference between the maximum and minimum element in it should be exactly equal to the subarray’s length minus one.
 * 2. All elements in the array should be distinct
 */
public class FindlargestSubarrayformedbyconsecutiveintegers {

	public static void main(String[] args) {
//		int[] A = { 2, 0, 2, 1, 4, 3, 1, 0 };
		int[] A = {1, 56, 58, 57, 90, 92, 94, 93, 91, 45};
//		int[] A = {10, 12, 12, 10, 10, 11, 10};
		
		findMaxSubArray(A);
	}

	private static void findMaxSubArray(int[] a) {
		int max_len =1;
		int start =0,end=0;
		
		
		for (int i = 0; i < a.length-1; i++) {
			HashSet<Integer> hashSet = new HashSet<Integer>();
			hashSet.add(a[i]);
			int mn = a[i],mx=a[i];
			
			for (int j = i+1; j < a.length; j++) {
				
				if(hashSet.contains(a[j]))
					break;
				
				hashSet.add(a[j]);
				mn = Math.min(mn, a[j]);
				mx = Math.max(mx, a[j]);
				
				if((mx-mn) == j-i && max_len < mx-mn+1) {
					max_len = Math.max(max_len, mx-mn+1);
					start = i;
					end = j;
				}
			}
		}
		System.out.println("The largest Subarray is of length : "+max_len);
		for(int i =start;i<=end;i++) {
			System.out.print(a[i]+" ");
		}
	}
}

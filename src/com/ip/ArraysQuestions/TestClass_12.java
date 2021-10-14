package com.ip.ArraysQuestions;

import java.util.Arrays;

//find-pair from given array having minimum-absolute-sum
public class TestClass_12 {

	public static void main(String[] args) {
		 int[] A = { -6, -5, -3, 0, 2, 4, 9 };
		 
	        findPair(A);
	}

	private static void findPair(int[] A) {
		
		Arrays.sort(A);
		
		int min=Integer.MAX_VALUE;
		int i=0,j=0;
		int low=0,high=A.length-1;
		
		while(low < high) {
			if (Math.abs(A[low]+A[high]) < min) {
				min = Math.abs(A[low]+A[high]);
				i=low;
				j=high;
			}
			
			if(min == 0) {
				break;
			}
			
			if (A[low]+A[high] < 0) {
				low++;
			}
			else {
				high--;
			}
		}
		
		System.out.println("Pair found at ("+A[i]+","+A[j]+") and min Sum is "+min);
	}
}

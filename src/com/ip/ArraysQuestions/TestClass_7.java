package com.ip.ArraysQuestions;

import java.util.Arrays;

//find-pairs with given-difference-k-array-constant-space-solution
public class TestClass_7 {

	public static void main(String[] args) {
		int[] A = { 1, 5, 2, 2, 2, 5, 5, 4 };
        int diff = 3;
 
       if(!findPair(A, diff)) {
    	   System.out.println("Pair not found");
       }
	}

	private static boolean findPair(int[] a, int diff) {
		
		Arrays.sort(a);
		int i=0,j=0;
		int n= a.length;
		boolean foundpair = false;
		while(i<n && j<n) {
			while(i<n-1 && a[i] == a[i+1]) {
				i++;
			}
			
			while (j<n-1 && a[j] == a[j+1]) {
				j++;
			}
			
			if(a[j]-a[i] > diff) {
				i++;
			}
			else if(a[j]-a[i] < diff) {
				j++;
			}
			else {
				System.out.println("Pair found ("+ a[i] +","+a[j]+")");
				foundpair=true;
				i++;
				j++;
			}
		}
		
		return foundpair;
	}
}

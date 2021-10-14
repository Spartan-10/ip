package com.ip.ArraysQuestions;

import java.util.HashSet;
import java.util.Set;

//find the minimum index of the repeating element
public class TestClass_11 {

	public static void main(String[] args) {
		int[] A = { 5, 6, 3, 4, 3, 6, 4 };
		 
        int minIndex = findMinIndex(A);
 
        if (minIndex != A.length) {
            System.out.print("The minimum index of the repeating element is " +
                    minIndex);
        }
        else {
            System.out.print("Invalid Input");
        }
	}

	private static int findMinIndex(int[] a) {
		int minIndex=0;
		
		Set<Integer> set = new HashSet<Integer>();
		
		for (int i = a.length-1; i>=0; i--) {
			if(set.contains(a[i])) {
				minIndex=i;
			}
			set.add(a[i]);
		}
		return minIndex;
	}
}

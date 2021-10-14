package com.ip.ArraysQuestions;

import java.util.Arrays;

//move-zeros-present-array-end
public class TestClass_4 {

	public static void main(String[] args) {
		int[] A = { 6, 0, 8, 2, 3, 0, 4, 0, 1 };
		 
        partition(A);
        System.out.println(Arrays.toString(A));
	}

	private static void partition(int[] a) {
		int pivot=0;
		int j=0;
		
		for (int i=0;i<a.length;i++) {
			if(a[i] != pivot) {
				swap(a,i,j);
				j++;
			}
		}
		
	}

	private static void swap(int[] a, int i, int j) {
		int temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}

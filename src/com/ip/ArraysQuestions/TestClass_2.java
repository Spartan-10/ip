package com.ip.ArraysQuestions;

import java.util.Arrays;

public class TestClass_2 {

	public static void main(String[] args) {
		int[] A = { 0, 0, 1, 0, 1, 1, 0, 1, 0, 0 };
		 
        sort(A);
 
        // print the rearranged array
        System.out.println(Arrays.toString(A));
	}

	private static void sort(int[] a) {
		int pivot = 1;
		int j=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]<pivot) {
				swap(a,i,j);
				j++;
			}
		}
		
	}

	private static void swap(int[] a, int i, int j) {
		int element = a[i];
		a[i]=a[j];
		a[j]=element;
	}
}

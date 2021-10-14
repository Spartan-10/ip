package com.ip.ArraysQuestions;

import java.util.Arrays;

//sort-array-using-one-swap
public class TestClass_5 {

	public static void main(String[] args) {
		int[] a = { 3, 5, 6, 9, 8, 7 };
		 
        sortArray(a);
        System.out.println(Arrays.toString(a));
	}

	private static void sortArray(int[] a) {
		int x=-1,y=-1;
		int prev = a[0];
		
		for(int i=1;i<a.length;i++) {
			if(prev>a[i]) {
				if(x==-1) {
					x=i-1;
					y=i;
				}else {
					y=i;
				}
			}
			prev=a[i];
		}
		swap(a,x,y);
	}

	private static void swap(int[] a, int x, int y) {
		int temp=a[x];
		a[x]=a[y];
		a[y]=temp;
		
	}
}

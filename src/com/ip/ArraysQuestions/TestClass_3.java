package com.ip.ArraysQuestions;

import java.util.ArrayList;
import java.util.List;

public class TestClass_3 {

	public static void main(String[] args) {
		int[] A = { 0, -3, 5, -4, -2, 3, 1, 0 };
		 
        equilibriumIndex(A);
	}

	private static void equilibriumIndex(int[] a) {
		
		int left[] = new int[a.length];
		
		left[0]=0;
		
		for(int i=1;i<a.length;i++) {
			left[i]=left[i-1]+a[i-1];
		}
		
		int right=0;
		
		List<Integer> indices = new ArrayList<>();
		for(int i=a.length-1;i>=0;i--) {
			
			if(right==left[i]) {
				indices.add(i);
			}
			right+=a[i];
		}
		
		System.out.println("Equilibrium Index found at "+ indices);
	}
}

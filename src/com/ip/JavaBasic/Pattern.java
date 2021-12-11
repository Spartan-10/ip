package com.ip.JavaBasic;

import java.util.Arrays;

public class Pattern {

	public static void main(String[] args) {
		int n = 5;
			    char[] a = new char[n];
			    Arrays.fill(a, ' ');
			    for (int i = n-1; i >= 0; i--) {
			        a[i] = '#';
			        System.out.println(new String(a));
			    }
	}
}

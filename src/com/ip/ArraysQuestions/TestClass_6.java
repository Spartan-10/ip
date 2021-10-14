package com.ip.ArraysQuestions;

//maximum-product-subset-problem
public class TestClass_6 {

	public static void main(String[] args) {
		int[] A = { -6, 4, -5, 8, -10, 0, 8 };

		System.out.print("The maximum product of a subset is " + findMaxProduct(A, A.length));
	}

	private static int findMaxProduct(int[] a, int length) {

		if (length == 0) {
			return 0;
		}

		if (length == 1) {
			return a[0];
		}
		int product = 1;
		int negative = 0, positive = 0;
		int abs_min_so_far = Integer.MAX_VALUE;
		boolean contains_zeros = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				negative++;
				abs_min_so_far = Integer.min(abs_min_so_far, Math.abs(a[i]));
			} else if (a[i] > 0) {
				positive++;
			}

			if (a[i] == 0) {
				contains_zeros = true;
			} else {
				product = product * a[i];
			}
		}

		if ((negative & 1) != 0) {
			product = product / -abs_min_so_far;
		}

		if (negative == 1 && positive == 0 && contains_zeros) {
			product = 0;
		}

		return product;
	}
}

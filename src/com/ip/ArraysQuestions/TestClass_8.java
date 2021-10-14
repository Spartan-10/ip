package com.ip.ArraysQuestions;

//find-minimum-difference-index-two-given-elements-present-array
public class TestClass_8 {

	public static void main(String[] args) {
		int[] A = { 1, 3, 5, 4, 8, 2, 4, 3, 6, 5 };
        int x = 2, y = 5;
 
        int diff = findMinDifference(A, x, y);
 
        if (diff != Integer.MAX_VALUE) {
            System.out.print("The minimum difference is " + diff);
        }
        else {
            System.out.print("Invalid input");
        }
	}

	private static int findMinDifference(int[] A, int x, int y) {
		int n=A.length;
		int x_index=n,y_index=n;
		int min_diff = Integer.MAX_VALUE;
		
		for (int k = 0; k < A.length; k++) {
			if(A[k]==x) {
				x_index=k;
				if(y_index != n) {
					min_diff = Integer.min(min_diff, Math.abs(x_index-y_index));
				}
			}
			
			if(A[k]==y) {
				y_index=k;
				if (x_index != n) {
					min_diff = Integer.min(min_diff, Math.abs(x_index-y_index));
				}
			}
		}
		return min_diff;
	}
}

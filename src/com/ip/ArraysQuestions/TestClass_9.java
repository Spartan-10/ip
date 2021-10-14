package com.ip.ArraysQuestions;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//partition-array-into-two-sub-arrays-with-same-sum
public class TestClass_9 {

	public static void main(String[] args) {
		int[] arr = { 6, -4, -3, 2, 3 };
		 
        // get index `i` that points to the starting of the second subarray
        int i = partition(arr);
 
        if (i != -1)
        {
            // print the first subarray, `arr[0, i-1]`
            printSubarray(arr, 0, i - 1);
 
            // print the second subarray, `arr[i, arr.length)`
            printSubarray(arr, i, arr.length - 1);
        }
        else {
            System.out.print("The array can't be partitioned");
        }
	}

	private static void printSubarray(int[] arr, int i, int j) {
		System.out.println(IntStream.range(i, j+1)
				.mapToObj(k-> arr[k])
				.collect(Collectors.toList()));
	}

	private static int partition(int[] arr) {
		int total_sum = Arrays.stream(arr).sum();
		int sum_so_far=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(sum_so_far == total_sum - sum_so_far) {
				return i;
			}
			sum_so_far +=arr[i];
		}
		return -1;
	}
}

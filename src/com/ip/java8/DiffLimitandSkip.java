package com.ip.java8;

import java.util.Arrays;
import java.util.List;

// What's the difference b/w limit() and skip() ?
public class DiffLimitandSkip {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4, 5, 6, 8, 23, 35, 36, 77, 78, 99);

		// Limit --> The Limit method is an intermediate operation that returns a stream
		// not longer than the requested size.
		// the n parameter can't not be negative.
		list.stream().limit(7).forEach(x -> System.out.println(x));

		// Skip --> The Skip method is another intermediate operation that discards the
		// first n elements of stream.
		// The n parameter can't be negative and if its higher than the size of the
		// stream, skip() returns an empty stream.
		list.stream().skip(7).forEach(x -> System.out.println(x));

		long min_sum_long = list.stream().sorted().limit(4).mapToLong(Integer::intValue).sum();
		long max_sum_long = list.stream().sorted().skip(1).mapToLong(Integer::intValue).sum();
		int min_sum_int = list.stream().sorted().limit(4).mapToInt(Integer::intValue).sum();
		int max_sum_int = list.stream().sorted().skip(1).mapToInt(Integer::intValue).sum();
		System.out.println("Long="+ min_sum_long + " " + max_sum_long);
		System.out.println("Int="+ min_sum_int + " " + max_sum_int);
	}
}

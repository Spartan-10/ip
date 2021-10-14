package com.ip.java8;

import java.util.Arrays;
import java.util.List;

// What's the difference b/w limit() and skip() ?
public class DiffLimitandSkip {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(4,5,6,8,23,35,36,77,78,99);
		
		// Limit --> The Limit method is an intermediate operation that returns a stream not longer than the requested size.
		//the n parameter can't not be negative.
		list.stream().limit(7).forEach(x->System.out.println(x));
		
		
		// Skip --> The Skip method is another intermediate operation that discards the first n elements of stream.
		// The n parameter can't be negative and if its higher than the size of the stream, skip() returns an empty stream.
		list.stream().skip(7).forEach(x->System.out.println(x));
		
	}
}

package com.ip.java8;

import java.util.Random;

public class DisplayTenRandomNumber {

	public static void main(String[] args) {
		(new Random()).ints().limit(10).forEach(System.out::println);
	}
}

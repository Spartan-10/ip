package com.ip.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class interviewQuestion_1 {

	public static void main(String[] args) {
		String s = "name=Megha&company=Azuga Telematics Pvt Ltd.&phone=9566&city=Blr";

		List<String> str = Arrays.asList(s.split("&"));
		System.out.println(str);

	}
}

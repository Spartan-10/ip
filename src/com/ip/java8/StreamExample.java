package com.ip.java8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//What are the ways to create a stream
public class StreamExample {

	public static void main(String[] args) {
		//1. Using Collection:
		Stream<String> fromCollection = Arrays.asList("x","y","z").stream();

		//2. Using set of values:
		Stream<String> fromVales = Stream.of("x","y","z");
		
		//3. Using Arrays:
		Stream<String> fromArrays = Arrays.stream(new String[] {"x","y","z"});
		
		//4. Using File(each line in the file will be a separate element in the stream)
		try {
			Stream<String> fromFile = Files.lines(Paths.get("input.txt"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//5. From the line
		IntStream fromline = "0123456789".chars();
		
		//6. With the help of Stream.builder()
		Stream<Object> fromBuilder = Stream.builder().add("z").add("y").add("y").build();
		
		//7. Using Stream.iterate() (Infinte):
		Stream<Integer> fromIterator = Stream.iterate(1, n ->n+1);
		
		//8. Using Stream.generate() (Infinite)
		Stream<String> fromGenerate = Stream.generate(() -> "0");
		
		
		
	}
}

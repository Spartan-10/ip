package interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestClass_1 {

	public static void main(String[] args) {
		String[] string = {"1","2","3","4"};
		
//		int[] intarr = Arrays.asList(string).stream().mapToInt(Integer::parseInt).toArray();
//		System.out.println(intarr[0]+intarr[1]+intarr[2]);
		
		List<Integer> list = Stream.of(string).map(Integer::parseInt).collect(Collectors.toList());
		System.out.println(list.get(0)+list.get(1)+list.get(2)+list.get(3));
		
	}
}

package interview;

import java.util.Arrays;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		String s = "name=Chandrabhushan&company=Oracle&phone=9566&city=Blr";

		List<String> str = Arrays.asList(s.split("&"));
		System.out.println(str);
		
//		String s1 = new String("Oracle");
//		String s2 = "Oracle";
//		
//		System.out.println(s1.equals(s2)); //true
//		System.out.println(s1.intern().equals(s2)); //true

	}
}

package com.ip.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Question = Declaring a List field with the final keyword ?
public class ip_question_1 {

	public static void main(String[] args) {
	
		final List<String> list1 = new ArrayList<String>(); // here we are initializing empty ArrayList, Not Assigning any value
		list1.add("a"); //--> List is final..it doesn't mean that..you cannot insert any value (we can insert any value)
		list1.add("b");
		System.out.println(list1);
		
//		list1 = new ArrayList<String>();  //--> since List is final...so you can't reinitialize it
		
		
		final List<String> list2 = Arrays.asList("A","B"); // here Initializing and Assigning ArrayList Simultaneously
//		list2.add("C");  // --> Now you cannot insert any new value...it will throw UnSupportedOperationException
		System.out.println(list2);
	}
	
}

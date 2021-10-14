package com.ip.StringQuestions;

import java.util.HashSet;
import java.util.Set;

//Given entry/exit logs of customers and a cyber cafe's capacity,
// find the total number of customers who could not get any computer
public class CustomersComputer {

	public static void main(String[] args) {
		

        String sequence = "ABCDDCEFFEBGAG";
        int capacity = 3;
 
        process(sequence, capacity);	
	}

	private static void process(String sequence, int capacity) {

		
		Set<Character> unattended = new HashSet<Character>();
		Set<Character> allocated = new HashSet<Character>();
		Set<Character> visited = new HashSet<Character>();
		
		for(char c : sequence.toCharArray()) {
			if(!visited.contains(c)) {
				visited.add(c);
				if(allocated.size()<capacity) {
					allocated.add(c);
				}
				else {
					unattended.add(c);
				}
			}
			else {
				visited.remove(c);
				allocated.remove(c);
			}
		}
		System.out.println(unattended);
	}
	
}

/**
* Java program illustrating usage of HashMap class methods 
* keySet(), values(), entrySet(), containsKey() 
*
**/
package com.ip.Hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("Lang", "Java");
		hm.put("Platform", "Windows");
		hm.put("Code", "HashMap");
		hm.put("Learn", "More");
		
		if(hm.containsKey("Code")) {
			System.out.println("Testing containsKey: "+hm.get("Code"));
		}
		
		Set<String> hmKeys = hm.keySet();
		System.out.println("Initial keys : "+hmKeys);
		
		Collection<String> hmValues = hm.values();
		System.out.println("Initial values : "+hmValues);
		
		Set<Map.Entry<String, String>> hmEntrySet = hm.entrySet();
		System.out.println("Initial Entry Set = "+hmEntrySet);
		
		hm.put("Search", "JavaArticals");
		
		System.out.println("New keys : "+hmKeys);
		System.out.println("New values : "+hmValues);
		System.out.println("New Entry Set = "+hmEntrySet);
		
	}
}

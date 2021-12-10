package com.ip.Hashmap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class HashMapVsHashTable {

	public static void main(String[] args) {
		
		//Hash Table
		//HT does not allow null key and null value
		//HT does not allow duplicate keys -- if you try to insert duplicate keys, it will override with new value and return old value
		//HT allows Duplicate values
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
//		ht.put(null,"value");
//		ht.put(90, null);
		ht.put(101, "One");
		ht.put(101, "Two");
		ht.put(103, "Three");
		ht.put(104, "Three");
		System.out.println("HashTable values: ");
		for(Map.Entry m : ht.entrySet()) {
			System.out.println(m.getKey()+"----"+m.getValue());
		}
		
		//HashMap
		//HashMap allows one null key and multiple null values
		//HahMap does not allow duplicate keys -- if you try to insert duplicate keys, it will override with new value and return old value
		//HashMap allows Duplicate values
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(null, "value");
		hm.put(null, "value3");
		hm.put(40, null);
		hm.put(50, null);
		hm.put(100, "OneValue");
		hm.put(100, "Twovalue");
		hm.put(104, "Four");
		hm.put(105, "Four");
		System.out.println("HashMap values: ");
		//IQUES-> since KeySet contain null value so iterator will work or not?
		Set s = hm.keySet();
		Iterator itr = s.iterator();
		System.out.println("Key Set:"+s);
		
		while(itr.hasNext()) {
			System.out.println("key: "+itr.next());
		}
		
		for(Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey()+" -- "+m.getValue());
		}
		
	}
}

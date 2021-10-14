package com.ip.ArraysQuestions;

import java.util.ArrayList;

//Q -- How can I write Custom ArrayList where i don't want to allow duplicate ?
// FYI...ArrayList Allow duplicates

public class CustomArrayList extends ArrayList {

	@Override
	public boolean add(Object o) {
		if(this.contains(o)) {
			return true;
		}
		else {
			return super.add(o);
		}
	}
	
	public static void main(String[] args) {
		
		CustomArrayList customArrayList  = new CustomArrayList();
		
		customArrayList.add(1);
		customArrayList.add(1);
		customArrayList.add(1);
		customArrayList.add(2);
		
		System.out.println(customArrayList);
		
	}
}

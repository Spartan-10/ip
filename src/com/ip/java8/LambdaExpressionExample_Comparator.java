package com.ip.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaExpressionExample_Comparator {

	public static void main(String[] args) {
		List<Person> listofPersons = new ArrayList<Person>();
		listofPersons.add(new Person("Rohit", 30));
		listofPersons.add(new Person("Kumaryas", 40));
		listofPersons.add(new Person("Namratat", 35));
		listofPersons.add(new Person("Gragnim", 45));
		listofPersons.add(new Person("Deb", 35));
		
		//without lambda expression
		//Sort list by age
		Comparator<Person> comparator = new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAge()-o2.getAge();
			}
		};
		
		Collections.sort(listofPersons, comparator);
		System.out.println("without lambda expression----Sort persons by age in ascending order: ");
		
		for (Person person : listofPersons) {
			System.out.println("Person Name: "+person.getName());
		}
		
		//with lambda expression 
		//Sort list by age
		Collections.sort(listofPersons, (Person o1, Person o2)->{
			return o1.getAge()-o2.getAge();
		});
		System.out.println("with lambda expression----Sort persons by age in ascending order: ");
		listofPersons.forEach(person -> System.out.println("Person Name: "+person.getName()));
	}
}

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}

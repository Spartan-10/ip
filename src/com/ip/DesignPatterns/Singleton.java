package com.ip.DesignPatterns;

import java.lang.reflect.Constructor;

public class Singleton implements Cloneable{
	private static Singleton soleInstance = new Singleton();

	private Singleton() {
		if (soleInstance != null) {
			throw new RuntimeException("Cannot Create...");
		}
		 System.out.println("Creating.....");
	}

	public static Singleton getInstance() {
		return soleInstance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}

class TestClass{
	public static void main(String[] args) throws Exception{
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		print("s1",s1);
		print("s2",s2);
		//Serialization Example
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/s2.ser"));
//		oos.writeObject(s2);
//		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/s2.ser"));
//		Singleton s3 = (Singleton)ois.readObject(); // here we reconstruct the object back to s3
//		
//		//Reflection
		Class clazz = Class.forName("designPatterns.Singleton");
		Constructor<Singleton> ctor = clazz.getDeclaredConstructor();
		ctor.setAccessible(true);
		Singleton s3 = ctor.newInstance();
		
//		Singleton s3 = (Singleton) s2.clone();
		print("s3",s3);
	}
	
	static void print(String name, Singleton object) {
		System.out.println(String.format("Object : %s, Hashcode: %d", name, object.hashCode()));
	}
}

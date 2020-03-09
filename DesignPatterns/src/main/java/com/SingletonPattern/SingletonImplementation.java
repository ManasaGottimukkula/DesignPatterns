package com.SingletonPattern;

public class SingletonImplementation {

	public static void main(String[] args) {
		SingletonClass s1 = SingletonClass.getInstance();
		SingletonClass s2 = SingletonClass.getInstance();
		
		System.out.println("Singleton objects");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		SingletonImplementation obj1 = new SingletonImplementation();
		SingletonImplementation obj2 = new SingletonImplementation();
		
		System.out.println("\nNon singleton objects");
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());


	}

}

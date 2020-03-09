package com.FactoryPattern;

public class Division implements Calculate{
	
	public void calculate(float a, float b) {
		System.out.println("division is "+(a/b));
	}

}

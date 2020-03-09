package com.FactoryPattern;

public class Addition implements Calculate {

	public void calculate(float a, float b) {
		System.out.println("addition is "+(a+b));
	}
}

package com.FactoryPattern;

public class CalculatorFactory {
	public Calculate operations(int choose) {
		Calculate cal = null;
		if(choose == 1) {
			cal = new Addition();
		} else if(choose == 2) {
			cal = new Subtraction();
		}else if(choose == 3) {
			cal = new Multiplication();
		}else if(choose == 4) {
			cal = new Division();
		} else {
			System.out.println("Invalid Operation!!");
		}
		return cal;
	}

}

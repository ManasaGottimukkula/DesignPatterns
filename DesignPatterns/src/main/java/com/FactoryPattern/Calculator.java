package com.FactoryPattern;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number: ");
		float num1 = sc.nextFloat();
		
		System.out.println("enter second number: ");
		float num2 = sc.nextFloat();
		System.out.println("Choose from the below operations:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
		int choose = sc.nextInt();
		CalculatorFactory factory = new CalculatorFactory();
		Calculate cal =  factory.operations(choose);
		cal.calculate(num1, num2);
		
	}
}

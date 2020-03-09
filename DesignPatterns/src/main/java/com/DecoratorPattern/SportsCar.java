package com.DecoratorPattern;

public class SportsCar extends CarDecorator{
	public SportsCar(CarModel car) {
		super(car);
	}
	
	@Override
	public void model() {
		// TODO Auto-generated method stub
		super.model();
		System.out.println("Adding Features of Sports Car");
	}
}

package com.DecoratorPattern;

public class LuxuryCar extends CarDecorator{
	public LuxuryCar(CarModel car) {
		super(car);
	}
	
	@Override
	public void model() {
		// TODO Auto-generated method stub
		super.model();
		System.out.println("Adding Features of Luxury Car");
	}
}

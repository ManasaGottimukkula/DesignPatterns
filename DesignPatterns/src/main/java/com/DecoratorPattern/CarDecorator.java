package com.DecoratorPattern;

public class CarDecorator implements CarModel {
	
	protected CarModel car;
	
	public CarDecorator(CarModel car) {
		this.car = car;
	}

	public void model() {
		// TODO Auto-generated method stub
		this.car.model();
		
	}
}

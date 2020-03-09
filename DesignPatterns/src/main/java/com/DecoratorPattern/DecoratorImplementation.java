package com.DecoratorPattern;

public class DecoratorImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicCarModel bcar = new BasicCarModel();
		System.out.println("----Sports car----");
		CarModel sportsCar = new SportsCar(bcar);
		sportsCar.model();
		System.out.println();
		
		System.out.println("----Luxury car----");
		CarModel luxuryCar = new LuxuryCar(bcar);
		luxuryCar.model();
		System.out.println();
		
		System.out.println("----Sportsluxury car---");
		CarModel sportsLuxuryCar = new SportsCar(new LuxuryCar(bcar));
		sportsLuxuryCar.model();
	}

}

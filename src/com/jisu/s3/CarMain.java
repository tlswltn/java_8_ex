package com.jisu.s3;

public class CarMain {

	public static void main(String[] args) {
		Car c = new Car();
		c.info();
		c.make();
		
		Car c2 = new Car("Black");
		c2.info();
		
		Car c3= new Car("gray","benz");
		c3.info();

	}

}

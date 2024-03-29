package com.abst;

public class AbstractEx {

	public static void main(String[] args) {
		Car car = new  AiCar();
		car.run();
		car = new ManualCar();
		car.run();					//다형성
	}
}

package com.bytecode.beans;

public class Car {

	private Engine engine;

	public Car(Engine engine) {
		System.out.println("car class 1 param constructor executed");
		this.engine = engine;
	}

	public Car() {
		System.out.println("car class 0 param constructor executed");
	}

	public void drive() {
		engine.start();
		System.out.println("Car is moving ...happy journey");

	}

	public void setEngine(Engine engine) {
		System.out.println("setter method executed");
		this.engine = engine;
	}

}

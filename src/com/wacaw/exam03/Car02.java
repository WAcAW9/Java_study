package com.wacaw.exam03;

public class Car02 {
	String model = "new car";
	String color = "white";
	
//	public Car02(String inputModel, String inputColor) {
//		model = inputModel;
//		color = inputColor;
//	}

	public Car02(String inputModel, String inputColor) {
		this.model = inputModel;
		this.color = inputColor;
	}
	
	void drive() {
		System.out.println(model + "(" + color + ")" + " driving~~~~~");
	}
	
	void printThis() {
		System.out.println("this: " + this);
	}
}

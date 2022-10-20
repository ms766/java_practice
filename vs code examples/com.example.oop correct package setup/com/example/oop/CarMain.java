package com.example.oop;

public class CarMain {
	public static void main(String[] args){
		Car bmw = new Car();
		Car kia = new Car();
		//sets model
		bmw.setModel("z4");
		//get model and print
		System.out.println("model is "+bmw.getModel());

		bmw.setModel("911");
		//get model and print
		System.out.println("model is "+bmw.getModel());
		
	}
}

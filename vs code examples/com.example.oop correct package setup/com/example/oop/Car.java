package com.example.oop;

public class Car {
	//memeber variables / fields
	//encapsulation is used to hide element in classes

	private int doors;
	private int wheels;
	
	private String model;
	private String engine;
	private String color;

	//SETTER-----------------------------------------
	//this key word refers to class members(variables)
	public void setModel(String model){
		String vaildModel = model.toLowerCase();
		if(vaildModel.equals("z4")){
			this.model = model;
		}else{
			this.model = "Unknown";
		}
		//class variable = parameter
		
	}
	//SETTER-----------------------------------------

	//GETTER------------------------------------------
	public String getModel(){
		return this.model;
	}
	//GETTER------------------------------------------

}

package com.codegnan.oopprogram;

public class car {
	String brand;
	String model;
	int year;
	public car(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;

	}
	public void displayDetails() {
		System.out.println("Brand : "+brand);
		System.out.println("model : "+model);
		System.out.println("Year: "+year);
		
	}
}



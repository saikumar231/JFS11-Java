package com.codegnan.day33;

import java.util.Scanner;

public class Car {
	private String model;
	private int year;
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getModel() {
		return model;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		Car car = new Car();
		System.out.println("Enter model of the car: ");
		String usermodel = sin.nextLine();
		car.setModel(usermodel);
		
		System.out.println("Enter year of the car: ");
		int useryear = sin.nextInt();
		car.setYear(useryear);
		
		System.out.println("Details of user car: ");
		System.out.println("Model : "+ car.getModel());
		System.out.println("Year : "+car.getYear());
		
		
	}

}

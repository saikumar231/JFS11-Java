package com.codegnan.oopprogram;

// super class of a vehicle
class Vehicle {
	// instance variable
	String brand;

	// constructor for vehicle class
	public Vehicle(String brand) {
		this.brand = brand;
		System.out.println("Vehivle class invoked");
	}

	// method to display brand of the vehicle
	public void displayBrand() {
		System.out.println("Brand: " + brand);
	}
}

// class name Bike of a subclass
class Bike extends Vehicle {
	int year;

	public Bike(String brand, int year) {
		super(brand); // call superclass constructor to intialize the brand
		this.year = year;
		System.out.println("Bike constructor");
	}

	// constructor of a car class with brand only
	public Bike(String brand) {
		this(brand, 2020);
	}
	// method to display details of Bike
	public void displayDetails() {
		super.displayBrand(); // call super class method to display brand
		System.out.println("year: "+year);
	}
}

public class Main1 {

	public static void main(String[] args) {
		Bike bike1 = new Bike("Honda",2020);
		Bike bike2 = new Bike("Tvs");
		
		System.out.println("Bike1 details: ");
		bike1.displayDetails();
		System.out.println("Bike2 details: ");
		bike2.displayDetails();
	}

}

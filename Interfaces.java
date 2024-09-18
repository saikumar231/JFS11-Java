package com.codegnan.Day21;

interface shape1 {
	public abstract double calculateArea();

	public abstract double calculateVolume();
}

class Circle1 implements shape1 {
	int radius;

// constructor class
	public Circle1(int radius) {
		super();
		this.radius = radius;
	}

// implementing method area
	public double calculateArea() {

		return Math.PI * radius * radius;
	}

	public double calculateVolume() {

		return 0;
	}

}

class Rectangle1 implements shape1 {
	double length;
	double breadth;

// constructor
	public Rectangle1(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

// implementing method of abstract
	public double calculateArea() {
		return length * breadth;
	}

	public double calculateVolume() {
		return 0;
	}

}

class Cylinder implements shape1 {
	double radius;
	double height;

	public Cylinder(double radius, double height) {
		super();
		this.radius = radius;
		this.height = height;
	}


	public double calculateArea() {
		
		return 2*Math.PI*radius*(radius*height);
	}


	public double calculateVolume() {
		
		return Math.PI*radius*radius*height;
	}

}

public class Interfaces {

	public static void main(String[] args) {
		Circle1 circle = new Circle1(5);
		System.out.println("Area of Circle : "+circle.calculateArea());
		System.out.println("Volume of Circle : "+circle.calculateVolume());
		Rectangle1 rectangle = new Rectangle1(2,3);
		System.out.println("Area of Rectabgle : "+rectangle.calculateArea());
		System.out.println("Volume of Rectangle : "+rectangle.calculateVolume());
		Cylinder cylinder = new Cylinder(3,2);
		System.out.println("Area of Cylinder : "+cylinder.calculateArea());
		System.out.println("Volume of Cylinder : "+cylinder.calculateVolume());

	}

}

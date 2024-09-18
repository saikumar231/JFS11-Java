package com.codegnan.Day21;

// abstract class 
abstract class shape {
	public abstract double calculateArea();

	public abstract double calculateVolume();
}

// circle is child class
class Circle extends shape {
	double radius;

// constructor	
	public Circle(double radius) {
		this.radius = radius;
	}

// 	implementing method
	public double calculateArea() {
		return Math.PI * radius * radius;
	}

	public double calculateVolume() {
		return 0;
	}
}

// rectangle child class
class Rectangle extends shape {
	double length;
	double breadth;

// constructor
	public Rectangle(double length, double breadth) {
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

public class volume {

	public static void main(String[] args) {
		Circle circle = new Circle(3);
		System.out.println("Circle area is : " + circle.calculateArea());
		System.out.println("Circle volume is : " + circle.calculateVolume());
		Rectangle rectangle = new Rectangle(2, 3);
		System.out.println("Rectangle area is : " + rectangle.calculateArea());
		System.out.println("Rectangle volume is : " + rectangle.calculateVolume());

	}

}

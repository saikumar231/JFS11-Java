package com.codegnan.oopprogram;

// constructors
public class Human {
// instance variables
	String name;
	int age;
	
	public Human(String name, int age) {
		
		this.name = name;
		this.age = age;
	}

	
	public static void main(String[] args) {
		// with constructor
		Human human1 = new Human("sai",18);
		System.out.println("Name: " + human1.name + " age: " + human1.age);
		
		// with out constructor	
	/*	Human human1 = new Human();
		human1.name = "sai";
		human1.age = 18;
		System.out.println("Name: " + human1.name + " age: " + human1.age);
		Human human2 = new Human();
		human2.name = "ravi";
		human2.age = 11;
		System.out.println("Name: " + human2.name + " Age: " + human2.age);
		Human human3 = new Human();
		human3.name = "kumar";
		human3.age = 21;
		System.out.println("Name: " + human3.name + " Age: " + human3.age); */

	}

}

package com.codegnan.Day19.oops;

// Inheritance with respect to type casting
class Animal { // Animal is parent class
	public void makeSound() {
		System.out.println("Same Sound....");
	}
}

class Dog extends Animal { // here dog is sub class or child class for Animal
	public void makeSound() { // makeSound() is overriding, makesSound(String s) is overloading
		System.out.println("Bark....");
	}

	public void fetching() {
		System.out.println("Fetching ball");
	}
}

class cat extends Animal { // here cat is sub class or child class for Animal
	public void makeSound() { // makeSound() is overriding, makesSound(String s) is overloading
		System.out.println("Meow...");
	}

	public void scratch() {
		System.out.println("Scratchig furniture....");
	}
}

public class Demo {

	public static void main(String[] args) {

// up casting
		Animal animal1 = new Dog(); // up casting dog to animal
		Animal animal2 = new cat(); // up casting cat to animal
		animal1.makeSound();
		animal2.makeSound();
// down casting
		if (animal1 instanceof Dog) {  // instance of returns boolean value , it will check the dog object is their or not in amial1.
			Dog dog = (Dog) animal1;  // down casting animal to dog.
			dog.fetching();
		}
		if(animal2 instanceof cat) {
			cat cat1= (cat) animal2;
			cat1.scratch();
		}
	}

}

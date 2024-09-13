package com.codegnan.oopprogram;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		
		this.name = name;
		this.age = age;
	}
	
	// copy constructor
	public Person(Person anotherPerson) {
		this.name = anotherPerson.name;
		this.age = anotherPerson.age;
	}
	//method to display person details
	public void displayDetails() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}

public class CopyConstructorDemo {

	
	public static void main(String[] args) {
		Person person1= new Person("Sai",20);
		System.out.println("person1 details : ");
		person1.displayDetails();
		
		Person person2 = new Person(person1);
		System.out.println("person2 details (Copy of person1) : ");
		person2.displayDetails();
		

	}

}

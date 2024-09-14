// getters and setters method topic
package com.codegnan.Day17;

public class person {
	// instance variables of person class
	private String name;
	private int age;
	private char gender;

	public person(String name, int age, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	// setter and getter method for name

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

// method to display person details
	public void displayDetails() {
		System.out.println("Name: " + name + "Age: " + age + "gender: " + gender);
	}

	public static void main(String[] args) {
		person person1 = new person("sai", 21, 'm');
		person1.displayDetails();

		person1.setName("sunny");
		person1.setAge(34);
		person1.setGender('m');
		person1.displayDetails();

	}

}

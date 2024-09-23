package com.codegnan.project;

public class Course {
	private String title; // title of the course
	public Course(String title) {
		this.title = title;
	}
// getter method to retrieve the course title
	public String getTitle() {
		return title; // return course title
	}
// override tostring method to provide a string representation of a course
	public String toString() {
		return title; // return the course title as per the string reprsentation
	}

	

	public static void main(String[] args) {
		

	}
	

}

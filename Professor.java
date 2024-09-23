package com.codegnan.project;

import java.util.ArrayList;
import java.util.List;

public class Professor {
	private String Name;
	private List<Course>assignCourses;
	// list to hold courses assigned to the professor
	public Professor(String name) {
		this.Name = name;
		this.assignCourses = new ArrayList();
		// initialize the list of assigned courses as an empty list
		
	}// getter method to retrive the professor name
	public String getName() {
		return Name;
	}
// method to assign a course to the professor
	public void assignCourse(Course course) {
		if(assignCourses.contains(course)) {
			assignCourses.add(course);
		}
	}



	public List<Course> getAssignedCourses() {
		return assignCourses;
	}
	
	


	@Override
	public String toString() {
		return Name;
	}
	public static void main(String[] args) {
		

	}
	public void assignCourses(Course course) {
		// TODO Auto-generated method stub
		
	}

}

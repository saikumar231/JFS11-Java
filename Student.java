package com.codegnan.project;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Course>enrolledCourses;
	
	public Student (String Name) {
		this.name=name;
		this.enrolledCourses = new ArrayList();
	}
	
	
	public String getName() {
		return name;
	}
	
	public void enrollInCourse(Course course) {
		if(!enrolledCourses.contains(course)) {
			enrolledCourses.add(course); // Add the course to the list

		}
	}
	 // Getter method to retrieve the list of courses the student is enrolled in
    public List<Course> getEnrolledCourses() {
        return enrolledCourses; // Return the list of enrolled courses
    }

    // Override toString method to provide a string representation of the student
    @Override
    public String toString() {
        return name; // Return the student's name as the string representation
    }
    public static void main(String[] args) {
    	
    }




	}

	

package com.codegnan.day36;

import java.util.function.Predicate;

public class Main{
	public static void main(String[] args) {
		// Array of integers
		int[] x= {0,5,10,15,20,25,30};
		// Predicate to check if integer is greater than 10
		Predicate <Integer> p1 = i-> i>10;
		// Predicate to check if integer is even
		Predicate <Integer> p2 = i-> i%2 ==0;
		// Printing numbers greater than 10
		System.out.println("The Numbers Greater Than 10: ");
		m1(p1,x);      // Calling method m1 with predicate p1
		// Printing even numbers
		System.out.println("The Even Numbers are: ");
		m1(p2,x);      // Calling method m1 with predicate p2
		
		// Printing numbers not greater than 10 using negate()
		System.out.println("The numbers not Greater Than 10: ");
		m1(p1.negate(),x);  // Calling method m1 with negated predicate p1
		// Printing numbers greater than 10 and even using and()
		System.out.println("The Numbers Greater Than 10 and Even are: ");
		m1(p1.and(p2),x);  // Printing numbers greater than 10 and even using and()
		// Printing numbers greater than 10 or even using or()
		System.out.println("The Numbers Greater Than 10 orEven are: ");
		m1(p1.or(p2),x);
	}

	private static void m1(Predicate<Integer> p, int[] x) {
		for(int x1:x) {
			if(p.test(x1)) {
				System.out.println(x1);
			}
		}
		
	}
}



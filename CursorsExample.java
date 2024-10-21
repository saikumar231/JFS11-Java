package com.codegnan.Day29;

import java.util.Enumeration;
import java.util.Vector;

public class CursorsExample {

	public static void main(String[] args) {
		Vector<String> vector = new Vector<>();
		vector.add("AAA");
		vector.add("BBB");
		vector.add("CCC");
		vector.add("DDD");
		vector.add("EEE");
		System.out.println(vector);
		Enumeration<String> enumeration = vector.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
			
		}
		

	}

}

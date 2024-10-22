package com.codegnan.day38;

import java.util.ArrayList;

public class ToArrayMethod {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("kiwi");
		fruits.add("mango");
		fruits.add("guava");
		
		String[] ir = fruits.stream().toArray(String[]::new);
		for(String i :ir) {
		System.out.println(i);
		}

	}

}

package com.codegnan.day38;

import java.util.ArrayList;

public class CountExample {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList();
		fruits.add("Apple");
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("Kiwi");
		fruits.add("mango");
		fruits.add("guava");

		long count = fruits.stream().filter(s -> s.length() == 5).count();
		System.out.println(count);

	}

}

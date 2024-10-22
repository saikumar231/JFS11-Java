package com.codegnan.day38;

import java.util.ArrayList;

public class MinMaxExample {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("kiwi");
		fruits.add("mango");
		fruits.add("guava");
		// default sorting
		String min = fruits.stream().min((s1, s2) -> s1.compareTo(s2)).get();
		System.out.println(min);
		String max = fruits.stream().max((s1, s2) -> s1.compareTo(s2)).get();
		System.out.println(max);
		// custom order
		String min1 = fruits.stream().min((s1, s2) -> -s1.compareTo(s2)).get();
		System.out.println(min1);
		String max1 = fruits.stream().max((s1, s2) -> -s1.compareTo(s2)).get();
		System.out.println(max1);

	}

}

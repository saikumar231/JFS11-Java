package com.codegnan.day38;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("orange");
		fruits.add("kiwi");
		fruits.add("mango");
		fruits.add("guava");
		
		List<String> defaultSorting = fruits.stream().sorted().collect(Collectors.toList());
		System.out.println("Default sorting Order : "+defaultSorting);
		
		List<String> customOrder = fruits.stream().sorted((s1,s2)-> -s1.compareTo(s2)).collect(Collectors.toList());
		System.out.println("Custom sorting order : "+customOrder);

	}

}

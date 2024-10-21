package com.codegnan.day30;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("mango");
		fruits.add("Kiwi");
		fruits.add("PineApple");
		System.out.println(fruits);
		ListIterator<String> fruitnames =  fruits.listIterator();
		System.out.println("Fruits in forward direction");
		System.out.println();
		while(fruitnames.hasNext()) {
			System.out.println(fruitnames.nextIndex()+"----->"+fruitnames.next());
		}
		System.out.println();
		System.out.println("Fruits in Backward direction");
		while(fruitnames.hasPrevious()) {
			
			System.out.println(fruitnames.previousIndex()+"----->"+fruitnames.previous());
		}
		System.out.println();
		while(fruitnames.hasNext()) {
			String names = fruitnames.next();
			if(names.equalsIgnoreCase("Banana")) {
				fruitnames.set("grapes");
			}
			if(names.equalsIgnoreCase("Kiwi")) {
				fruitnames.add("Mosambi");
			}
			if(names.equalsIgnoreCase("Pineapple")) {
				fruitnames.remove();
			}
			
		}
		System.out.println(fruits);
	}

}

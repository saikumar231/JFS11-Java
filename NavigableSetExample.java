package com.codegnan.day31;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetExample {

	public static void main(String[] args) {
		
		NavigableSet navigableset = new TreeSet();
		navigableset.add("eee");
		navigableset.add("aaa");
		navigableset.add("fff");
		navigableset.add("bb");
		navigableset.add("ddd");
		navigableset.add("ccc");
		System.out.println(navigableset);
		System.out.println(navigableset.descendingSet());
		System.out.println(navigableset.ceiling("ddd"));
		System.out.println(navigableset.higher("ddd"));
		System.out.println(navigableset.floor("ddd"));
		System.out.println(navigableset.lower("ddd"));
		System.out.println(navigableset.pollFirst());
		System.out.println(navigableset.pollLast());
		System.out.println(navigableset);

	}

}

package com.codegnan.day31;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet hashset = new LinkedHashSet();
		hashset.add("AAA");
		hashset.add("BBB");
		hashset.add("CCC");
		hashset.add("DDD");
		hashset.add("EEE");
		System.out.println(hashset);
		System.out.println(hashset.add(null));
		System.out.println(hashset);
		System.out.println(hashset.add(null));
		System.out.println(hashset);
	}

}

package com.codegnan.day27;

import java.util.ArrayList;
import java.util.Collection;

public class containsAll {

	public static void main(String[] args) {
		Collection collection1 = new ArrayList();
		collection1.add("AAA");
		collection1.add("BBB");
		collection1.add("CCC");
		collection1.add("DDD");
		System.out.println(collection1);
		Collection collection2 = new ArrayList();
		collection2.add("AAA");
		collection2.add("BBB");
		System.out.println(collection2);
		System.out.println(collection1.containsAll(collection2));

	}

}

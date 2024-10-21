package com.codegnan.day27;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Remove {

	public static void main(String[] args) {
		Collection collection = new ArrayList();
		collection.add("AAA");
		collection.add("BBB");
		collection.add("CCC");
		collection.add("DDD");
		System.out.println(collection);
		System.out.println(collection.remove("DDD"));
		System.out.println(collection);
		System.out.println(collection.remove("ee"));
		System.out.println(collection);

	}

}

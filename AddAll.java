package com.codegnan.day27;

import java.util.Collection;
import java.util.HashSet;

public class AddAll {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		hashSet.add("AAA");
		hashSet.add("BBB");
		hashSet.add("CCC");
		hashSet.add("DDD");
		System.out.println(hashSet);
		System.out.println(hashSet.add("EEE"));
		System.out.println(hashSet.add("fff"));
		Collection collection = new HashSet();
		System.out.println(collection);
		System.out.println(collection.addAll(hashSet));
		System.out.println(collection);

	}

}

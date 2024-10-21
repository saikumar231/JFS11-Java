package com.codegnan.day27;

import java.util.HashSet;

public class Add {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet();
		hashSet.add("AAA");
		hashSet.add("BBB");
		hashSet.add("CCC");
		hashSet.add("DDD");
		System.out.println(hashSet);
		System.out.println(hashSet.add("AAA"));
		System.out.println(hashSet.add("aaa"));

	}

}

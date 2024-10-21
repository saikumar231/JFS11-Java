package com.codegnan.day27;

import java.util.ArrayList;
import java.util.Collection;

public class Empty1size1Clear {

	public static void main(String[] args) {
		Collection collection1 = new ArrayList();
		collection1.add("AAA");
		collection1.add("BBB");
		collection1.add("CCC");
		collection1.add("DDD");
		System.out.println(collection1);
		collection1.clear();
		System.out.println(collection1.isEmpty());
		System.out.println(collection1.size());
	}

}

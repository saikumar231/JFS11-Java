package com.codegnan.day27;

import java.util.ArrayList;
import java.util.Collection;

public class Contains {

	public static void main(String[] args) {
		Collection collection1 = new ArrayList();
		collection1.add("AAA");
		collection1.add("BBB");
		collection1.add("CCC");
		collection1.add("DDD");
		System.out.println(collection1);
		System.out.println(collection1.contains("BBB"));
		System.out.println(collection1);
		System.out.println(collection1.contains("bbb"));
		System.out.println(collection1);

	}

}

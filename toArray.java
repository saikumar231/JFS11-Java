package com.codegnan.day27;

import java.util.ArrayList;
import java.util.Collection;

public class toArray {

	public static void main(String[] args) {
		Collection collection1 = new ArrayList();
		collection1.add("AAA");
		collection1.add("BBB");
		collection1.add("CCC");
		collection1.add("DDD");
		System.out.println(collection1);
		Object[] elements = collection1.toArray();
		for(Object obj : elements) {
			System.out.println(obj);
		}

	}

}

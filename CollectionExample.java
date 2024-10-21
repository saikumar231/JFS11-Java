package com.codegnan.day36;

import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class CollectionExample {

	public static void main(String[] args) {
		
		Collection<String>collection1 = List.of();
		Collection<String>collection2 = List.of("apple","guvva");
		Predicate<Collection>p= c->c.isEmpty();
		System.out.println(p.test(collection2));
		System.out.println(p.test(collection1));

	}

}

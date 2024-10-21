package com.codegnan.day33;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

public class ArrayDequeExample {

	public static void main(String[] args) {
		Collection c= new ArrayList<>();
		c.add(2);
		c.add("sai");
		c.add(10.2);
		ArrayDeque dq = new ArrayDeque<>(c);
		System.out.println(c);
		System.out.println(dq);
		

	}

}

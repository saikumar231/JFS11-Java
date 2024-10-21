package com.codegnan.day36;

import java.util.function.Predicate;

public class PrediacteExample {

	public static void main(String[] args) {
		Predicate<Integer> p = i->i>10;
		System.out.println(p.test(12));
		System.out.println(p.test(2));
		

	}

}

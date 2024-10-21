package com.codegnan.day37;

import java.util.function.Function;

public class FunctionSquare {

	public static void main(String[] args) {
		Function<Integer,Integer> f = n->n*n;
		System.out.println(f.apply(2));
		System.out.println(f.apply(3));

	}

}

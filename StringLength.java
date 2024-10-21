package com.codegnan.day36;

import java.util.function.Predicate;

public class StringLength {

	public static void main(String[] args) {
		
		Predicate<String> p = str->str.length()>3;
		System.out.println(p.test("codegnan"));
		System.out.println(p.test("Sa"));
		

	}

}

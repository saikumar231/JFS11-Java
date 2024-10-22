package com.codegnan.day38;

import java.util.stream.Stream;

public class StramOfMethod {

	public static void main(String[] args) {
		Stream<Integer>s= Stream.of(99,999,9999,99999);
		s.forEach(System.out::println);

	}

}

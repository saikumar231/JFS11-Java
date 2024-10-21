package com.codegnan.day37;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapExample {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList();
		for (int i = 0; i < 5; i++) {
			numbers.add(i);
		}
		System.out.println("Numbers in the List: " + numbers);

		Stream<Integer> stream = numbers.stream();
		Stream<Integer> s1 = stream.map(i -> i + 10);
		s1.forEach(System.out::println);

	}

}

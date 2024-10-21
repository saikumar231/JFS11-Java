package com.codegnan.day37;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FilterExample {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList();
		for(int i =0; i<100;i++) {
			numbers.add(i);
			
		}
		System.out.println("Elements in list: "+numbers);
		Stream<Integer>stream = numbers.stream();
		Stream<Integer>evenNumbers = stream.filter(i->i%2==0);
		evenNumbers.forEach(System.out::println);
		
	}

}

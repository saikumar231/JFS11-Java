package com.codegnan.day37;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		Function<String, Integer> f = n ->n.length();
		System.out.println(f.apply("sai"));
		System.out.println();
		Function<Integer,Integer> f1 =  i->i*i;
		Function<Integer,Integer> f2 =  i->i*i*i;
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(3));
		System.out.println();
		//consumer
		Consumer<String> c= s-> System.out.println(s);
		c.accept("Sai");
		c.accept("Sai");
		c.accept("Sai");
		c.accept("Sai");
		c.accept("Sai");


	}

}

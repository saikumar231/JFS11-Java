package com.codegnan.day35;

@FunctionalInterface
interface interf2 {

	public int square(int a);
}

public class SquareLambdaExample {

	public static void main(String[] args) {
	
		interf2 i = a -> a*a*a;
		System.out.println(i.square(5));

	}

}

package com.codegnan.day35;

@FunctionalInterface
interface interf1 {
	public void sum(int a, int b);
}

public class LambdaExample {

	public static void main(String[] args) {
		interf1 i = (a, b) -> System.out.println("sum is " + (a + b));
		i.sum(2, 2);

	}

}

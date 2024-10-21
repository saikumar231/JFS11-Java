package com.codegnan.Day29;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack stack = new Stack();
		stack.push("AAA");
		stack.push("BBB");
		stack.push("CCC");
		stack.push("DDD");
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.peek());
		System.out.println(stack.search("AAA"));
		System.out.println(stack.search("BBB"));
		System.out.println(stack.search("CCC"));
		System.out.println(stack.search("DDD"));
		

	}

}

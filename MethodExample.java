package com.codegnan.oopprogram;

public class MethodExample {

		// method without return type without parameter
	public void greet() {
		System.out.println("Hello sai Good Evening.");
	}
	// method without return type with parameter
	public void printsum(int a, int b) {
		int sum = a+b;
		System.out.println("sum is: "+sum);
	}
	// method with return type with parameter
	public int multiply(int a, int b) {
		return a*b;
	}
	// method with return type with out parameter
	public String wish(){
		return "Hello sai how are you?";
	}
	public static void main(String[] args) {
		MethodExample obj = new MethodExample();
		obj.greet();
		obj.printsum(10, 40);
		int mul = obj.multiply(10, 20);
		System.out.println(mul);
		String msg=obj.wish();
		System.out.println(msg);
	}
}

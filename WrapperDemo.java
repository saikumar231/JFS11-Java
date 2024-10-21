package com.codegnan.day27;

public class WrapperDemo {

	public static void main(String[] args) {
		// Auto Boxing.....
		int primitiveInt = 10;
		Integer wrapperInt = primitiveInt;
		System.out.println("Auto Boxing integer: "+wrapperInt);
		//Auto unboxing..
		Integer anotherWrapperInt = 20;
		Integer anotherPrimitiveInt = anotherWrapperInt ;
		System.out.println("Auto UnBoxing integer: "+anotherPrimitiveInt);

	}

}

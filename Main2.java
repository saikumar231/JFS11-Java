package com.codegnan.day23;

public class Main2 {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException e){
			System.out.println("Statement 1");
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
		}

	}

}

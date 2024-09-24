package com.codegnan.day23;

public class Main {

	public static void main(String[] args) {
		System.out.println("Statement 1");
		System.out.println("Statement 2");
		try{
			System.out.println(10/0);
		}
		catch(ArithmeticException e) { //ArithmeticException e or Exception e we can take in catch
		System.out.println("Statement 3");
		System.out.println("Statement 4");
		System.out.println("Statement 5");
		
		}
	}

}

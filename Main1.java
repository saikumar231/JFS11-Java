package com.codegnan.day23;

public class Main1 {

	public static void main(String[] args) throws ArithmeticException {
		System.out.println("Statement 1");
		try{
			System.out.println(10/0);
		}
		catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("Statement 6");
		}
		finally {
			System.out.println("Statement 4");
		}

	}

}

package com.codegnan.oopprogram;

public class Main {

	public static void main(String[] args) {
			car car1 = new car("Toyota","carmy",2020);
			car car2 = new car("Honda","Accord",2018);
			System.out.println("car1 Details : ");
			car1.displayDetails();
			System.out.println("car2 details : ");
			car2.displayDetails();

	}

}

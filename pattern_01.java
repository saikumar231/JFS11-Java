package com.codegnan.day13;

public class pattern_01 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) { // outer for loop talks about rows.
			for (int j = 0; j < 10; j++) { // inner for loop talks about columns to print *.
				System.out.print("* ");
			}
			System.out.println(); // to move the cursor to next line.
		}
	}

}

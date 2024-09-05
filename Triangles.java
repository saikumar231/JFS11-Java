package com.codegnan.day14;

public class Triangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 5;
		// outer for loop for each row
		for (int i = 0; i < 5; i++) {
			// inner for loop print spaces before stars
			for (int j = 0; j < rows - i - 1; j++) {
				// inner for loop to print stars
				System.out.print(" ");
				}
				for (int k = 0; k <= i; k++) {
					System.out.print("* ");
				}
			
			System.out.println();
		}

	}

}

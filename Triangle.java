package com.codegnan.Day18;

public class Triangle {

	public static void main(String[] args) {
		int n = 5;
		int number = 1;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print(number + " ");
				number++;
			}
			System.out.println();
		}

	}

}

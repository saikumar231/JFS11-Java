package com.codegnan.Day18;

public class palindromic_pattern {

	public static void main(String[] args) {
		int row = 5;
		for (int i = 0; i < row; i++) {
			for (int j = i; j < row; j++) {
				System.out.print("  "); 
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}

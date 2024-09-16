package com.codegnan.Day18;

public class EvenOddSum {

	public static void main(String[] args) {
		int[] numbers = { 1, 2, 3, 4, 1, 2, 6, 2, 6, 2, 7, 8, 2 };
		int oddsum = 1;
		int evensum = 0;
		for (int number : numbers) {
			if (number % 2 == 0) {
				evensum += number;
			} else {
				oddsum = oddsum + number;
			}
		}
		System.out.println("Even numbers sum in an array: " + evensum);
		System.out.println("Odd numbers sum in an array: " + oddsum);
	}

}

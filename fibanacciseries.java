package com.codegnan.day10;

import java.util.Scanner;

public class fibanacciseries {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter the number of terms in the Fibonacci series: ");
		int numberofterms = sin.nextInt();
		int firstterm = 0;
		int secondterm = 1;
		System.out.println("Fibanacci series: ");
		System.out.print(firstterm + " " + secondterm + " ");
		for (int i = 2; i < numberofterms; i++) {
			int nextterm = firstterm + secondterm;
			System.out.print( nextterm+" ");
			firstterm = secondterm;
			secondterm = nextterm;

		}

	}

}

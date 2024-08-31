package com.codegnan.day10;
public class multiplesof356 {

	public static void main(String[] args) {
		
		for (int i = 0; i <= 100; i++) {
			if (i % 3 ==0 & i % 5 ==0 && i % 6 ==0) {
				System.out.print(i + " ");
			}
		}

	}

}

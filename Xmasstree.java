package com.codegnan.day14;

public class Xmasstree {

	public static void main(String[] args) {
		int rows=5;
		for(int i=0;i<5;i++) {
			for(int j=0;j<rows-i-1;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("   | |   ");
		System.out.println(" __|_|__ ");

	}

}

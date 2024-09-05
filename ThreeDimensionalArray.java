package com.codegnan.day14.arrays;

public class ThreeDimensionalArray {

	public static void main(String[] args) {
		int[][][] a= {{{10,20,30},{40,50}},{{60},{70,80},{90,100,110}}};
		System.out.println(a[0][0][0]);
		System.out.println(a[0][0][1]);
		System.out.println(a[0][0][2]);
		System.out.println(a[0][1][0]);
		System.out.println(a[0][1][1]);
		System.out.println(a[1][0][0]);
		System.out.println(a[1][1][0]);
		System.out.println(a[1][1][1]);
		System.out.println(a[1][2][0]);
		System.out.println(a[1][2][1]);
		System.out.println(a[1][2][2]);
		System.out.println(a[1][0][2]);
	}

}

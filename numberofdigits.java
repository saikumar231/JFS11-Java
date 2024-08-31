package com.codegnan.day10;

import java.util.Scanner;

public class numberofdigits {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sin.nextInt();
		int originalnumber=number;
		int count=0;
		while(originalnumber!=0) {
			originalnumber=originalnumber/10;
			count++;
		}
		System.out.println("The number of digits in a given number "+number+" is: "+count);
	}

}

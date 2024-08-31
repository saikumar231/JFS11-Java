package com.codegnan.day10;

import java.util.Scanner;

public class addingnumbers {

	public static void main(String[] args) {
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number=sin.nextInt();
		int sum=0;
		int n1=number;
		while(n1!=0) {
			int remainder=n1%10;
			sum=sum+remainder;
			n1=n1/10;
		}
System.out.println("The sum of digits in the given number "+number+" is: "+sum);
	}

}

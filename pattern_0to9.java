package com.codegnan.day13;

public class pattern_0to9 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				//System.out.print(j + " ");// 0123456789
				//System.out.print(i+" ");//000000000 to 99999999
				//System.out.print(9-i+" "); //123456789
				//System.out.print(9-j+" "); //987654321
				//System.out.print((char)(97+j) + " ");//abcdefghij
				//System.out.print((char)(106-j) + " "); // jihgfedcba
				//System.out.print((char)(97+i) + " "); // from aaaaaaaaa to jjjjjjjjjjj
				//System.out.print((char)(106-i) + " "); // from jjjjjjjjjj to aaaaaaaaaaa
			}
			System.out.println();
		}

	}

}

package com.codegnan.day31;

import java.util.Scanner;

interface passwordChecker {
	public abstract String checkLength(String password);

	public abstract String checkComplexity(String password);

}

 class simplePasswordchecker implements passwordChecker {

	
	public String checkLength(String password) {
		return "Length: " + password.length();
	}

	public String checkComplexity(String password) {
		if (password.length() < 8) {
			return "weak";
		} else if (password.length() == 8) {
			return "Medium";
		} else {
			return "Strong";
		}

	}
}

public class CheckPassword {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String password = sin.nextLine();
		passwordChecker psw = new simplePasswordchecker();
		System.out.println(psw.checkLength(password));
		System.out.println(psw.checkComplexity(password));

	}

}

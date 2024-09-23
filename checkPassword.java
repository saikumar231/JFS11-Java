package com.codegnan.Day22;

import java.util.Scanner;

interface passwordChecker {
	public abstract String checkLength(String password);

	public abstract String checkComplexity(String password);

}

class simplePasswordCheker implements passwordChecker {

	@Override
	public String checkLength(String password) {

		return "Length: " + password.length();
	}

	@Override
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

public class checkPassword {

	public static void main(String[] args) {
		Scanner sin = new Scanner(System.in);
		System.out.println("Enter a password: ");
		String password = sin.nextLine();
		// create an instance of the simple password checker
		passwordChecker simplepasswordchecker = new simplePasswordCheker();
		System.out.println(simplepasswordchecker.checkLength(password));
		System.out.println(simplepasswordchecker.checkComplexity(password));

	}

}
